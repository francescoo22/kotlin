/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.backend.common.actualizer

import org.jetbrains.kotlin.KtDiagnosticReporterWithImplicitIrBasedContext
import org.jetbrains.kotlin.backend.common.ir.isExpect
import org.jetbrains.kotlin.backend.common.ir.isProperExpect
import org.jetbrains.kotlin.ir.IrElement
import org.jetbrains.kotlin.ir.declarations.*
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol
import org.jetbrains.kotlin.ir.symbols.IrSymbol
import org.jetbrains.kotlin.ir.types.classifierOrFail
import org.jetbrains.kotlin.ir.util.kotlinFqName
import org.jetbrains.kotlin.ir.visitors.IrElementVisitor
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid
import org.jetbrains.kotlin.ir.visitors.acceptChildrenVoid
import org.jetbrains.kotlin.name.FqName

internal class ExpectActualCollector(
    private val mainFragment: IrModuleFragment,
    private val dependentFragments: List<IrModuleFragment>,
    private val diagnosticsReporter: KtDiagnosticReporterWithImplicitIrBasedContext
) {
    fun collect(): Pair<Map<IrSymbol, IrSymbol>, Map<FqName, FqName>> {
        val result = mutableMapOf<IrSymbol, IrSymbol>()
        // Collect and link classifiers at first to make it possible to expand type aliases on the callables linking
        val (allActualDeclarations, typeAliasMap) = result.appendExpectActualClassifiersMap()
        result.appendExpectActualCallablesMap(allActualDeclarations, typeAliasMap)
        return result to typeAliasMap
    }

    private fun MutableMap<IrSymbol, IrSymbol>.appendExpectActualClassifiersMap(): Pair<Set<IrDeclaration>, Map<FqName, FqName>> {
        val actualClassifiers = mutableMapOf<FqName, IrSymbol>()
        // There is no list for builtins declarations; that's why they are being collected from typealiases
        val allActualDeclarations = mutableSetOf<IrDeclaration>()
        val typeAliasMap = mutableMapOf<FqName, FqName>() // It's used to link members from expect class that have typealias actual

        val fragmentsWithActuals = (dependentFragments.drop(1) + mainFragment)
        for (fragment in fragmentsWithActuals) {
            ActualClassifiersCollector(actualClassifiers, allActualDeclarations, typeAliasMap).visitModuleFragment(fragment, false)
        }

        val linkCollector = ClassifiersLinkCollector(this, actualClassifiers, diagnosticsReporter)
        dependentFragments.forEach { linkCollector.visitModuleFragment(it) }

        return allActualDeclarations to typeAliasMap
    }

    private fun MutableMap<IrSymbol, IrSymbol>.appendExpectActualCallablesMap(
        allActualDeclarations: Set<IrDeclaration>,
        typeAliasMap: Map<FqName, FqName>
    ) {
        val actualMembers = mutableMapOf<String, IrDeclarationBase>()

        collectActualCallables(this, actualMembers, allActualDeclarations)
        val collector = CallablesLinkCollector(this, actualMembers, typeAliasMap, diagnosticsReporter)
        dependentFragments.forEach { collector.visitModuleFragment(it) }
    }
}

private class ActualClassifiersCollector(
    private val actualClassifiers: MutableMap<FqName, IrSymbol>,
    private val allActualClassifiers: MutableSet<IrDeclaration>,
    private val typeAliasMap: MutableMap<FqName, FqName>
) : IrElementVisitor<Unit, Boolean> {
    override fun visitTypeAlias(declaration: IrTypeAlias, data: Boolean) {
        if (declaration.isActual) {
            val expandedTypeSymbol = declaration.expandedType.classifierOrFail
            actualClassifiers[declaration.kotlinFqName] = expandedTypeSymbol
            if (expandedTypeSymbol is IrClassSymbol) {
                allActualClassifiers.add(expandedTypeSymbol.owner)
                typeAliasMap[declaration.kotlinFqName] = expandedTypeSymbol.owner.kotlinFqName
            }
        }
        visitElement(declaration, data)
    }

    override fun visitClass(declaration: IrClass, data: Boolean) {
        if (!data && !declaration.isExpect) {
            actualClassifiers[declaration.kotlinFqName] = declaration.symbol
        }
        visitDeclaration(declaration, data)
    }

    override fun visitEnumEntry(declaration: IrEnumEntry, data: Boolean) {
        if (!data && !declaration.isExpect) {
            actualClassifiers[FqName.fromSegments(
                listOf(
                    declaration.parent.kotlinFqName.asString(),
                    declaration.name.asString()
                )
            )] = declaration.symbol
        }
        visitDeclaration(declaration, data)
    }

    override fun visitDeclaration(declaration: IrDeclarationBase, data: Boolean) {
        if (!data && !declaration.isExpect) {
            allActualClassifiers.add(declaration)
        }
        visitElement(declaration, data || declaration.isExpect)
    }

    override fun visitElement(element: IrElement, data: Boolean) {
        element.acceptChildren(this, data)
    }
}

private class ClassifiersLinkCollector(
    private val expectActualMap: MutableMap<IrSymbol, IrSymbol>,
    private val actualClassifiers: Map<FqName, IrSymbol>,
    private val diagnosticsReporter: KtDiagnosticReporterWithImplicitIrBasedContext
) : IrElementVisitorVoid {
    private fun addLinkOrReportMissing(expectElement: IrDeclaration, actualTypeId: FqName) {
        val actualClassifier = actualClassifiers[actualTypeId]
        if (actualClassifier != null) {
            expectActualMap[expectElement.symbol] = actualClassifier
        } else if (!expectElement.containsOptionalExpectation()) {
            diagnosticsReporter.reportMissingActual(expectElement)
        }
    }

    override fun visitClass(declaration: IrClass) {
        if (declaration.isExpect) {
            addLinkOrReportMissing(declaration, declaration.kotlinFqName)
        }
        visitElement(declaration)
    }

    override fun visitEnumEntry(declaration: IrEnumEntry) {
        if (declaration.isProperExpect) {
            addLinkOrReportMissing(
                declaration, FqName.fromSegments(listOf(declaration.parent.kotlinFqName.asString(), declaration.name.asString()))
            )
        }
        visitElement(declaration)
    }

    override fun visitElement(element: IrElement) {
        element.acceptChildrenVoid(this)
    }
}

private fun collectActualCallables(
    expectActualMap: MutableMap<IrSymbol, IrSymbol>,
    actualMembers: MutableMap<String, IrDeclarationBase>,
    allActualDeclarations: Set<IrDeclaration>,
) {
    fun collectActualsCallables(declaration: IrDeclaration) {
        when (declaration) {
            is IrFunction,
            is IrProperty -> {
                actualMembers[generateIrElementFullName(declaration, expectActualMap)] = declaration as IrDeclarationBase
            }
            is IrClass -> {
                for (member in declaration.declarations) {
                    collectActualsCallables(member)
                }
            }
        }
    }

    for (actualDeclaration in allActualDeclarations) {
        collectActualsCallables(actualDeclaration)
    }
}

private class CallablesLinkCollector(
    private val expectActualMap: MutableMap<IrSymbol, IrSymbol>,
    private val actualMembers: Map<String, IrDeclarationBase>,
    private val typeAliasMap: Map<FqName, FqName>,
    private val diagnosticsReporter: KtDiagnosticReporterWithImplicitIrBasedContext
) : IrElementVisitorVoid {
    override fun visitFunction(declaration: IrFunction) = addLink(declaration)

    override fun visitProperty(declaration: IrProperty) = addLink(declaration)

    private fun addLink(declaration: IrDeclarationBase) {
        if (!declaration.isExpect) return
        val actualMember = actualMembers[generateIrElementFullName(declaration, expectActualMap, typeAliasMap)]
        if (actualMember != null) {
            expectActualMap[declaration.symbol] = actualMember.symbol
            if (declaration is IrProperty) {
                val actualProperty = actualMember as IrProperty
                declaration.getter?.symbol?.let { expectActualMap[it] = actualProperty.getter!!.symbol }
                declaration.setter?.symbol?.let { expectActualMap[it] = actualProperty.setter!!.symbol }
            }
        } else if (!declaration.parent.containsOptionalExpectation()) {
            diagnosticsReporter.reportMissingActual(declaration)
        }
    }

    override fun visitElement(element: IrElement) {
        element.acceptChildrenVoid(this)
    }
}
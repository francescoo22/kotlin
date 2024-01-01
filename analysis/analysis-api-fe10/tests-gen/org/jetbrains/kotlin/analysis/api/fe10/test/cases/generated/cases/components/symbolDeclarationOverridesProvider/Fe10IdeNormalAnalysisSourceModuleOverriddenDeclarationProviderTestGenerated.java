/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.components.symbolDeclarationOverridesProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fe10.test.configurator.AnalysisApiFe10TestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.symbolDeclarationOverridesProvider.AbstractOverriddenDeclarationProviderTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleOverriddenDeclarationProviderTestGenerated extends AbstractOverriddenDeclarationProviderTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFe10TestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fe10,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInOverriddenSymbols() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("arraylistSubtype.kt")
    public void testArraylistSubtype() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/arraylistSubtype.kt");
    }

    @Test
    @TestMetadata("backingField.kt")
    public void testBackingField() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/backingField.kt");
    }

    @Test
    @TestMetadata("delegateOverrideWithImplicitTypeInsideAnonymousObject.kt")
    public void testDelegateOverrideWithImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/delegateOverrideWithImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("delegateOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
    public void testDelegateOverrideWithoutImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/delegateOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("inAnonymousClass.kt")
    public void testInAnonymousClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/inAnonymousClass.kt");
    }

    @Test
    @TestMetadata("inLocalClass.kt")
    public void testInLocalClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/inLocalClass.kt");
    }

    @Test
    @TestMetadata("inOtherFile.kt")
    public void testInOtherFile() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/inOtherFile.kt");
    }

    @Test
    @TestMetadata("intersectionOverride.kt")
    public void testIntersectionOverride() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverride.kt");
    }

    @Test
    @TestMetadata("intersectionOverride2.kt")
    public void testIntersectionOverride2() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverride2.kt");
    }

    @Test
    @TestMetadata("intersectionOverrideWithImplicitTypeInsideAnonymousObject.kt")
    public void testIntersectionOverrideWithImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverrideWithImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("intersectionOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
    public void testIntersectionOverrideWithoutImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("javaAccessors.kt")
    public void testJavaAccessors() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/javaAccessors.kt");
    }

    @Test
    @TestMetadata("multipleInterfaces.kt")
    public void testMultipleInterfaces() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/multipleInterfaces.kt");
    }

    @Test
    @TestMetadata("onEnumEntry.kt")
    public void testOnEnumEntry() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/onEnumEntry.kt");
    }

    @Test
    @TestMetadata("parameterWithGeneratedProperty.kt")
    public void testParameterWithGeneratedProperty() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/parameterWithGeneratedProperty.kt");
    }

    @Test
    @TestMetadata("sequenceOfOverrides.kt")
    public void testSequenceOfOverrides() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/sequenceOfOverrides.kt");
    }

    @Test
    @TestMetadata("substitutionOverrideWithImplicitTypeInsideAnonymousObject.kt")
    public void testSubstitutionOverrideWithImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverrideWithImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("substitutionOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
    public void testSubstitutionOverrideWithoutImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
    }
}

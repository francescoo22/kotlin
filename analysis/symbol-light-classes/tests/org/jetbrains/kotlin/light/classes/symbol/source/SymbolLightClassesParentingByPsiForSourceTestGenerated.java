/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.light.classes.symbol.source;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/asJava/lightClasses/lightClassByPsi")
@TestDataPath("$PROJECT_ROOT")
public class SymbolLightClassesParentingByPsiForSourceTestGenerated extends AbstractSymbolLightClassesParentingByPsiForSourceTest {
    @Test
    public void testAllFilesPresentInLightClassByPsi() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByPsi"), Pattern.compile("^(.+)\\.(kt|kts)$"), null, true);
    }

    @Test
    @TestMetadata("allowedTargets.kt")
    public void testAllowedTargets() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/allowedTargets.kt");
    }

    @Test
    @TestMetadata("annotationInAnnotationParameters.kt")
    public void testAnnotationInAnnotationParameters() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/annotationInAnnotationParameters.kt");
    }

    @Test
    @TestMetadata("annotationWithSetParamPropertyModifier.kt")
    public void testAnnotationWithSetParamPropertyModifier() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/annotationWithSetParamPropertyModifier.kt");
    }

    @Test
    @TestMetadata("annotationWithVaragArguments.kt")
    public void testAnnotationWithVaragArguments() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/annotationWithVaragArguments.kt");
    }

    @Test
    @TestMetadata("annotations.kt")
    public void testAnnotations() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/annotations.kt");
    }

    @Test
    @TestMetadata("AnnotationsOnEnumEntry.kt")
    public void testAnnotationsOnEnumEntry() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/AnnotationsOnEnumEntry.kt");
    }

    @Test
    @TestMetadata("AnnotationsWithUnresolvedAnnotations.kt")
    public void testAnnotationsWithUnresolvedAnnotations() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/AnnotationsWithUnresolvedAnnotations.kt");
    }

    @Test
    @TestMetadata("classModifiers.kt")
    public void testClassModifiers() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/classModifiers.kt");
    }

    @Test
    @TestMetadata("companionDuplication.kt")
    public void testCompanionDuplication() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/companionDuplication.kt");
    }

    @Test
    @TestMetadata("constructors.kt")
    public void testConstructors() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/constructors.kt");
    }

    @Test
    @TestMetadata("coroutines.kt")
    public void testCoroutines() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/coroutines.kt");
    }

    @Test
    @TestMetadata("dataClasses.kt")
    public void testDataClasses() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/dataClasses.kt");
    }

    @Test
    @TestMetadata("defaultMethodInKotlinWithSettingAll.kt")
    public void testDefaultMethodInKotlinWithSettingAll() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/defaultMethodInKotlinWithSettingAll.kt");
    }

    @Test
    @TestMetadata("defaultMethodInKotlinWithSettingAllCompatibility.kt")
    public void testDefaultMethodInKotlinWithSettingAllCompatibility() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/defaultMethodInKotlinWithSettingAllCompatibility.kt");
    }

    @Test
    @TestMetadata("defaultParameterValue.kt")
    public void testDefaultParameterValue() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/defaultParameterValue.kt");
    }

    @Test
    @TestMetadata("DelegatedProperty.kt")
    public void testDelegatedProperty() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/DelegatedProperty.kt");
    }

    @Test
    @TestMetadata("delegatesWithAnnotations.kt")
    public void testDelegatesWithAnnotations() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/delegatesWithAnnotations.kt");
    }

    @Test
    @TestMetadata("delegatingToInterfaces.kt")
    public void testDelegatingToInterfaces() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/delegatingToInterfaces.kt");
    }

    @Test
    @TestMetadata("dollarsInNameLocal.kt")
    public void testDollarsInNameLocal() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/dollarsInNameLocal.kt");
    }

    @Test
    @TestMetadata("enumMembers.kt")
    public void testEnumMembers() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/enumMembers.kt");
    }

    @Test
    @TestMetadata("enums.kt")
    public void testEnums() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/enums.kt");
    }

    @Test
    @TestMetadata("exposedAnonymousType.kt")
    public void testExposedAnonymousType() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/exposedAnonymousType.kt");
    }

    @Test
    @TestMetadata("fieldModifiers.kt")
    public void testFieldModifiers() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/fieldModifiers.kt");
    }

    @Test
    @TestMetadata("generics.kt")
    public void testGenerics() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/generics.kt");
    }

    @Test
    @TestMetadata("implementingKotlinCollections.kt")
    public void testImplementingKotlinCollections() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/implementingKotlinCollections.kt");
    }

    @Test
    @TestMetadata("importAliases.kt")
    public void testImportAliases() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/importAliases.kt");
    }

    @Test
    @TestMetadata("inferringAnonymousObjectTypes.kt")
    public void testInferringAnonymousObjectTypes() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/inferringAnonymousObjectTypes.kt");
    }

    @Test
    @TestMetadata("inheritance.kt")
    public void testInheritance() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/inheritance.kt");
    }

    @Test
    @TestMetadata("inlineClasses.kt")
    public void testInlineClasses() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/inlineClasses.kt");
    }

    @Test
    @TestMetadata("inlineOnly.kt")
    public void testInlineOnly() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/inlineOnly.kt");
    }

    @Test
    @TestMetadata("inlineReified.kt")
    public void testInlineReified() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/inlineReified.kt");
    }

    @Test
    @TestMetadata("jvmField.kt")
    public void testJvmField() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/jvmField.kt");
    }

    @Test
    @TestMetadata("jvmName.kt")
    public void testJvmName() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/jvmName.kt");
    }

    @Test
    @TestMetadata("jvmOverloads.kt")
    public void testJvmOverloads() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/jvmOverloads.kt");
    }

    @Test
    @TestMetadata("jvmRecord.kt")
    public void testJvmRecord() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/jvmRecord.kt");
    }

    @Test
    @TestMetadata("jvmStaticOnPropertySetter.kt")
    public void testJvmStaticOnPropertySetter() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/jvmStaticOnPropertySetter.kt");
    }

    @Test
    @TestMetadata("jvmSynthetic.kt")
    public void testJvmSynthetic() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/jvmSynthetic.kt");
    }

    @Test
    @TestMetadata("jvmSyntheticForAccessors.kt")
    public void testJvmSyntheticForAccessors() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/jvmSyntheticForAccessors.kt");
    }

    @Test
    @TestMetadata("jvmWildcardAnnotations.kt")
    public void testJvmWildcardAnnotations() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/jvmWildcardAnnotations.kt");
    }

    @Test
    @TestMetadata("LateinitProperties.kt")
    public void testLateinitProperties() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/LateinitProperties.kt");
    }

    @Test
    @TestMetadata("lateinitProperty.kt")
    public void testLateinitProperty() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/lateinitProperty.kt");
    }

    @Test
    @TestMetadata("localClassDerived.kt")
    public void testLocalClassDerived() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/localClassDerived.kt");
    }

    @Test
    @TestMetadata("objects.kt")
    public void testObjects() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/objects.kt");
    }

    @Test
    @TestMetadata("properties.kt")
    public void testProperties() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/properties.kt");
    }

    @Test
    @TestMetadata("propertyAnnotations.kt")
    public void testPropertyAnnotations() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/propertyAnnotations.kt");
    }

    @Test
    @TestMetadata("simpleFunctions.kt")
    public void testSimpleFunctions() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/simpleFunctions.kt");
    }

    @Test
    @TestMetadata("strangeIdentifiers.kt")
    public void testStrangeIdentifiers() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/strangeIdentifiers.kt");
    }

    @Test
    @TestMetadata("targetAnnotation.kt")
    public void testTargetAnnotation() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/targetAnnotation.kt");
    }

    @Test
    @TestMetadata("throwsAnnotation.kt")
    public void testThrowsAnnotation() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/throwsAnnotation.kt");
    }

    @Test
    @TestMetadata("typeAliases.kt")
    public void testTypeAliases() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/typeAliases.kt");
    }

    @Test
    @TestMetadata("typeAnnotations.kt")
    public void testTypeAnnotations() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/typeAnnotations.kt");
    }

    @Test
    @TestMetadata("typealiasInAnnotation.kt")
    public void testTypealiasInAnnotation() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/typealiasInAnnotation.kt");
    }

    @Test
    @TestMetadata("typealiasInTypeArguments.kt")
    public void testTypealiasInTypeArguments() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/typealiasInTypeArguments.kt");
    }

    @Test
    @TestMetadata("unresolvedGenericSupertypes.kt")
    public void testUnresolvedGenericSupertypes() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/unresolvedGenericSupertypes.kt");
    }

    @Test
    @TestMetadata("unresolvedWithAliasedImport.kt")
    public void testUnresolvedWithAliasedImport() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/unresolvedWithAliasedImport.kt");
    }

    @Test
    @TestMetadata("unsafePropertyInitializers.kt")
    public void testUnsafePropertyInitializers() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/unsafePropertyInitializers.kt");
    }

    @Test
    @TestMetadata("valueClassInSignature.kt")
    public void testValueClassInSignature() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/valueClassInSignature.kt");
    }

    @Test
    @TestMetadata("varargParameterWithIncompletedTypeInAnnotationPrimaryConstructor.kt")
    public void testVarargParameterWithIncompletedTypeInAnnotationPrimaryConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/varargParameterWithIncompletedTypeInAnnotationPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("varargParameterWithIncompletedTypeInPrimaryConstructor.kt")
    public void testVarargParameterWithIncompletedTypeInPrimaryConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/varargParameterWithIncompletedTypeInPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("varargParameterWithoutTypeInAnnotationPrimaryConstructor.kt")
    public void testVarargParameterWithoutTypeInAnnotationPrimaryConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/varargParameterWithoutTypeInAnnotationPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("varargParameterWithoutTypeInPrimaryConstructor.kt")
    public void testVarargParameterWithoutTypeInPrimaryConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/varargParameterWithoutTypeInPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("varargPropertyWithIncompletedTypeInAnnotationPrimaryConstructor.kt")
    public void testVarargPropertyWithIncompletedTypeInAnnotationPrimaryConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/varargPropertyWithIncompletedTypeInAnnotationPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("varargPropertyWithIncompletedTypeInPrimaryConstructor.kt")
    public void testVarargPropertyWithIncompletedTypeInPrimaryConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/varargPropertyWithIncompletedTypeInPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("varargPropertyWithoutTypeInAnnotationPrimaryConstructor.kt")
    public void testVarargPropertyWithoutTypeInAnnotationPrimaryConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/varargPropertyWithoutTypeInAnnotationPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("varargPropertyWithoutTypeInPrimaryConstructor.kt")
    public void testVarargPropertyWithoutTypeInPrimaryConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/varargPropertyWithoutTypeInPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("wildcardOptimization.kt")
    public void testWildcardOptimization() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/wildcardOptimization.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByPsi/facades")
    @TestDataPath("$PROJECT_ROOT")
    public class Facades {
        @Test
        public void testAllFilesPresentInFacades() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByPsi/facades"), Pattern.compile("^(.+)\\.(kt|kts)$"), null, true);
        }

        @Test
        @TestMetadata("coroutines.kt")
        public void testCoroutines() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/coroutines.kt");
        }

        @Test
        @TestMetadata("importAliases.kt")
        public void testImportAliases() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/importAliases.kt");
        }

        @Test
        @TestMetadata("inlineOnly.kt")
        public void testInlineOnly() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/inlineOnly.kt");
        }

        @Test
        @TestMetadata("jvmField.kt")
        public void testJvmField() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/jvmField.kt");
        }

        @Test
        @TestMetadata("jvmName.kt")
        public void testJvmName() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/jvmName.kt");
        }

        @Test
        @TestMetadata("jvmWildcardAnnotations.kt")
        public void testJvmWildcardAnnotations() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/jvmWildcardAnnotations.kt");
        }

        @Test
        @TestMetadata("lateinitProperty.kt")
        public void testLateinitProperty() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/lateinitProperty.kt");
        }

        @Test
        @TestMetadata("multifileFacade.kt")
        public void testMultifileFacade() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/multifileFacade.kt");
        }

        @Test
        @TestMetadata("multifileFacadeJvmName.kt")
        public void testMultifileFacadeJvmName() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/multifileFacadeJvmName.kt");
        }

        @Test
        @TestMetadata("properties.kt")
        public void testProperties() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/properties.kt");
        }

        @Test
        @TestMetadata("reifiedInlineReturnsObject.kt")
        public void testReifiedInlineReturnsObject() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/reifiedInlineReturnsObject.kt");
        }

        @Test
        @TestMetadata("simpleFunctions.kt")
        public void testSimpleFunctions() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/simpleFunctions.kt");
        }

        @Test
        @TestMetadata("throwsAnnotation.kt")
        public void testThrowsAnnotation() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/throwsAnnotation.kt");
        }

        @Test
        @TestMetadata("valueClassInSignature.kt")
        public void testValueClassInSignature() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/valueClassInSignature.kt");
        }

        @Test
        @TestMetadata("varargParameterWithIncompletedType.kt")
        public void testVarargParameterWithIncompletedType() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/varargParameterWithIncompletedType.kt");
        }

        @Test
        @TestMetadata("varargParameterWithoutType.kt")
        public void testVarargParameterWithoutType() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/varargParameterWithoutType.kt");
        }

        @Test
        @TestMetadata("wildcardOptimization.kt")
        public void testWildcardOptimization() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/facades/wildcardOptimization.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByPsi/scripts")
    @TestDataPath("$PROJECT_ROOT")
    public class Scripts {
        @Test
        public void testAllFilesPresentInScripts() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByPsi/scripts"), Pattern.compile("^(.+)\\.(kt|kts)$"), null, true);
        }

        @Test
        @TestMetadata("FunsPropsAndFields.kts")
        public void testFunsPropsAndFields() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/scripts/FunsPropsAndFields.kts");
        }

        @Test
        @TestMetadata("HelloWorld.kts")
        public void testHelloWorld() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/scripts/HelloWorld.kts");
        }

        @Test
        @TestMetadata("InnerClasses.kts")
        public void testInnerClasses() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByPsi/scripts/InnerClasses.kts");
        }
    }
}

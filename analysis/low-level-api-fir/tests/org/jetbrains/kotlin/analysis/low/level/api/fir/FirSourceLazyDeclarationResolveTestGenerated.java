/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testdata/lazyResolve")
@TestDataPath("$PROJECT_ROOT")
public class FirSourceLazyDeclarationResolveTestGenerated extends AbstractFirSourceLazyDeclarationResolveTest {
    @Test
    public void testAllFilesPresentInLazyResolve() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testdata/lazyResolve"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("annotationClassWithJavaTarget.kt")
    public void testAnnotationClassWithJavaTarget() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/annotationClassWithJavaTarget.kt");
    }

    @Test
    @TestMetadata("annotationFromImplicitJavaType.kt")
    public void testAnnotationFromImplicitJavaType() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/annotationFromImplicitJavaType.kt");
    }

    @Test
    @TestMetadata("annotationFromImplicitJavaTypeWithJavaAnnotation.kt")
    public void testAnnotationFromImplicitJavaTypeWithJavaAnnotation() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/annotationFromImplicitJavaTypeWithJavaAnnotation.kt");
    }

    @Test
    @TestMetadata("annotationOnLocalClass.kt")
    public void testAnnotationOnLocalClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/annotationOnLocalClass.kt");
    }

    @Test
    @TestMetadata("annotationParameters.kt")
    public void testAnnotationParameters() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/annotationParameters.kt");
    }

    @Test
    @TestMetadata("annotationWithTypeArgument.kt")
    public void testAnnotationWithTypeArgument() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/annotationWithTypeArgument.kt");
    }

    @Test
    @TestMetadata("annotations.kt")
    public void testAnnotations() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/annotations.kt");
    }

    @Test
    @TestMetadata("classMembers.kt")
    public void testClassMembers() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/classMembers.kt");
    }

    @Test
    @TestMetadata("compilerRequiredAnnotationOnLocalClass.kt")
    public void testCompilerRequiredAnnotationOnLocalClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/compilerRequiredAnnotationOnLocalClass.kt");
    }

    @Test
    @TestMetadata("complexLocalHierarchy.kt")
    public void testComplexLocalHierarchy() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/complexLocalHierarchy.kt");
    }

    @Test
    @TestMetadata("cyclicHierarchy.kt")
    public void testCyclicHierarchy() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/cyclicHierarchy.kt");
    }

    @Test
    @TestMetadata("cyclicHierarchy2.kt")
    public void testCyclicHierarchy2() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/cyclicHierarchy2.kt");
    }

    @Test
    @TestMetadata("cyclicHierarchy3.kt")
    public void testCyclicHierarchy3() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/cyclicHierarchy3.kt");
    }

    @Test
    @TestMetadata("cyclicNestedHierarchy.kt")
    public void testCyclicNestedHierarchy() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/cyclicNestedHierarchy.kt");
    }

    @Test
    @TestMetadata("cyclicNestedHierarchy2.kt")
    public void testCyclicNestedHierarchy2() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/cyclicNestedHierarchy2.kt");
    }

    @Test
    @TestMetadata("dataClassCopy.kt")
    public void testDataClassCopy() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/dataClassCopy.kt");
    }

    @Test
    @TestMetadata("dataComponent2.kt")
    public void testDataComponent2() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/dataComponent2.kt");
    }

    @Test
    @TestMetadata("delegatedField.kt")
    public void testDelegatedField() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/delegatedField.kt");
    }

    @Test
    @TestMetadata("delegates.kt")
    public void testDelegates() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/delegates.kt");
    }

    @Test
    @TestMetadata("enumEntries.kt")
    public void testEnumEntries() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/enumEntries.kt");
    }

    @Test
    @TestMetadata("enumEntry.kt")
    public void testEnumEntry() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/enumEntry.kt");
    }

    @Test
    @TestMetadata("enumValueOf.kt")
    public void testEnumValueOf() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/enumValueOf.kt");
    }

    @Test
    @TestMetadata("enumValues.kt")
    public void testEnumValues() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/enumValues.kt");
    }

    @Test
    @TestMetadata("fakeOverride.kt")
    public void testFakeOverride() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/fakeOverride.kt");
    }

    @Test
    @TestMetadata("fakePrimaryConstructor.kt")
    public void testFakePrimaryConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/fakePrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("fromLocalHierarchyToOuter.kt")
    public void testFromLocalHierarchyToOuter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/fromLocalHierarchyToOuter.kt");
    }

    @Test
    @TestMetadata("functionWithParameter.kt")
    public void testFunctionWithParameter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/functionWithParameter.kt");
    }

    @Test
    @TestMetadata("lambdaAsSAMInterface.kt")
    public void testLambdaAsSAMInterface() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/lambdaAsSAMInterface.kt");
    }

    @Test
    @TestMetadata("lazyProperty.kt")
    public void testLazyProperty() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/lazyProperty.kt");
    }

    @Test
    @TestMetadata("parameterOfNonLocalSetter.kt")
    public void testParameterOfNonLocalSetter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/parameterOfNonLocalSetter.kt");
    }

    @Test
    @TestMetadata("parameterOfTopSetter.kt")
    public void testParameterOfTopSetter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/parameterOfTopSetter.kt");
    }

    @Test
    @TestMetadata("primaryConstructor.kt")
    public void testPrimaryConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/primaryConstructor.kt");
    }

    @Test
    @TestMetadata("primaryConstructorParameter.kt")
    public void testPrimaryConstructorParameter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/primaryConstructorParameter.kt");
    }

    @Test
    @TestMetadata("primaryConstructorProperty.kt")
    public void testPrimaryConstructorProperty() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/primaryConstructorProperty.kt");
    }

    @Test
    @TestMetadata("propertyWithGetter.kt")
    public void testPropertyWithGetter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/propertyWithGetter.kt");
    }

    @Test
    @TestMetadata("propertyWithGetterAndSetter.kt")
    public void testPropertyWithGetterAndSetter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/propertyWithGetterAndSetter.kt");
    }

    @Test
    @TestMetadata("propertyWithInitializer.kt")
    public void testPropertyWithInitializer() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/propertyWithInitializer.kt");
    }

    @Test
    @TestMetadata("resolveSuperTypeFromLocalClass.kt")
    public void testResolveSuperTypeFromLocalClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/resolveSuperTypeFromLocalClass.kt");
    }

    @Test
    @TestMetadata("resolveTypeFromLocalClassConstructor.kt")
    public void testResolveTypeFromLocalClassConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/resolveTypeFromLocalClassConstructor.kt");
    }

    @Test
    @TestMetadata("resolveTypeFromLocalFunction.kt")
    public void testResolveTypeFromLocalFunction() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/resolveTypeFromLocalFunction.kt");
    }

    @Test
    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/secondaryConstructor.kt");
    }

    @Test
    @TestMetadata("secondaryConstructorParameter.kt")
    public void testSecondaryConstructorParameter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/secondaryConstructorParameter.kt");
    }

    @Test
    @TestMetadata("superTypes.kt")
    public void testSuperTypes() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/superTypes.kt");
    }

    @Test
    @TestMetadata("superTypesLoop.kt")
    public void testSuperTypesLoop() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/superTypesLoop.kt");
    }

    @Test
    @TestMetadata("topLevelFunctions.kt")
    public void testTopLevelFunctions() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/topLevelFunctions.kt");
    }

    @Test
    @TestMetadata("topLevelFunctionsWithExpressionBodyAndExplicitType.kt")
    public void testTopLevelFunctionsWithExpressionBodyAndExplicitType() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/topLevelFunctionsWithExpressionBodyAndExplicitType.kt");
    }

    @Test
    @TestMetadata("topLevelFunctionsWithImplicitType.kt")
    public void testTopLevelFunctionsWithImplicitType() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/topLevelFunctionsWithImplicitType.kt");
    }

    @Test
    @TestMetadata("typeParameterBounds.kt")
    public void testTypeParameterBounds() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/typeParameterBounds.kt");
    }

    @Test
    @TestMetadata("typeParameterOfClass.kt")
    public void testTypeParameterOfClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/typeParameterOfClass.kt");
    }

    @Test
    @TestMetadata("typeParameterOfNonLocalFunction.kt")
    public void testTypeParameterOfNonLocalFunction() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/typeParameterOfNonLocalFunction.kt");
    }

    @Test
    @TestMetadata("typeParameterOfTopFunction.kt")
    public void testTypeParameterOfTopFunction() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/typeParameterOfTopFunction.kt");
    }

    @Test
    @TestMetadata("typeParameterOfTopSetter.kt")
    public void testTypeParameterOfTopSetter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/typeParameterOfTopSetter.kt");
    }

    @Test
    @TestMetadata("typeParameterOfTypeAlias.kt")
    public void testTypeParameterOfTypeAlias() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/lazyResolve/typeParameterOfTypeAlias.kt");
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testdata/lazyResolve/classes")
    @TestDataPath("$PROJECT_ROOT")
    public class Classes {
        @Test
        public void testAllFilesPresentInClasses() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testdata/lazyResolve/classes"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("annotationWithTarget.kt")
        public void testAnnotationWithTarget() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/classes/annotationWithTarget.kt");
        }

        @Test
        @TestMetadata("classWithTypeParameters.kt")
        public void testClassWithTypeParameters() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/classes/classWithTypeParameters.kt");
        }

        @Test
        @TestMetadata("functionInValueClass.kt")
        public void testFunctionInValueClass() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/classes/functionInValueClass.kt");
        }

        @Test
        @TestMetadata("nestedClassWithPropertiesOverrides.kt")
        public void testNestedClassWithPropertiesOverrides() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/classes/nestedClassWithPropertiesOverrides.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testdata/lazyResolve/errors")
    @TestDataPath("$PROJECT_ROOT")
    public class Errors {
        @Test
        public void testAllFilesPresentInErrors() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testdata/lazyResolve/errors"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("anonymousObjectInInvalidPosition.kt")
        public void testAnonymousObjectInInvalidPosition() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/errors/anonymousObjectInInvalidPosition.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testdata/lazyResolve/functions")
    @TestDataPath("$PROJECT_ROOT")
    public class Functions {
        @Test
        public void testAllFilesPresentInFunctions() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testdata/lazyResolve/functions"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("functionCallWithGenericResult.kt")
        public void testFunctionCallWithGenericResult() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/functions/functionCallWithGenericResult.kt");
        }

        @Test
        @TestMetadata("functionParameter.kt")
        public void testFunctionParameter() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/functions/functionParameter.kt");
        }

        @Test
        @TestMetadata("functionWithGenericExpectedTypeInside.kt")
        public void testFunctionWithGenericExpectedTypeInside() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/functions/functionWithGenericExpectedTypeInside.kt");
        }

        @Test
        @TestMetadata("functionWithTypeParameters.kt")
        public void testFunctionWithTypeParameters() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/functions/functionWithTypeParameters.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testdata/lazyResolve/properties")
    @TestDataPath("$PROJECT_ROOT")
    public class Properties {
        @Test
        public void testAllFilesPresentInProperties() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testdata/lazyResolve/properties"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("propertyGetterWithExplicitType.kt")
        public void testPropertyGetterWithExplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/properties/propertyGetterWithExplicitType.kt");
        }

        @Test
        @TestMetadata("propertyGetterWithExplicitTypeAndBody.kt")
        public void testPropertyGetterWithExplicitTypeAndBody() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/properties/propertyGetterWithExplicitTypeAndBody.kt");
        }

        @Test
        @TestMetadata("propertyGetterWithImplicitType.kt")
        public void testPropertyGetterWithImplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/properties/propertyGetterWithImplicitType.kt");
        }

        @Test
        @TestMetadata("propertySetter.kt")
        public void testPropertySetter() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/properties/propertySetter.kt");
        }

        @Test
        @TestMetadata("propertyWithTypeParameters.kt")
        public void testPropertyWithTypeParameters() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/properties/propertyWithTypeParameters.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testdata/lazyResolve/typeAliases")
    @TestDataPath("$PROJECT_ROOT")
    public class TypeAliases {
        @Test
        public void testAllFilesPresentInTypeAliases() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testdata/lazyResolve/typeAliases"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("typeAliasWithTypeParameters.kt")
        public void testTypeAliasWithTypeParameters() throws Exception {
            runTest("analysis/low-level-api-fir/testdata/lazyResolve/typeAliases/typeAliasWithTypeParameters.kt");
        }
    }
}

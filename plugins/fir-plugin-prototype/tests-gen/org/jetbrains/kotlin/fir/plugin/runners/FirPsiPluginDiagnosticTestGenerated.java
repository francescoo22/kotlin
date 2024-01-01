/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.plugin.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics")
@TestDataPath("$PROJECT_ROOT")
public class FirPsiPluginDiagnosticTestGenerated extends AbstractFirPsiPluginDiagnosticTest {
    @Test
    public void testAllFilesPresentInDiagnostics() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Nested
    @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/checkers")
    @TestDataPath("$PROJECT_ROOT")
    public class Checkers {
        @Test
        public void testAllFilesPresentInCheckers() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/checkers"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("dependencyWithoutAttributePlugin.kt")
        public void testDependencyWithoutAttributePlugin() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/dependencyWithoutAttributePlugin.kt");
        }

        @Test
        @TestMetadata("importsWithGeneratedDeclarations.kt")
        public void testImportsWithGeneratedDeclarations() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/importsWithGeneratedDeclarations.kt");
        }

        @Test
        @TestMetadata("mixingComposableAndNormalFunctions.kt")
        public void testMixingComposableAndNormalFunctions() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/mixingComposableAndNormalFunctions.kt");
        }

        @Test
        @TestMetadata("signedNumbersCheckers.kt")
        public void testSignedNumbersCheckers() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/signedNumbersCheckers.kt");
        }

        @Test
        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/simple.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes")
    @TestDataPath("$PROJECT_ROOT")
    public class FunctionalTypes {
        @Test
        public void testAllFilesPresentInFunctionalTypes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("ambigousKinds.kt")
        public void testAmbigousKinds() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes/ambigousKinds.kt");
        }

        @Test
        @TestMetadata("dependencyWithoutFunctionalKindPlugin.kt")
        public void testDependencyWithoutFunctionalKindPlugin() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes/dependencyWithoutFunctionalKindPlugin.kt");
        }

        @Test
        @TestMetadata("inference.kt")
        public void testInference() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes/inference.kt");
        }

        @Test
        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes/simple.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/memberGen")
    @TestDataPath("$PROJECT_ROOT")
    public class MemberGen {
        @Test
        public void testAllFilesPresentInMemberGen() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/memberGen"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("classWithCompanionObject.kt")
        public void testClassWithCompanionObject() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/memberGen/classWithCompanionObject.kt");
        }

        @Test
        @TestMetadata("classWithGeneratedMembersAndNestedClass.kt")
        public void testClassWithGeneratedMembersAndNestedClass() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/memberGen/classWithGeneratedMembersAndNestedClass.kt");
        }

        @Test
        @TestMetadata("generatedClassWithMembersAndNestedClasses.kt")
        public void testGeneratedClassWithMembersAndNestedClasses() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/memberGen/generatedClassWithMembersAndNestedClasses.kt");
        }

        @Test
        @TestMetadata("localClassWithCompanionObject.kt")
        public void testLocalClassWithCompanionObject() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/memberGen/localClassWithCompanionObject.kt");
        }

        @Test
        @TestMetadata("topLevelCallables.kt")
        public void testTopLevelCallables() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/memberGen/topLevelCallables.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/receivers")
    @TestDataPath("$PROJECT_ROOT")
    public class Receivers {
        @Test
        public void testAllFilesPresentInReceivers() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/receivers"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("receiverInjection.kt")
        public void testReceiverInjection() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/receivers/receiverInjection.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/status")
    @TestDataPath("$PROJECT_ROOT")
    public class Status {
        @Test
        public void testAllFilesPresentInStatus() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/status"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("metaAnnotation.kt")
        public void testMetaAnnotation() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/status/metaAnnotation.kt");
        }

        @Test
        @TestMetadata("metaAnnotationClashesWithSupertype.kt")
        public void testMetaAnnotationClashesWithSupertype() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/status/metaAnnotationClashesWithSupertype.kt");
        }

        @Test
        @TestMetadata("simpleAnnotation.kt")
        public void testSimpleAnnotation() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/status/simpleAnnotation.kt");
        }

        @Test
        @TestMetadata("visibilityTransformation.kt")
        public void testVisibilityTransformation() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/status/visibilityTransformation.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/supertypes")
    @TestDataPath("$PROJECT_ROOT")
    public class Supertypes {
        @Test
        public void testAllFilesPresentInSupertypes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/supertypes"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("metaAnnotationOrder.kt")
        public void testMetaAnnotationOrder() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/supertypes/metaAnnotationOrder.kt");
        }

        @Test
        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/supertypes/simple.kt");
        }

        @Test
        @TestMetadata("supertypeWithArgument.kt")
        public void testSupertypeWithArgument() throws Exception {
            runTest("plugins/fir-plugin-prototype/testData/diagnostics/supertypes/supertypeWithArgument.kt");
        }
    }
}

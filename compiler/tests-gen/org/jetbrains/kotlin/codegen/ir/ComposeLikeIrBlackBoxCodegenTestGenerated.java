/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/composeLike")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ComposeLikeIrBlackBoxCodegenTestGenerated extends AbstractComposeLikeIrBlackBoxCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInComposeLike() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/composeLike"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("default.kt")
    public void testDefault() throws Exception {
        runTest("compiler/testData/codegen/composeLike/default.kt");
    }

    @TestMetadata("defaultInline.kt")
    public void testDefaultInline() throws Exception {
        runTest("compiler/testData/codegen/composeLike/defaultInline.kt");
    }

    @TestMetadata("defaultLocal.kt")
    public void testDefaultLocal() throws Exception {
        runTest("compiler/testData/codegen/composeLike/defaultLocal.kt");
    }
}

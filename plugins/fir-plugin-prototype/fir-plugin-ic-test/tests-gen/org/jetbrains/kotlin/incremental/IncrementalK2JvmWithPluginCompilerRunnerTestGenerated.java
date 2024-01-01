/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/fir-plugin-prototype/fir-plugin-ic-test/testData/pureKotlin")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalK2JvmWithPluginCompilerRunnerTestGenerated extends AbstractIncrementalK2JvmWithPluginCompilerRunnerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    @TestMetadata("addMethodToGeneratedClass")
    public void testAddMethodToGeneratedClass() throws Exception {
        runTest("plugins/fir-plugin-prototype/fir-plugin-ic-test/testData/pureKotlin/addMethodToGeneratedClass/");
    }

    @TestMetadata("addMethodToGeneratedSupertype")
    public void testAddMethodToGeneratedSupertype() throws Exception {
        runTest("plugins/fir-plugin-prototype/fir-plugin-ic-test/testData/pureKotlin/addMethodToGeneratedSupertype/");
    }

    @TestMetadata("addNewSerializableClass")
    public void testAddNewSerializableClass() throws Exception {
        runTest("plugins/fir-plugin-prototype/fir-plugin-ic-test/testData/pureKotlin/addNewSerializableClass/");
    }

    public void testAllFilesPresentInPureKotlin() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/fir-plugin-ic-test/testData/pureKotlin"), Pattern.compile("^([^\\.]+)$"), null, TargetBackend.JVM_IR, false);
    }

    @TestMetadata("generateNewTopLevelFunction")
    public void testGenerateNewTopLevelFunction() throws Exception {
        runTest("plugins/fir-plugin-prototype/fir-plugin-ic-test/testData/pureKotlin/generateNewTopLevelFunction/");
    }
}

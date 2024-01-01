/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jps.build;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.jps.GenerateJpsPluginTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("jps/jps-plugin/testData/incremental/lookupTracker/jsKlib")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JsKlibLookupTrackerTestGenerated extends AbstractJsKlibLookupTrackerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInJsKlib() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/lookupTracker/jsKlib"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @TestMetadata("classifierMembers")
    public void testClassifierMembers() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/lookupTracker/jsKlib/classifierMembers/");
    }

    @TestMetadata("conventions")
    public void testConventions() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/lookupTracker/jsKlib/conventions/");
    }

    @TestMetadata("expressionType")
    public void testExpressionType() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/lookupTracker/jsKlib/expressionType/");
    }

    @TestMetadata("localDeclarations")
    public void testLocalDeclarations() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/lookupTracker/jsKlib/localDeclarations/");
    }

    @TestMetadata("packageDeclarations")
    public void testPackageDeclarations() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/lookupTracker/jsKlib/packageDeclarations/");
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/lookupTracker/jsKlib/simple/");
    }
}

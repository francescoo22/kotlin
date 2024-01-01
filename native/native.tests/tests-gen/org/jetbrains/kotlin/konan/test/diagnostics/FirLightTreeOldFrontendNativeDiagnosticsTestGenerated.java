/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.diagnostics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.FirPipeline;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/nativeTests")
@TestDataPath("$PROJECT_ROOT")
@Tag("frontend-fir")
@FirPipeline()
public class FirLightTreeOldFrontendNativeDiagnosticsTestGenerated extends AbstractFirLightTreeNativeDiagnosticsTest {
    @Test
    public void testAllFilesPresentInNativeTests() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
    }

    @Test
    @TestMetadata("arrays_after.kt")
    public void testArrays_after() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/arrays_after.kt");
    }

    @Test
    @TestMetadata("cloneableInNative.kt")
    public void testCloneableInNative() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/cloneableInNative.kt");
    }

    @Test
    @TestMetadata("forwardDeclarations.kt")
    public void testForwardDeclarations() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/forwardDeclarations.kt");
    }

    @Test
    @TestMetadata("identifiers.kt")
    public void testIdentifiers() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/identifiers.kt");
    }

    @Test
    @TestMetadata("isInitialized.kt")
    public void testIsInitialized() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/isInitialized.kt");
    }

    @Test
    @TestMetadata("isInitializedError.kt")
    public void testIsInitializedError() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/isInitializedError.kt");
    }

    @Test
    @TestMetadata("nativeProtectedFunCall.kt")
    public void testNativeProtectedFunCall() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/nativeProtectedFunCall.kt");
    }

    @Test
    @TestMetadata("objCName.kt")
    public void testObjCName() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/objCName.kt");
    }

    @Test
    @TestMetadata("objCRefinement.kt")
    public void testObjCRefinement() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/objCRefinement.kt");
    }

    @Test
    @TestMetadata("sharedImmutable.kt")
    public void testSharedImmutable() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/sharedImmutable.kt");
    }

    @Test
    @TestMetadata("stdClassAndTypealiasAmbiguity.kt")
    public void testStdClassAndTypealiasAmbiguity() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/stdClassAndTypealiasAmbiguity.kt");
    }

    @Test
    @TestMetadata("threadLocal.kt")
    public void testThreadLocal() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/threadLocal.kt");
    }

    @Test
    @TestMetadata("throws.kt")
    public void testThrows() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/throws.kt");
    }

    @Test
    @TestMetadata("throwsClash.kt")
    public void testThrowsClash() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/throwsClash.kt");
    }

    @Test
    @TestMetadata("topLevelSingleton.kt")
    public void testTopLevelSingleton() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/topLevelSingleton.kt");
    }
}

/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/errorResistance")
@TestDataPath("$PROJECT_ROOT")
public class ErrorResistanceTestGenerated extends AbstractErrorResistanceTest {
    @Test
    public void testAllFilesPresentInErrorResistance() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/errorResistance"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("builderInference.kt")
    public void testBuilderInference() throws Exception {
        runTest("analysis/low-level-api-fir/testData/errorResistance/builderInference.kt");
    }

    @Test
    @TestMetadata("propertyDelegate.kt")
    public void testPropertyDelegate() throws Exception {
        runTest("analysis/low-level-api-fir/testData/errorResistance/propertyDelegate.kt");
    }

    @Test
    @TestMetadata("propertyInitializer.kt")
    public void testPropertyInitializer() throws Exception {
        runTest("analysis/low-level-api-fir/testData/errorResistance/propertyInitializer.kt");
    }
}

/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
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
@TestMetadata("analysis/low-level-api-fir/testData/fileBasedDeclarationProvider")
@TestDataPath("$PROJECT_ROOT")
public class ScriptFileBasedKotlinDeclarationProviderTestGenerated extends AbstractScriptFileBasedKotlinDeclarationProviderTest {
    @Test
    public void testAllFilesPresentInFileBasedDeclarationProvider() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/fileBasedDeclarationProvider"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
    }

    @Test
    @TestMetadata("script.kts")
    public void testScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/fileBasedDeclarationProvider/script.kts");
    }
}

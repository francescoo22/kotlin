/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.lombok;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/lombok/testData/box")
@TestDataPath("$PROJECT_ROOT")
public class IrBlackBoxCodegenTestForLombokGenerated extends AbstractIrBlackBoxCodegenTestForLombok {
    @Test
    @TestMetadata("accessorsStripPrefix.kt")
    public void testAccessorsStripPrefix() throws Exception {
        runTest("plugins/lombok/testData/box/accessorsStripPrefix.kt");
    }

    @Test
    @TestMetadata("accessorsStripPrefixConfig.kt")
    public void testAccessorsStripPrefixConfig() throws Exception {
        runTest("plugins/lombok/testData/box/accessorsStripPrefixConfig.kt");
    }

    @Test
    @TestMetadata("allArgsConstructor.kt")
    public void testAllArgsConstructor() throws Exception {
        runTest("plugins/lombok/testData/box/allArgsConstructor.kt");
    }

    @Test
    @TestMetadata("allArgsConstructorInference.kt")
    public void testAllArgsConstructorInference() throws Exception {
        runTest("plugins/lombok/testData/box/allArgsConstructorInference.kt");
    }

    @Test
    @TestMetadata("allArgsConstructorStatic.kt")
    public void testAllArgsConstructorStatic() throws Exception {
        runTest("plugins/lombok/testData/box/allArgsConstructorStatic.kt");
    }

    @Test
    public void testAllFilesPresentInBox() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/lombok/testData/box"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @Test
    @TestMetadata("builder.kt")
    public void testBuilder() throws Exception {
        runTest("plugins/lombok/testData/box/builder.kt");
    }

    @Test
    @TestMetadata("builderGuava.kt")
    public void testBuilderGuava() throws Exception {
        runTest("plugins/lombok/testData/box/builderGuava.kt");
    }

    @Test
    @TestMetadata("builderRawSingular.kt")
    public void testBuilderRawSingular() throws Exception {
        runTest("plugins/lombok/testData/box/builderRawSingular.kt");
    }

    @Test
    @TestMetadata("builderSingular.kt")
    public void testBuilderSingular() throws Exception {
        runTest("plugins/lombok/testData/box/builderSingular.kt");
    }

    @Test
    @TestMetadata("configAccessors.kt")
    public void testConfigAccessors() throws Exception {
        runTest("plugins/lombok/testData/box/configAccessors.kt");
    }

    @Test
    @TestMetadata("configAccessorsOverride.kt")
    public void testConfigAccessorsOverride() throws Exception {
        runTest("plugins/lombok/testData/box/configAccessorsOverride.kt");
    }

    @Test
    @TestMetadata("configCaseInsensitive.kt")
    public void testConfigCaseInsensitive() throws Exception {
        runTest("plugins/lombok/testData/box/configCaseInsensitive.kt");
    }

    @Test
    @TestMetadata("configSimple.kt")
    public void testConfigSimple() throws Exception {
        runTest("plugins/lombok/testData/box/configSimple.kt");
    }

    @Test
    @TestMetadata("data.kt")
    public void testData() throws Exception {
        runTest("plugins/lombok/testData/box/data.kt");
    }

    @Test
    @TestMetadata("genericsAccessors.kt")
    public void testGenericsAccessors() throws Exception {
        runTest("plugins/lombok/testData/box/genericsAccessors.kt");
    }

    @Test
    @TestMetadata("genericsConstructors.kt")
    public void testGenericsConstructors() throws Exception {
        runTest("plugins/lombok/testData/box/genericsConstructors.kt");
    }

    @Test
    @TestMetadata("genericsConstructorsStatic.kt")
    public void testGenericsConstructorsStatic() throws Exception {
        runTest("plugins/lombok/testData/box/genericsConstructorsStatic.kt");
    }

    @Test
    @TestMetadata("gettersFluent.kt")
    public void testGettersFluent() throws Exception {
        runTest("plugins/lombok/testData/box/gettersFluent.kt");
    }

    @Test
    @TestMetadata("noArgsConstructor.kt")
    public void testNoArgsConstructor() throws Exception {
        runTest("plugins/lombok/testData/box/noArgsConstructor.kt");
    }

    @Test
    @TestMetadata("noArgsConstructorStatic.kt")
    public void testNoArgsConstructorStatic() throws Exception {
        runTest("plugins/lombok/testData/box/noArgsConstructorStatic.kt");
    }

    @Test
    @TestMetadata("nullability.kt")
    public void testNullability() throws Exception {
        runTest("plugins/lombok/testData/box/nullability.kt");
    }

    @Test
    @TestMetadata("propertyFromSuper.kt")
    public void testPropertyFromSuper() throws Exception {
        runTest("plugins/lombok/testData/box/propertyFromSuper.kt");
    }

    @Test
    @TestMetadata("requiredArgsConstructor.kt")
    public void testRequiredArgsConstructor() throws Exception {
        runTest("plugins/lombok/testData/box/requiredArgsConstructor.kt");
    }

    @Test
    @TestMetadata("requiredArgsConstructorStatic.kt")
    public void testRequiredArgsConstructorStatic() throws Exception {
        runTest("plugins/lombok/testData/box/requiredArgsConstructorStatic.kt");
    }

    @Test
    @TestMetadata("settersVariations.kt")
    public void testSettersVariations() throws Exception {
        runTest("plugins/lombok/testData/box/settersVariations.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("plugins/lombok/testData/box/simple.kt");
    }

    @Test
    @TestMetadata("value.kt")
    public void testValue() throws Exception {
        runTest("plugins/lombok/testData/box/value.kt");
    }

    @Test
    @TestMetadata("valueFieldAccess.kt")
    public void testValueFieldAccess() throws Exception {
        runTest("plugins/lombok/testData/box/valueFieldAccess.kt");
    }

    @Test
    @TestMetadata("with.kt")
    public void testWith() throws Exception {
        runTest("plugins/lombok/testData/box/with.kt");
    }

    @Test
    @TestMetadata("withBooleanField.kt")
    public void testWithBooleanField() throws Exception {
        runTest("plugins/lombok/testData/box/withBooleanField.kt");
    }
}

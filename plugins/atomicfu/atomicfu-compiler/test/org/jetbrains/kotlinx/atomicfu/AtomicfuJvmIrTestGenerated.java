/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlinx.atomicfu;

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
@TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box")
@TestDataPath("$PROJECT_ROOT")
public class AtomicfuJvmIrTestGenerated extends AbstractAtomicfuJvmIrTest {
    @Test
    public void testAllFilesPresentInBox() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @Nested
    @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions")
    @TestDataPath("$PROJECT_ROOT")
    public class Atomic_extensions {
        @Test
        public void testAllFilesPresentInAtomic_extensions() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("ArrayInlineExtensionTest.kt")
        public void testArrayInlineExtensionTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ArrayInlineExtensionTest.kt");
        }

        @Test
        @TestMetadata("ArrayLoopTest.kt")
        public void testArrayLoopTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ArrayLoopTest.kt");
        }

        @Test
        @TestMetadata("ComplexLoopTest.kt")
        public void testComplexLoopTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ComplexLoopTest.kt");
        }

        @Test
        @TestMetadata("ExtensionLoopTest.kt")
        public void testExtensionLoopTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ExtensionLoopTest.kt");
        }

        @Test
        @TestMetadata("ExtensionsTest.kt")
        public void testExtensionsTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ExtensionsTest.kt");
        }

        @Test
        @TestMetadata("InlineExtensionWithTypeParameterTest.kt")
        public void testInlineExtensionWithTypeParameterTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/InlineExtensionWithTypeParameterTest.kt");
        }

        @Test
        @TestMetadata("LambdaTest.kt")
        public void testLambdaTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/LambdaTest.kt");
        }

        @Test
        @TestMetadata("LockFreeIntBitsTest.kt")
        public void testLockFreeIntBitsTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/LockFreeIntBitsTest.kt");
        }

        @Test
        @TestMetadata("LockTest.kt")
        public void testLockTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/LockTest.kt");
        }

        @Test
        @TestMetadata("ParameterizedInlineFunExtensionTest.kt")
        public void testParameterizedInlineFunExtensionTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ParameterizedInlineFunExtensionTest.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic")
    @TestDataPath("$PROJECT_ROOT")
    public class Atomics_basic {
        @Test
        public void testAllFilesPresentInAtomics_basic() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("ArithmeticTest.kt")
        public void testArithmeticTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/ArithmeticTest.kt");
        }

        @Test
        @TestMetadata("AtomicArrayTest.kt")
        public void testAtomicArrayTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/AtomicArrayTest.kt");
        }

        @Test
        @TestMetadata("IndexArrayElementGetterTest.kt")
        public void testIndexArrayElementGetterTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/IndexArrayElementGetterTest.kt");
        }

        @Test
        @TestMetadata("InitializationOrderTest.kt")
        public void testInitializationOrderTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/InitializationOrderTest.kt");
        }

        @Test
        @TestMetadata("LateinitPropertiesTest.kt")
        public void testLateinitPropertiesTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/LateinitPropertiesTest.kt");
        }

        @Test
        @TestMetadata("LockFreeLongCounterTest.kt")
        public void testLockFreeLongCounterTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/LockFreeLongCounterTest.kt");
        }

        @Test
        @TestMetadata("LockFreeQueueTest.kt")
        public void testLockFreeQueueTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/LockFreeQueueTest.kt");
        }

        @Test
        @TestMetadata("LockFreeStackTest.kt")
        public void testLockFreeStackTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/LockFreeStackTest.kt");
        }

        @Test
        @TestMetadata("LoopTest.kt")
        public void testLoopTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/LoopTest.kt");
        }

        @Test
        @TestMetadata("MultiInitTest.kt")
        public void testMultiInitTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/MultiInitTest.kt");
        }

        @Test
        @TestMetadata("ScopeTest.kt")
        public void testScopeTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/ScopeTest.kt");
        }

        @Test
        @TestMetadata("SimpleLockTest.kt")
        public void testSimpleLockTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/SimpleLockTest.kt");
        }

        @Test
        @TestMetadata("UncheckedCastTest.kt")
        public void testUncheckedCastTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/UncheckedCastTest.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/delegated")
    @TestDataPath("$PROJECT_ROOT")
    public class Delegated {
        @Test
        public void testAllFilesPresentInDelegated() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/delegated"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("DelegatedPropertiesTest.kt")
        public void testDelegatedPropertiesTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/delegated/DelegatedPropertiesTest.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/locks")
    @TestDataPath("$PROJECT_ROOT")
    public class Locks {
        @Test
        public void testAllFilesPresentInLocks() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/locks"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("ReentrantLockTest.kt")
        public void testReentrantLockTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/locks/ReentrantLockTest.kt");
        }

        @Test
        @TestMetadata("SynchronizedObjectTest.kt")
        public void testSynchronizedObjectTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/locks/SynchronizedObjectTest.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/top-level")
    @TestDataPath("$PROJECT_ROOT")
    public class Top_level {
        @Test
        public void testAllFilesPresentInTop_level() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/top-level"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("FieldInObjectTest.kt")
        public void testFieldInObjectTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/top-level/FieldInObjectTest.kt");
        }

        @Test
        @TestMetadata("TopLevelTest.kt")
        public void testTopLevelTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/top-level/TopLevelTest.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/trace")
    @TestDataPath("$PROJECT_ROOT")
    public class Trace {
        @Test
        public void testAllFilesPresentInTrace() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/trace"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("TraceTest.kt")
        public void testTraceTest() throws Exception {
            runTest("plugins/atomicfu/atomicfu-compiler/testData/box/trace/TraceTest.kt");
        }
    }
}

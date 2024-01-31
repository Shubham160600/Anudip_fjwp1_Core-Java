/* Test Hierarchies. */

package shubham;

import org.junit.jupiter.api.*;

public class NestedTestsExample {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all tests");
    }

    @Nested
    class OuterTestClass {

        @BeforeEach
        void beforeEach() {
            System.out.println("Before outer test");
        }

        @AfterEach
        void afterEach() {
            System.out.println("After outer test");
        }

        @Test
        void outerTest1() {
            System.out.println("Outer Test 1");
        }

        @Nested
        class InnerTestClass {

            @BeforeEach
            void beforeEach() {
                System.out.println("Before inner test");
            }

            @AfterEach
            void afterEach() {
                System.out.println("After inner test");
            }

            @Test
            void innerTest1() {
                System.out.println("Inner Test 1");
            }

            @Test
            void innerTest2() {
                System.out.println("Inner Test 2");
            }
        }
    }
}

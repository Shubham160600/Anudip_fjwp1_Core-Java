/* Lifecycle Methods. */

package shubham;

import org.junit.jupiter.api.*;

public class LifecycleMethodsExample {

	@BeforeAll
	static void initAll() {
		System.out.println("@BeforeAll: Executed once before all test methods.");
	}

	@BeforeEach
	void init() {
		System.out.println("@BeforeEach: Executed before each test method.");
	}

	@Test
	void test1() {
		System.out.println("Test 1 execution.");
	}

	@Test
	void test2() {
		System.out.println("Test 2 execution.");
	}

	@AfterEach
	void tearDown() {
		System.out.println("@AfterEach: Executed after each test method.");
	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("@AfterAll: Executed once after all test methods.");
	}
}

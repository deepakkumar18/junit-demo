package com.example.samplejunit.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

// @DisplayNameGeneration(DisplayNameGenerator.Simple.class) 
// this one removes parenthesis

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
public class DemoUtilsTest {

	private DemoUtils demoUtils;

	@BeforeEach
	public void init() {
		demoUtils = new DemoUtils();
	}

	@Test
	public void test() {
		int result = demoUtils.calculate(2, 3);
		Assertions.assertEquals(5, result, " 2 + 3 should be 5");
	}

	@Test
	public void testTwo() {
		int result = demoUtils.calculate(2, 3);
		Assertions.assertNotEquals(7, result, " 2 + 3 should not be 7");
	}

	@Test
	@DisplayName("Null Check")
	public void testCheckNull() {
		String s = new String("Deepak");
		String s1 = null;
		Object obj = demoUtils.checkNull(s);

		Assertions.assertNotNull(obj, "Object should not be null");
		Assertions.assertNull(s1, "Object should be null");

	}

	/*
	 * @BeforeAll public static void beforeAll() { }
	 * 
	 * @AfterEach public void tearDown() {
	 * System.out.println("Added After Each Annotated method"); }
	 * 
	 * 
	 * @AfterAll public static void AfterAllMethod() { System.out.println();
	 * System.out.println("This runs once after all the test cases"); }
	 */
}

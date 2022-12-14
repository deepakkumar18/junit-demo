package com.example.samplejunit.service;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class) 
// this one removes parenthesis
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class DemoUtilsTest {

	private DemoUtils demoUtils;

	@Test
	public void testTimeOut() {
		Assertions.assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
			demoUtils.timeOut();
		});
	}

	@Test
	public void testException() {
		Assertions.assertThrows(Exception.class, () -> {
			demoUtils.exceptionThrown(-1);
		});

		Assertions.assertDoesNotThrow(() -> demoUtils.exceptionThrown(1));
	}

	@Test
	public void testLinesMatch() {
		List<String> stringList = List.of("luv", "2", "code");
		Assertions.assertLinesMatch(stringList, demoUtils.getStringList());
	}

	@Test
	public void testIterableEquals() {
		List<String> stringList = List.of("luv", "2", "code");
		Assertions.assertIterableEquals(stringList, demoUtils.getStringList());
	}

	@Test
	public void testArraysEquals() {
		String[] stringArray = new String[] { "A", "B", "C" };
		Assertions.assertArrayEquals(stringArray, demoUtils.getAlphabetsArray(), "Arrays should be equal");
	}

	@Test
	public void testGreaterOrNot() {
		Assertions.assertTrue(demoUtils.greater(20, 10));
		Assertions.assertFalse(demoUtils.greater(20, 20));
	}

	@Test
	public void testSameOrNot() {
		String s = "deepak";
		String s1 = s;
		String s2 = "Kumar";

		Assertions.assertSame(s, s1);
		Assertions.assertNotSame(s, s2);
	}

	@Test
	public void testAssertEquals() {
		int result = demoUtils.calculate(2, 3);
		Assertions.assertEquals(5, result, " 2 + 3 should be 5");
	}

	@Test
	public void testAssertNotEquals() {
		int result = demoUtils.calculate(2, 3);
		Assertions.assertNotEquals(7, result, " 2 + 3 should not be 7");
	}

	@Test
	public void testCheckNull() {
		String s = new String("Deepak");
		String s1 = null;
		Object obj = demoUtils.checkNull(s);

		Assertions.assertNotNull(obj, "Object should not be null");
		Assertions.assertNull(s1, "Object should be null");
		Assertions.assertNull(demoUtils.checkNull(null));

	}

	@BeforeEach
	public void init() {
		demoUtils = new DemoUtils();
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

package com.example.samplejunit.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloTest {

	private Hello hello;

	@BeforeAll
	public static void beforeAll() {
		System.out.println("BeforeAll Runs once in starting");
	}

	@BeforeEach
	public void init() {
		System.out.println();
		System.out.println("before each got printed");

		hello = new Hello();
	}

	@Test
	public void test() {
		System.out.println("You are in method test");
		int result = hello.calculate(2, 3);
		Assertions.assertEquals(5, result, " 2 + 3 should be 5");
	}

	@Test
	public void testTwo() {
		System.out.println("You are in method testTwo");
		int result = hello.calculate(2, 3);
		Assertions.assertNotEquals(7, result, " 2 + 3 should not be 7");
	}

	@Test
	public void checkNull() {
		System.out.println("You are in method checkNull");
		String s = new String("Deepak");
		String s1 = null;
		Object obj = hello.checkNull(s);

		Assertions.assertNotNull(obj, "Object should not be null");
		Assertions.assertNull(s1, "Object should be null");

	}

	@AfterEach
	public void tearDown() {
		System.out.println("Added After Each Annotated method");
	}

	@AfterAll
	public static void AfterAllMethod() {
		System.out.println();
		System.out.println("This runs once after all the test cases");
	}
}

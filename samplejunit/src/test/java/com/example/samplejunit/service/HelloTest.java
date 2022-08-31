package com.example.samplejunit.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest {

	private Hello hello =  new Hello(); 
	
	@Test
	public void test() {
		int result = hello.calculate(2, 3);
		Assertions.assertEquals(5,result," 2 + 3 should be 5");
	}
	
	@Test
	public void testTwo() {
		int result = hello.calculate(2, 3);
		Assertions.assertNotEquals(7,result," 2 + 3 should not be 7");
	}
}

package com.example.samplejunit.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@BeforeEach
	public void initialize() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void divisibleByThree() {
		String expected = "fizz";
		Assertions.assertEquals(expected, fizzBuzz.compute(3));

	}

	@Test
	public void divisibleByFive() {
		String expected = "buzz";
		Assertions.assertEquals(expected, fizzBuzz.compute(5));

	}

	@Test
	public void divisibleByThreeAndFive() {
		String expected = "fizzbuzz";
		Assertions.assertEquals(expected, fizzBuzz.compute(15));
	}

	@Test
	public void notDivisibleByThreeOrFive() {
		String expected = "1";
		Assertions.assertEquals(expected, fizzBuzz.compute(1));
	}
	/*
	 * @Test public void myTest() { for(int i = 1; i<=16; i++)
	 * System.out.println(fizzBuzz.compute(i)); }
	 */

	@ParameterizedTest(name = "value={0}, expected={1}")
	@CsvFileSource(resources = "/small-test-data.csv")
	public void parameterizedTest(int value, String expected) {
		Assertions.assertEquals(expected,fizzBuzz.compute(value));
	}

}

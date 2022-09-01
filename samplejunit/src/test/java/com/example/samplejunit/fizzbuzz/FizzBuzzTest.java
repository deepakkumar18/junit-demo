package com.example.samplejunit.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	@BeforeEach
	public void initialize()
	{
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void divisibleByThree() {
		String expected = "fizz";
		
		Assertions.assertEquals(expected, fizzBuzz.compute(3));
		
	}

}

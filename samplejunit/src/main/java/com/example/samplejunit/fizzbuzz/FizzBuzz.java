package com.example.samplejunit.fizzbuzz;

public class FizzBuzz {

	public String compute(int i) {
		if (i % 3 == 0 && i % 5 == 0)
			return "fizzbuzz";
		else if (i % 3 == 0)
			return "fizz";
		else if (i % 5 == 0)
			return "buzz";
		else
			return Integer.toString(i);
	}

}

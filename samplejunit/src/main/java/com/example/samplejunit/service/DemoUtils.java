package com.example.samplejunit.service;

import java.util.List;

public class DemoUtils {
	private String[] alphabetsArray = new String[] { "A", "B", "C" };
	private List<String> stringList = List.of("luv", "2", "code");

	public void timeOut() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	
	public String exceptionThrown(int a) throws Exception {
		if (a < 0) {
			throw new Exception("Value should be greater than or equal to 0");
		}
		return "Value is greater than or equal to 0";
	}

	public List<String> getStringList() {
		return stringList;
	}

	public String[] getAlphabetsArray() {
		return alphabetsArray;
	}

	public int calculate(int a, int b) {
		return a + b;
	}

	public Object checkNull(Object obj) {
		if (obj != null) {
			return obj;
		}
		return null;
	}

	public boolean greater(int a, int b) {
		return a > b;
	}
}

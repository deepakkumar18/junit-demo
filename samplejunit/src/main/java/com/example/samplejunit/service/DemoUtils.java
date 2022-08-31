package com.example.samplejunit.service;

public class DemoUtils {
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

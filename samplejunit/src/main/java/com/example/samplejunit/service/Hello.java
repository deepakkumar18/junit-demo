package com.example.samplejunit.service;

public class Hello {
	public int calculate(int a, int b) {
		return a + b;
	}
	
	public Object checkNull(Object obj) {
		if(obj !=null) {
			return obj;
		}
		return null;
	}
}

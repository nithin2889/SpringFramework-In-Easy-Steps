package com.nithin.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	public Addition(double a, double b) {
		System.out.println("inside double arg constructor");
	}

	public Addition(int a, int b) {
		System.out.println("inside integer arg constructor");
	}
	
	public Addition(String a, String b) {
		System.out.println("inside String arg constructor");
	}

}
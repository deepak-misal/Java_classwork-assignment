package com.techlab.test;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		System.out.println("Calling main");
		function1();
		System.out.println("End of main");

	}

	private static void function1() {
		System.out.println("Inside function1");
		function2();
	}

	private static void function2() {
		System.out.println("Inside funtion2");
		funtion3();
	}

	private static void funtion3() {
		System.out.println("Inside function3");
		throw new RuntimeException("Something went wrong in f3");
	}

}

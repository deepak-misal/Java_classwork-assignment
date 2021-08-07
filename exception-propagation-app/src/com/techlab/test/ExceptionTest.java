package com.techlab.test;

public class ExceptionTest {

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
		try {
			funtion3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void funtion3() throws Exception {
		System.out.println("Inside function3");
		throw new Exception("Something went wrong in f3");
	}
}

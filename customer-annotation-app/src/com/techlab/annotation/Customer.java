package com.techlab.annotation;

public class Customer {
	@NeedToBeRefactor
	public void m1() {
		System.out.println("I am in m1");
	}
	public void m2() {
		System.out.println("I am in m2");
	}
	public void m3() {
		System.out.println("I am in m3");
	}
	@NeedToBeRefactor
	public void m4() {
		System.out.println("I am in m4");
	}

}

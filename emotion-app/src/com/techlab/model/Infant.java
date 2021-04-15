package com.techlab.model;

public class Infant implements IEomtionable{

	@Override
	public void cry() {
		System.out.println("Infant crying");
		
	}

	@Override
	public void laugh() {
		System.out.println("Infant laughing");
		
	}

}

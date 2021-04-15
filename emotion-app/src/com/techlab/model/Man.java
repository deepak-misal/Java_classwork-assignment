package com.techlab.model;

public class Man implements IEomtionable, ISocialization{

	@Override
	public void cry() {
		System.out.println("Man Crying");
		
	}

	@Override
	public void laugh() {
		System.out.println("Man Laughing");
		
	}

	@Override
	public void depart() {
		System.out.println("Man depart");
		
	}

	@Override
	public void wish() {
		System.out.println("Man wish");
		
	}

}

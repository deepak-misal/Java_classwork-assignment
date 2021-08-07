package com.techlab.model;

public class Robots implements IWorkable{

	@Override
	public void startWork() {
		System.out.println("Robot started working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stopped working");
	}

	@Override
	public void stratEat() {
		System.out.println("Robot started eating");
		
	}

	@Override
	public void stopEat() {
		System.out.println("Robot stopped working");
	}
	

}

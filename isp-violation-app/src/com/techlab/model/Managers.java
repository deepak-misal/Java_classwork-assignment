package com.techlab.model;

public class Managers implements IWorkable{

	@Override
	public void startWork() {
		System.out.println("Manager has started working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Manager has stopped workinh");
		
	}

	@Override
	public void stratEat() {
		System.out.println("Manager start eating");
		
	}

	@Override
	public void stopEat() {
		System.out.println("Manager Stopped eating");
		
	}

}

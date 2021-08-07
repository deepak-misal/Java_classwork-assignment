package com.techlab.model;

public class TXTLogger implements ILog{

	@Override
	public void log(String ErrorMessage) {
		System.out.println("Writting data in JSON file...\n"+ErrorMessage);
		
	}
	
}

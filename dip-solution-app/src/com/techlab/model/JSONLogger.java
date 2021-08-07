package com.techlab.model;

public class JSONLogger implements ILog{

	@Override
	public void log(String ErrorMessage) {
		System.out.println("Writting data in JSON file...\n"+ErrorMessage);
	}

}

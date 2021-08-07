package com.techlab.model;

public class XMLLogger implements ILog{

	@Override
	public void log(String ErrorMessage) {
		System.out.println("Writting data in XML file...\n"+ErrorMessage);
		
	}
	

}

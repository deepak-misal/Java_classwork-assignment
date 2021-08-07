package com.techlab.model;

public class TaxCalculator {
	ILog log;
	public TaxCalculator(ILog log) {
		this.log=log;
	}
	public int calculateTax(int amount,int rate) {
		try {
			int result=amount/rate;
			return result;
		}
		catch(Exception e) {
			log.log("Divide by 0");
			return -1;
				
			}
	}
}

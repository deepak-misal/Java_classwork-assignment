package com.techlab.test;

import com.techlab.model.ILog;
import com.techlab.model.TaxCalculator;
import com.techlab.model.XMLLogger;

public class DipTest {
	public static void main(String[] args) {
		TaxCalculator obj = new TaxCalculator(new XMLLogger());
		System.out.println(obj.calculateTax(10, 2));
		System.out.println(obj.calculateTax(0, 0));
	}
}

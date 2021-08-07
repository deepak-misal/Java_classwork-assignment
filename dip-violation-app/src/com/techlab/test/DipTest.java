package com.techlab.test;

import com.techlab.model.LogType;
import com.techlab.model.TaxCalculator;

public class DipTest {

	public static void main(String[] args) {
		TaxCalculator obj = new TaxCalculator(LogType.JSON);
		System.out.println(obj.calculateTax(10, 2));
		System.out.println(obj.calculateTax(0, 0));
	}

}

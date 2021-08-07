package com.techlab.test;

import com.techlab.model.Invoice;
import com.techlab.model.InvoicePrinter;

public class Test {

	public static void main(String[] args) {
		Invoice i1=new Invoice(1,"abc",100,15,10);
		InvoicePrinter printer=new InvoicePrinter(i1);
		printer.printToConsole(i1);

	}

}

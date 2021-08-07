package com.techlab.model;

public class InvoicePrinter {
	private Invoice invoice;
	public InvoicePrinter(Invoice invoice) {
		this.invoice=invoice;
	}
	public void printToConsole(Invoice invoice) {
		System.out.println("NO:"+invoice.getId());
		System.out.println("NAME:"+invoice.getName());
		System.out.println("AMOUNT:"+invoice.getAmount());
		System.out.println("DISCOUNT PERCENTAGE:"+invoice.getDiscountPercentage());
		System.out.println("DISCOUNT AMMOUNT:"+invoice.calculateDiscount());
		System.out.println("GST:"+invoice.calculateGST());
		System.out.println("TOTAL COST:"+invoice.calculateTotalCost());
	}

}

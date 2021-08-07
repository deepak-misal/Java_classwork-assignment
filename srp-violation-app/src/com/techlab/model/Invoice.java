package com.techlab.model;

public class Invoice {
	private int no;
	private String name;
	private double amount;
	private double discountPercentage;
	private float GST;
	private double discount;
	public Invoice(int id,String name,double amount,double discountPercentage,float GST) {
		this.no=no;
		this.name=name;
		this.amount=amount;
		this.discountPercentage=discountPercentage;
		this.GST=GST;
	}
	public int getId() {
		return no;
	}
	public String getName() {
		return name;
	}
	public double getAmount() {
		return amount;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public double calculateDiscount() {
		discount=(amount*discountPercentage)/100;
		return discount;
	}
	public float calculateGST() {
		return GST;
	}
	public double calculateTotalCost() {
		double totalCost=(amount-discount)+GST;
		return totalCost;
	}
	public void printToConsole(Invoice invoice) {
		System.out.println("NO:"+invoice.getId());
		System.out.println("NAME:"+invoice.getName());
		System.out.println("AMOUNT:"+invoice.getAmount());
		System.out.println("DISCOUNT PERCENTAGE:"+invoice.getDiscountPercentage());
		System.out.println("GST:"+invoice.calculateGST());
		System.out.println("TOTAL COST:"+invoice.calculateTotalCost());
	}
	

}

package com.techlab.model;

public class LineItem {
	private int id;
	private String name;
	private double unitPrice;
	private int quantity;
	private double totalItemCost;
	public LineItem(int id, String name,double unitPrice,int quantity) {
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.quantity=quantity;
	}
	public int getId() {
		return id;		
	}
	public String getName() {
		return name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public double CalculateTotalItemPrice() {
		totalItemCost=unitPrice*quantity;
		return totalItemCost;
	}
	public double getTotalPrice() {
		return totalItemCost;
	}
	public String toString() {
		return String.format("id:"+id+" name:"+name+" unitprice:"+unitPrice+" quantity:"+quantity);
	}
}

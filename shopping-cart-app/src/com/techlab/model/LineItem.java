package com.techlab.model;

public class LineItem {
	private int lid;
	private int quantity;
	private Product product;
	public LineItem(int lid, int quantity,Product product) {
		this.lid=lid;
		this.quantity=quantity;
		this.product=product;
	}
	public int getLid() {
		return lid;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void updateQuantity() {
		this.quantity+=quantity;
	}

}

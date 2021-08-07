package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Order{
	private int oid;
	private String date;
	private int checkOutPrice=0;
	public Order(int oid, String date) {
		this.oid=oid;
		this.date=date;
	}
	public int getOid() {
		return oid;
	}
	public String getDate() {
		return date;
	}
	List<LineItem> list=new ArrayList<LineItem>();
	public void addItem(LineItem item) {
		list.add(item);
		if(list.contains(item.getProduct())) {
			item.updateQuantity();
		}
		checkOutPrice+=(item.getQuantity()*item.getProduct().getCost());
	}
	public List<LineItem> getLineItems() {
		return list;
	}
	public int getCheckOutPrice() {
		return checkOutPrice;
	}
	
}

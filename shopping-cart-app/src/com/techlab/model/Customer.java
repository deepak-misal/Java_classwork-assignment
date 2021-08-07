package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Customer{
	private int cid;
	private String cname;
	
	public Customer(int cid, String cname) {
		this.cid=cid;
		this.cname=cname;
		
	}
	public int getCid() {
		return cid;
	}
	public String getCName() {
		return cname;
	}
	List<Order> list1=new ArrayList<Order>();
	public void addOrder(Order i) {
		
		list1.add(i);
	}
	public List<Order> getOrders() {
		return list1;
	}
}

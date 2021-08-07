package com.techlab.model;

public class Product {
	private int pid;
	private String pname;
	private int cost;
	public Product(int pid,String pname,int cost) {
		this.pid=pid;
		this.pname=pname;
		this.cost=cost;
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public int getCost() {
		return cost;
	}

}

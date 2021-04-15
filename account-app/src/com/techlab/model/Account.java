package com.techlab.model;



public class Account {
	private int accNo;
	private String accName;
	private double balance;
	public boolean transactionFlag=true;
	private static int idCounter=1;
	

	public Account( String name, double balance) {
		this.accNo = idCounter++;
		this.accName = name;
		this.balance = balance;
		
	}
	public int getAndIncrement() {
		return accNo++;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		balance = balance + amount;
	}

	public boolean withdraw(double amount) {
		int minimum_balance=1000;
		if (this.balance - minimum_balance<1000) {
			transactionFlag=false;
		} else {
			this.balance = this.balance - amount;
		}
		return transactionFlag;
	}

}

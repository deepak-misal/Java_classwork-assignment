package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
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

	public void withdraw(double amount){
		int minimum_balance=500;
		if (this.balance - amount<minimum_balance) {
			throw new RuntimeException("Insufficient Balance");
		} else {
			this.balance = this.balance - amount;
		}
	}
}

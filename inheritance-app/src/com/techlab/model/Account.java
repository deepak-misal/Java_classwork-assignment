package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	public boolean transactionFlag=true;
	private static int count;
	static {
		count=0;
	}

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.accName = name;
		this.balance = balance;
		count=count+1;
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
	public int getCount() {
		return count;
	}
	public static int headCount() {
		return count;
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

	@Override
	public int hashCode() {
		System.out.println(super.hashCode());
		return accNo;
	}

	@Override
	public boolean equals(Object obj) {
		Account a=(Account)obj;
		if(this.accNo==a.accNo) 
			return true;
		else 
			return false;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}
}

package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	public double withdrawamount;
	private static int idCounter=1;
	

	public Account(String name, double balance) {
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

	public void deposite(double depositeamount) {
		balance = balance + depositeamount;
	}

	public void withdraw(double withdrawamount){
		int minimum_balance=500;
		if (this.balance - withdrawamount<minimum_balance) {
			throw new InsufficientBalanceException(this, withdrawamount);
		} else {
			this.balance = this.balance - withdrawamount;
		}
	}
}

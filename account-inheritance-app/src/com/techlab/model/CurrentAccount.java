package com.techlab.model;

public class CurrentAccount extends Account {
	private final int minBal=1000;

	public CurrentAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		}
	public void withdraw(double amount) {
		if (balance - amount<minBal) {
			super.setTransactionFlag(false);
		} else {
			balance = balance - amount;
		}
		
	}

}

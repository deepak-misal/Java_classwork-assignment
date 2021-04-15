package com.techlab.model;

public class SavingAccount extends Account {
	private final int minBal=500;

	public SavingAccount(int accNo, String accName, double balance) {
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

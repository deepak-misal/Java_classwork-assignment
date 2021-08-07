package com.techlab.model;

public class InsufficientBalanceException extends Exception {
	@Override
	public String getMessage() {
		System.out.println("Insufficient Balanace");
		return super.getMessage();
	}
}

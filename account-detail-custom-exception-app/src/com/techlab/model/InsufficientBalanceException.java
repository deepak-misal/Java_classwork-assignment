package com.techlab.model;

public class InsufficientBalanceException extends RuntimeException {
	private Account acc;
	private double amount;
	private String msg;
	private double withdrawamount;
	public InsufficientBalanceException(Account acc,double amount) {
		this.acc=acc;
		this.withdrawamount=amount;
	}
	
	public void setMessage() {
		StringBuilder str=new StringBuilder();
		str.append("Insufficient balance");
		str.append("\nACCOUNT NUMBER:"+acc.getAccNo());
		str.append("\nACCOUNT HOLDER NAME:"+acc.getAccName());
		str.append("\nACCOUNT BALANCE:"+acc.getBalance());
		str.append("\ncan not withdraw amount:"+withdrawamount);
		this.msg=str.toString();
		}
	public String getMessage() {
		this.setMessage();
		return msg;
	}
	
}

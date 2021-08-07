package com.techlab.model;

public class FixedDeposit {
	private int accNo;
	private String accName;
	private double amount;
	private double principle;
	private int years;
	private double interest;
	private IFestivalRate festName;
	public FixedDeposit(int accNo, String accName, double amount, double principle,int years,IFestivalRate festName) {
		this.accNo=accNo;
		this.accName=accName;
		this.amount=amount;
		this.principle=principle;
		this.years=years;
		this.festName=festName;
	}
	public int getAccNo() {
		return accNo;
	}
	public String accName() {
		return accName;
	}
	public double getAmount() {
		return amount;
	}
	public double getPrinciple() {
		return principle;
	}
	public int getYears() {
		return years;
	}
	public IFestivalRate getFestival() {
		return festName;
	}
	public double calculateSimpleInterest() {
		interest=(principle*festName.getRate()*years)/100;
		return interest;
	}
}

package com.techlab.model;

public class FixedDeposit {
	private int accNo;
	private String accName;
	private double amount;
	private double principle;
	private int years;
	private double interest;
	private FestivalType festival;
	public FixedDeposit(int accNo, String accName, double amount, double principle,int years,FestivalType festival) {
		this.accNo=accNo;
		this.accName=accName;
		this.amount=amount;
		this.principle=principle;
		this.years=years;
		this.festival=festival;
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
	public double calculateSimpleInterest() {
		if(festival==FestivalType.NORMAL) {
			int rate=7;
			interest= (principle*rate*years)/100;
		}
		if(festival==FestivalType.HOLI) {
			int rate=8;
			interest= (principle*rate*years)/100;
		}
		if(festival==FestivalType.DIWALI) {
			int rate=10;
			interest= (principle*rate*years)/100;
		}
		return interest;
	}
}

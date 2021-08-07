package com.techlab.test;


import com.techlab.model.DiwaliRate;
import com.techlab.model.FixedDeposit;
import com.techlab.model.HoliRate;
import com.techlab.model.IFestivalRate;

public class Test {

	public static void main(String[] args) {
		FixedDeposit f=new FixedDeposit(1,"abc",5000,4000,2,new HoliRate());
		System.out.println("Simple Interest:"+f.calculateSimpleInterest());
		FixedDeposit f1=new FixedDeposit(1,"abc",5000,4000,2,new DiwaliRate());
		System.out.println("Simple Interest:"+f1.calculateSimpleInterest());


	}

}

package com.techlab.test;

import com.techlab.model.FestivalType;
import com.techlab.model.FixedDeposit;

public class Test {

	public static void main(String[] args) {
		FixedDeposit f=new FixedDeposit(1,"abc",5000,4000,2,FestivalType.DIWALI);
		System.out.println("Simple Interest:"+f.calculateSimpleInterest());

	}

}

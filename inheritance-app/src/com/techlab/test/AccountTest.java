package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1=new Account(1,"abc",20000);
		Account a2=new Account(1,"abc",20000);
		System.out.println(a1.toString());
		System.out.println(a1);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode());

	}

}

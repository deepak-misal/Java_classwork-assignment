package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account a1;
		a1 = new Account(12, "abc", 9000);
	
		Account a2;
		a2=new Account(13,"xyz",5000);
		
		Account a3;
		a3=new Account(14,"opq",7000);
		System.out.println("TOTAL ACCOUNTS:"+Account.headCount());

	}

	private static void printCounter(Account a) {
		System.out.println("ACCOUNT COUNTER:"+a.getCount());
		
	}

}

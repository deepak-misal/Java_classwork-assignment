package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1;
		a1=new Account("abc",1000);
		a1.deposite(200);
		printAccountInfo(a1);
		try {
			a1.withdraw(800);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		printAccountInfo(a1);
	}

	private static void printAccountInfo(Account a) {
		System.out.println("ACCOUNT NUMBER:"+a.getAccNo());
		System.out.println("ACCOUNT HOLDER NAME:"+a.getAccName());
		System.out.println("ACCOUNT BALANCE:"+a.getBalance());
		System.out.println("********************************************");
		
	}
}



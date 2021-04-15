package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1,a2,a3;
		a1=new Account("abc",9000);
		a2=new Account("xyz",2500);
		a3=new Account("pqr",3000);
		printAccountInfo(a1);
		printAccountInfo(a2);
		printAccountInfo(a3);
		//a1.deposit(5000);
		//printAccountInfo(a1);
		//a1.withdraw(2000);
		if(!a1.transactionFlag) {
			System.out.println("Withdrawl not possible");
		}
		else {
			//printAccountInfo(a1);
		}

	}

	private static void printAccountInfo(Account a) {
		System.out.println("ACCOUNT NUMBER:"+a.getAccNo());
		System.out.println("ACCOUNT HOLDER NAME:"+a.getAccName());
		System.out.println("ACCOUNT BALANCE:"+a.getBalance());
		System.out.println("********************************************");
		
	}

}

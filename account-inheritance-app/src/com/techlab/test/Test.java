package com.techlab.test;
import com.techlab.model.Account;
import com.techlab.model.CurrentAccount;
import com.techlab.model.SavingAccount;

public class Test {

	public static void main(String[] args) {
		CurrentAccount a1;
		a1=new CurrentAccount(1,"xyz",2000);
		SavingAccount a2;
		a2=new SavingAccount(2,"pqr",300);
		a1.deposite(1000);
		printAccountInfo(a1);
		a1.withdraw(2500);
				if(!a1.getTransactionFlag()) {
					System.out.println("Withdrawl not possible");
				}
				else {
					printAccountInfo(a1);
				}
		a2.deposite(100);
		printAccountInfo(a2);
		a2.withdraw(80);
				if(!a2.getTransactionFlag()) {
					System.out.println("Withdrawl not possible");
				}
				else {
					printAccountInfo(a2);
				}

	}
	private static void printAccountInfo(Account a) {
		System.out.println("ACCOUNT NUMBER:"+a.getAccNo());
		System.out.println("ACCOUNT HOLDER NAME:"+a.getAccName());
		System.out.println("ACCOUNT BALANCE:"+a.getBalance());
		System.out.println("********************************************");
		
}
}

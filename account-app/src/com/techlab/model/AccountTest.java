package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	public void testAccount() {
		//arrange
		String expectedaccname="abc";
		double expectedbalance=2000;
		//act
		Account a1=new Account("abc",2000);
		//assert
		assertEquals(expectedaccname,a1.getAccName());
		assertEquals(expectedbalance,a1.getBalance());
		
	}
	@Test
	public void testDeposite() {
		//arrange
		int expectedbalance=2500;
		//act
		Account a1=new Account("abc",2000);
		a1.deposite(500);
		//assert
		assertEquals(expectedbalance,a1.getBalance());
	}
	@Test
	public void testWithdraw() {
		//arrange
		int expectedbalance=1500;
		//act
		Account a1=new Account("abc",2000);
		a1.withdraw(500);
		//assert
		assertEquals(expectedbalance,a1.getBalance());
	}

}

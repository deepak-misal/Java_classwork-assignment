package com.techlab.model;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	public void testCustomer() {
		int expectedcid=101;
		String expectedcname="abc";
		Customer customer=new Customer(101,"abc");
		assertEquals(expectedcid,customer.getCid());
		assertEquals(expectedcname,customer.getCName());
	}
	@Test
	public void testAddorders() {
		ArrayList<Order> orders=new ArrayList();
		Order order1=new Order(101,"20/06/2021");
		boolean expectedsize=true;
		boolean actualsize=orders.add(order1);
		assertEquals(expectedsize,actualsize);
	}

}

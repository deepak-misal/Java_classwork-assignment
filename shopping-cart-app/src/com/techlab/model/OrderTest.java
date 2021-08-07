package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	public void testOrder() {
		int expectedid=101;
		String expecteddate="20/06/2021";
		Order order=new Order(101,"20/06/2021");
		assertEquals(expectedid,order.getOid());
		assertEquals(expecteddate,order.getDate());
	}
	@Test
	public void testAdditem() {
		ArrayList<LineItem> lineitems=new ArrayList();
		Product product=new Product(1,"xyz",100);
		LineItem item=new LineItem(101,5,product);
		boolean expectedsize=true;
		boolean actualsize=lineitems.add(item);
		assertEquals(expectedsize,actualsize);
	}
	@Test
	public void testcheckoutprice() {
		double expectedcheckoutprice=500.0;
		Order order=new Order(101,"20/06/2021");
		Product product=new Product(1,"xyz",100);
		LineItem item=new LineItem(101,5,product);
		order.addItem(item);
		assertEquals(expectedcheckoutprice,order.getCheckOutPrice());
	}
}

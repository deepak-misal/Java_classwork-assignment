package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LineItemTest {

	@Test
	void testLineItem() {
		int expectedid=1;
		int expectedquantity=5;
		Product product=new Product(11,"xyz",100);
		Product expectedproduct=product;
		LineItem item=new LineItem(1,5,product);
		assertEquals(expectedid,item.getLid());
		assertEquals(expectedquantity,item.getQuantity());
		assertEquals(expectedproduct,item.getProduct());
	}
	@Test
	public void testUpdateQuantity() {
		int expectedQuantity=10;
		Product product=new Product(11,"xyz",100);
		LineItem item=new LineItem(1,5,product);
		LineItem item1=new LineItem(2,5,product);
		ArrayList<LineItem> items=new ArrayList();
		items.add(item);
		items.add(item1);
		item.updateQuantity();
		assertEquals(expectedQuantity,item.getQuantity());
	}

}

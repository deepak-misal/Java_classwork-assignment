package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testProduct() {
		int expectedid=1;
		String expectedname="xyz";
		int expectedcost=100;
		Product product=new Product(1,"xyz",100);
		assertEquals(expectedid,product.getPid());
		assertEquals(expectedname,product.getPname());
		assertEquals(expectedcost,product.getCost());
	}

}

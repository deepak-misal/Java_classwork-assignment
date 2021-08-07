package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Customer;
import com.techlab.model.LineItem;
import com.techlab.model.Order;
import com.techlab.model.Product;

public class ShoppinTest {

	public static void main(String[] args) {
		Customer c1=new Customer(1,"deepak");
		Product product1=new Product(10,"abc",100);
		LineItem item1=new LineItem(11,20,product1);
		Product product2=new Product(20,"xyz",200);
		LineItem item2=new LineItem(12,10,product2);
		LineItem item3=new LineItem(13,5,product2);
		Order order=new Order(100,"20/05/2021");
		order.addItem(item1);
		order.addItem(item2);
		order.addItem(item3);
		c1.addOrder(order);
		printInvoice(c1);


	}

	private static void printInvoice(Customer c1) {
		System.out.println("Customer ID:"+c1.getCid());
		System.out.println("Customer Name:"+c1.getCName());
		List<Order> orders = (ArrayList<Order>) c1.getOrders();
		for(Order order: orders) {
			System.out.println("Order ID:"+order.getOid());
			System.out.println("Order Date:"+order.getDate());
			List<LineItem> items=(ArrayList<LineItem>) order.getLineItems();
			for(LineItem item:items) {
				System.out.println();
				System.out.println("LineItem ID:"+item.getLid());
				System.out.println("LineItem Quantity:"+item.getQuantity());
				System.out.println("LineIem Name:"+item.getProduct().getPname());
				System.out.println("LineItem Cost:"+item.getProduct().getCost());
			}
			System.out.println();
			System.out.println("Final Cost:"+order.getCheckOutPrice());
		}
		
		
	}

}

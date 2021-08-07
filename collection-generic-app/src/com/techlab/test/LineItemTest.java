package com.techlab.test;

import java.util.ArrayList;

import com.techlab.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		ArrayList<LineItem> cart=new ArrayList<LineItem>();
		LineItem item1=new LineItem(1,"item1",2,100);
		LineItem item2=new LineItem(2,"item2",5,1000);
		LineItem item3=new LineItem(3,"item3",1,600);
		cart.add(item1);
		cart.add(item2);
		cart.add(item3);
		System.out.println(cart);
		
		//printCart(cart);
		printTotalCost(cart);
		

	}

		

	private static void printTotalCost(ArrayList cart) {
		double totalCost=0;
		for(int i=0;i<cart.size();i++) {
			LineItem item=(LineItem) cart.get(i);
			totalCost=totalCost + item.CalculateTotalItemPrice();
			
		}
		System.out.println("Checkout Price:"+totalCost);
		
	}
}



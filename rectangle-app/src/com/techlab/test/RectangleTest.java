package com.techlab.test;

import com.techlab.model.Rectangle;
import com.techlab.model.Thickness;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle big;
		big = new Rectangle();
		big.setWidth(16);
		big.setHeight(105);
		big.setThickness(Thickness.LOW);
		Rectangle small;
		small = new Rectangle();
		printRectangleInfo(big);
		printRectangleInfo(small);

	}

	private static void printRectangleInfo(Rectangle r) {

		System.out.println("Width of rectangle:" + r.getWidth());
		System.out.println("height of rectangle:" + r.getHeight());
		System.out.println("Area of rectangle:" + r.calculateArea());
		System.out.println("Thickness of rectangle:" + r.getThickness());

	}

}

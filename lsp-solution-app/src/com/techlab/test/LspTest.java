package com.techlab.test;

import com.techlab.model.IShape;
import com.techlab.model.Rectangle;
import com.techlab.model.Square;

public class LspTest {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle(200,100);
		printInfo(rect);
		Square square=new Square(100);
		printInfo(square);

	}

	private static void printInfo(IShape obj) {
		System.out.println("Area:"+obj.calculateArea());
		
	}

}

package com.techlab.test;
import com.techlab.model.Rectangle;
import com.techlab.model.Thickness;


public class RectangleTest {

	public static void main(String[] args) {
		Rectangle big;
		big=new Rectangle(12,15,Thickness.LOW);
		//printRectangleInfo(big);
		Rectangle small;
		small=new Rectangle(10,20,Thickness.MEDIUM);
		Rectangle[] rectArr=new Rectangle[3];
		rectArr[0]=big;
		rectArr[1]=small;
		rectArr[2]=new Rectangle(30,40,Thickness.HIGH);
		printInfo(rectArr);
		
		
		
	}

	private static void printInfo(Rectangle[] rectArr) {
		for(int i=0;i<rectArr.length;i++) {
			System.out.println("Width of rectangle:"+rectArr[i].getWidth());
			System.out.println("Height of Rectangle:"+rectArr[i].getHeight());
			System.out.println("thickness of recatngle:"+rectArr[i].getThickness());
			System.out.println("Area of Rectangle:"+rectArr[i].calculateArea());
			System.out.println("Hashcode:"+rectArr[i].hashCode());
			
		}
		
	}

	private static void printRectangleInfo(Rectangle r) {
		System.out.println("Width of rectangle:"+r.getWidth());
		System.out.println("Height of Rectangle:"+r.getHeight());
		System.out.println("thickness of recatngle:"+r.getThickness());
		System.out.println("Area of Rectangle:"+r.calculateArea());
		
	}

}

package com.techlab.test;
import com.techlab.model.Circle;
import com.techlab.model.Color;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1;
		c1= new Circle(3);
		printCircleInfo(c1);
		Circle[] circArr=new Circle[5];
		circArr[0]=c1;
		circArr[1]=new Circle(10,Color.GREEN);
		circArr[2]=new Circle(27,Color.RED);
		circArr[3]=new Circle(25,Color.GREEN);
		circArr[4]=new Circle(35,Color.BLUE);
		Circle biggest=c1.findBiggestCircle(circArr);
		System.out.println("BIGGEST:"+biggest.getRadius());
	}

	private static void printCircleInfo(Circle c) {
		System.out.println("RADIUS:"+c.getRadius());
		System.out.println("COLOR:"+c.getColor());
		System.out.println("AREA:"+c.calculateArea());
		System.out.println("PERIMETER:"+c.calculatePeri());
		
	}

}

package com.techlab.model;

public class Circle {
	private int radius;
	private Color color;

	public Circle(int radius, Color color) {
		this.radius = radius;
		if(radius<10 || radius>50) {
			this.radius=10;
		}
		this.color = color;
	}
	public Circle(int radius) {
		this(radius,Color.YELLOW);
	}

	public int getRadius() {
		return radius;
	}

	public Color getColor() {
		return color;
	}

	public float calculateArea() {
		return (float) (3.14 * radius * radius);
	}

	public float calculatePeri() {
		return (float) (2 * 3.14 * radius);
	}

	public Circle findBiggestCircle(Circle[] array) {
		Circle max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i].radius>max.radius) {
				max=array[i];
			}
		}
		return max;
	}
}

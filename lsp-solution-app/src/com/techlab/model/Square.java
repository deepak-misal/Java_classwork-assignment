package com.techlab.model;

public class Square implements IShape{
	private int side;
	public Square(int side) {
		this.side=side;
	}
	public int getSide() {
		return side;
	}

	@Override
	public int calculateArea() {
		int area=side*side;
		return area;
		
	}

}

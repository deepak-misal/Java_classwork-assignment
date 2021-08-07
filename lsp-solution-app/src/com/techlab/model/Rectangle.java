package com.techlab.model;

public class Rectangle implements IShape{
	private int height;
	private int width;

	public Rectangle(int height,int width) {
		this.height=height;
		this.width=width;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	@Override
	public int calculateArea() {
		int area=height*width;
		return area;
		
	}
	

}

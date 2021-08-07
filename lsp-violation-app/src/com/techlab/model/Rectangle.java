package com.techlab.model;

public class Rectangle {
	protected int height;
	protected int width;

	public Rectangle(int height,int width) {
		this.setHeight(height);
		this.setWidth(width);
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int calculateArea() {
		int area=height*width;
		return area;
	}

}

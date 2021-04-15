package com.techlab.model;


public class Rectangle {
	private int width;
	private int height;
	private Thickness thickness;
	public Rectangle(int width,int height,Thickness thickness) {
		this.width=width;
		this.height=height;
		this.thickness=thickness;
	}
	public Rectangle(int width,int height) {
		this(width,height,Thickness.LOW);
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Thickness getThickness() {
		return thickness;
	}
	public int calculateArea() {
		return width*height;
	}
}

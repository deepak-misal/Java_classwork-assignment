package com.techlab.model;

public class Rectangle {

	private int width;
	private int height;
	private String thickness;
	private int check(int c) {
		int min=1;int max=100;int result = 0;
		if(c<min) {
			result=min;
		}
		else if(c>max) {
			result=max;
		}
		else {
			result=c;
		}
		return result;
	}

	public void setWidth(int pwidth) {
		width = pwidth;
		width=check(pwidth);
		
	}

	public void setHeight(int pheight) {
		height = pheight;
		height=check(pheight);
		
	}
	public void setThickness(Thickness t) {
		thickness=t.toString();
		
		}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public String getThickness() {
		return thickness;
	}

	public int calculateArea() {
		return width * height;
	}

}

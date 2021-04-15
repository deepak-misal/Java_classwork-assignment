package com.techlab.model;

public class Person {
	private int id;
	private String name;
	private float height;
	private float weight;
	public Person(int id,String name,float height,float weight) {
		this.id=id;
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public void eat() {
		System.out.println("AFTER EATING:");
		weight=(float)(weight*((float)105/100));
	}
	public void play() {
		System.out.println("AFTER PLAYING:");
		weight=weight*((float)90/100);
		height=height*((float)101/100);
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getHeight() {
		return height;
	}
	public float getWeight() {
		return weight;
	}
}

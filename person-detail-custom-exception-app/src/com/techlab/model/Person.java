package com.techlab.model;

public class Person {
	private int id;
	private String name;
	private int age;
	public Person(int id,String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void validateAge(int age) throws InvalidAgeException {
		int minimum_age=18;
		if(age<minimum_age) {
			throw new InvalidAgeException(this,age);
		}
	}

}

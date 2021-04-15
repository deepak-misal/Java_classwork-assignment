package com.techlab.model;

public class Student {
	private int id;
	private String name;
	private int age = 25;

	public Student() {
		id = 0;
		name = null;
		age = 0;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public Student(int id, String name, int age) {
		this(id,name);
		this.age = age;
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

	public Student whoIsElder(Student s) {
		if (s.age > this.age) {
			return s;
		}
		return this;
	}
}

package com.techlab.model;

public class Student {
	private int id;
	private String name;
	private int age;

	public void setId(int pid) {
		id = pid;
		if (pid < 1 || pid > 50) {
			id = 100;
		}
	}

	public void setName(String pname) {
		name = pname;
	}

	public void setAge(int page) {
		age = page;
		if (page < 16 || page > 21) {
			age = 16;
		}
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

}

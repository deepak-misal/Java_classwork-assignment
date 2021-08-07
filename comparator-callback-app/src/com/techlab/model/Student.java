package com.techlab.model;

public class Student {
	private int id;
	private String name;
	private int cgpa;
	private String standard;
	public Student(int id,String name,int cgpa,String standard) {
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		this.standard=standard;
	}
	public String getName() {
		return name;
	}
	public int getCgpa() {
		return cgpa;
	}
	public String toString() {
		return("ID: "+id+" name: "+name+" cgpa: "+cgpa);
}
}

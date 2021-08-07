package com.techlab.model;

public class Student implements Comparable<Student>{
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
	public int getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Student s) {
		int comparecgpa=((Student)s).getCgpa();
		return this.cgpa-comparecgpa;
	}
	public String toString() {
		return String.format("Student ID:"+id+" Student Name:"+name+" Student cgpa:"+cgpa+" Student Standard:"+standard+"\n");
	}

}

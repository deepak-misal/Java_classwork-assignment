package com.techlab.model;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private double cgpa;
	private String standard;
	public Student(int id,String name,double cgpa,String standard) {
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		this.standard=standard;
	}
	public int compareTo(Student s) {
		if(id==s.id & standard!=s.standard) {
			return 1;
		}
		return 0;
	}
	public int hashCode() {
		return id;
	}
	public boolean equals(Object obj) {
		Student s=(Student) obj;
		if(standard!=s.standard) 
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return String.format("Student ID:"+id+" Student Name:"+name+" Student cgpa:"+cgpa+" Student Standard:"+standard+"\n");
	}
}

package com.techlab.model;

import java.util.Comparator;

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
	public int getId() {
		return id;
	}
	public String toString() {
		return String.format("Student ID:"+id+" Student Name:"+name+" Student cgpa:"+cgpa+" Student Standard:"+standard+"\n");
	}
	public static Comparator<Student> StNameComparator = new Comparator<Student>() {
		public int compare(Student s1,Student s2) {
			String StudentName1 = s1.getName().toUpperCase();
			String StudentName2 = s2.getName().toUpperCase();
			return StudentName1.compareTo(StudentName2);
		}
	};
	public static Comparator<Student> StIdComparator = new Comparator<Student>() {
		public int compare(Student s1,Student s2) {
			int StudentId1 = s1.getId();
			int StudentId2 = s2.getId();
			return StudentId1-StudentId2;
		}
	};
	public static Comparator<Student> StCgpaComparator = new Comparator<Student>() {
		public int compare(Student s1,Student s2) {
			int StudentCgpa1 = s1.getCgpa();
			int StudentCgpa2 = s2.getCgpa();
			return StudentCgpa1-StudentCgpa2;
		}
	};
}

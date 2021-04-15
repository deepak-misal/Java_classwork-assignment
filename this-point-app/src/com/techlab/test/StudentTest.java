package com.techlab.test;

import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1;
		s1=new Student(2,"deepak",21);
		printStudentInfo(s1);
		Student s2;
		s2=new Student(3,"xyz");
		printStudentInfo(s2);
		Student student_elder = s1.whoIsElder(s2);
		System.out.println("Elder:"+student_elder.getName());

	}
	
	
	

	private static void printStudentInfo(Student s1) {
		System.out.println("ID:"+s1.getId());
		System.out.println("NAME:"+s1.getName());
		System.out.println("AGE:"+s1.getAge());
		System.out.println("Hashcode:"+s1.hashCode());
		
	}

}

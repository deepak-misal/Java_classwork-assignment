package com.techlab.test;

import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1;
		s1 = new Student();
		s1.setId(55);
		s1.setName("deepak");
		s1.setAge(23);
		printStudentInfo(s1);

	}

	private static void printStudentInfo(Student s) {
		System.out.println("ID:" + s.getId());
		System.out.println("NAME:" + s.getName());
		System.out.println("AGE:" + s.getAge());

	}

}

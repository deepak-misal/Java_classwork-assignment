package com.techlab.test;

import java.util.Set;
import java.util.TreeSet;

import com.techlab.model.SortByNameStrategy;
import com.techlab.model.Student;

public class Test {

	public static void main(String[] args) {
		Set<Student> students=new TreeSet<Student>(new SortByNameStrategy());
		Student s1=new Student(1,"deepak",9,"a");
		Student s2=new Student(2,"abc",7,"b");
		Student s3=new Student(3,"pqr",8,"a");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.println(students.toString());
		//printInfo(students);

	}


}

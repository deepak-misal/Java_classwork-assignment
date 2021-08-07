package com.techlab.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		Student s1=new Student(4,"abc",8,"a");
		Student s2=new Student(2,"pqr",7,"a");
		Student s3=new Student(3,"xyz",9,"a");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("Before Sorting:");
		Iterator i=list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("After Sorting By Name:");
		Collections.sort(list, Student.StNameComparator);
		Iterator i1=list.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		
		System.out.println("After Sorting By Id:");
		Collections.sort(list, Student.StIdComparator);
		Iterator i2=list.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
		
		System.out.println("After Sorting By Cgpa:");
		Collections.sort(list, Student.StCgpaComparator);
		Iterator i3=list.iterator();
		while(i3.hasNext())
			System.out.println(i3.next());
	}

}

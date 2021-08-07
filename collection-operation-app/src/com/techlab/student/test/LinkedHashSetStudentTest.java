package com.techlab.student.test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.techlab.model.Student;

public class LinkedHashSetStudentTest {

	public static void main(String[] args) {
		Set<Student> set=new LinkedHashSet<Student>();
		Student s1=new Student(1,"abc",8.5,"a");
		Student s2=new Student(1,"abc",8.5,"a");
		Student s3=new Student(1,"abc",8.5,"a");
		Student s4=new Student(1,"abc",8.5,"b");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println("Initial Set:"+set);
		Iterator<Student> i = set.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		set.remove(s3);
		System.out.println("After Removal:"+set);

	}

}

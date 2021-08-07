package com.techlab.student.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Student;

public class ListStudentTest {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		Student s1=new Student(1,"abc",8.5,"a");
		Student s2=new Student(2,"xyz",8.9,"a");
		Student s3=new Student(3,"pqr",9.5,"a");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("Initial List:"+list);
		list.set(0, s3);
		System.out.println("Updated List:"+list);
		Student element=list.get(1);
		System.out.println("Information about student 1:"+element);
		list.remove(2);
		System.out.println("After removal:"+list);
		
	}

}

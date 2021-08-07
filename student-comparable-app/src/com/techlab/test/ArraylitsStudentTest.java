package com.techlab.test;
import java.util.ArrayList;
import java.util.*;

import com.techlab.model.Student;

public class ArraylitsStudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<Student>();
		Student s1=new Student(1,"abc",8,"a");
		Student s2=new Student(2,"abc",7,"a");
		Student s3=new Student(3,"abc",9,"a");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list);

		   for(Student str: list){
				System.out.println(str);
		   }
	}

}

package com.techlab.student.test;

import java.util.HashMap;
import java.util.Map;

import com.techlab.model.Student;

public class HashMapStudentTest {

	public static void main(String[] args) {
		Map<Integer,Student> map=new HashMap<Integer, Student>();
		Student s1=new Student(1,"abc",8.5,"a");
		Student s2=new Student(2,"xyz",8.9,"a");
		Student s3=new Student(3,"pqr",9.5,"a");
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		System.out.println("Initial map:\n"+map);
		for (Map.Entry<Integer, Student> me : map.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
		map.put(2,s3);
		System.out.println("After updating:"+map);
		map.remove(3);
		System.out.println("After reomval:"+map);

	}

}

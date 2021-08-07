package com.techlab.test;

import com.techlab.model.InvalidAgeException;
import com.techlab.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p=new Person(1,"abc",17);
		printPersonInfo(p);
		try {
			p.validateAge(17);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void printPersonInfo(Person p) {
		System.out.println("Person id:"+p.getId());
		System.out.println("Person name:"+p.getName());
		System.out.println("Person age:"+p.getAge());
		System.out.println("\n");
		
	}

}

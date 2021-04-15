package com.techlab.test;

import com.techlab.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p1;
		p1 = new Person(1, "abc", 6, 50);
		personInfo(p1);
		p1.eat();
		personInfo(p1);
		p1.play();
		personInfo(p1);

	}

	private static void personInfo(Person p) {
		System.out.println("ID:" + p.getId());
		System.out.println("NAME:" + p.getName());
		System.out.println("HEIGHT:" + p.getHeight());
		System.out.println("WEIGHT:" + p.getWeight());

	}

}

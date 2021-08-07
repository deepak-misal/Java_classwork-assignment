package com.techlab.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("abc");
		set.add("xyz");
		System.out.println("Initial Set:" + set);
		Iterator<String> i = set.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		set.remove("xyz");
		System.out.println("After Removal:" + set);


	}

}

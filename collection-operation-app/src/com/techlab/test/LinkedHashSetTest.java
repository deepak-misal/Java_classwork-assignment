package com.techlab.test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
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

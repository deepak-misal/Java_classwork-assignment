package com.techlab.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("abc");
		hash_Set.add("xyz");
		System.out.println("Initial Set:" + hash_Set);
		Iterator<String> i = hash_Set.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		hash_Set.remove("xyz");
		System.out.println("After Removal:" + hash_Set);

	}

}

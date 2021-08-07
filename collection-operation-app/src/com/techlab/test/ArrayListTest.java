package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		System.out.println("Initial List:"+list);
		list.set(1, "pqr");
		System.out.println("Updated List:"+list);
		System.out.println("Reading List:");
		for (int i = 0; i < list.size(); i++) {
			  
            System.out.println(list.get(i) + " ");
        }
		String element=list.get(0);
		System.out.println("Element at 0th position:"+element);
  
		list.remove(1);
		System.out.println("After Removal:"+list);

	}

}

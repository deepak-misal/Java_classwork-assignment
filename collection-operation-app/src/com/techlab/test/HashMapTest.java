package com.techlab.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
		System.out.println(map);
		for (Map.Entry<String, Integer> me : map.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
		map.put("two", 22);
		System.out.println("After updating:"+map);
		map.remove("three");
		System.out.println("After reomval:"+map);

	}

}

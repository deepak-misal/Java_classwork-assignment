package com.techlab.model;

import java.util.Comparator;

public class SortByNameStrategy implements Comparator<Student>{

	@Override
	public int compare(Student first, Student second) {
		return first.getName().compareTo(second.getName());
	}

}

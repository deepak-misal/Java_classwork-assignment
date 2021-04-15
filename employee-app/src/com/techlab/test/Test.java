package com.techlab.test;

import com.techlab.model.Employee;
import com.techlab.model.Programmer;

public class Test {

	public static void main(String[] args) {
		Employee e1;
		e1 = new Employee(1, "abc", 25000);
		printEmployeeInfo(e1);
		Programmer p1;
		p1 = new Programmer(2, "xyz", 30000, 5000);
		printProgrammerInfo(p1);

	}

	private static void printProgrammerInfo(Programmer p) {
		System.out.println("ID:" + p.getId());
		System.out.println("NAME:" + p.getName());
		System.out.println("SALARY:" + p.getSalary());
		System.out.println("BONUS:" + p.getBonus());

	}

	private static void printEmployeeInfo(Employee e) {
		System.out.println("ID:" + e.getId());
		System.out.println("NAME:" + e.getName());
		System.out.println("SALARY:" + e.getSalary());

	}

}

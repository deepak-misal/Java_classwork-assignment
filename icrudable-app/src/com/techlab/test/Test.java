package com.techlab.test;

import com.techlab.model.CustomerDB;
import com.techlab.model.DepartmentDB;
import com.techlab.model.Icrudable;
import com.techlab.model.InvoiceDB;

public class Test {

	public static void main(String[] args) {
		doDbOperations(new DepartmentDB());
		doDbOperations(new InvoiceDB());
		doDbOperations(new CustomerDB());
		

	}
	private static void doDbOperations(Icrudable obj) {
		obj.create();
		obj.read();
		obj.update();
		obj.delete();
	}

}

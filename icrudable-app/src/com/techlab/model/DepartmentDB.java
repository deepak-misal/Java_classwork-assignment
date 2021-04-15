package com.techlab.model;

public class DepartmentDB implements Icrudable {
	@Override
	public void create() {
		System.out.println("Creating Database for department");

	}

	@Override
	public void read() {
		System.out.println("Reading Database for department");

	}

	@Override
	public void update() {
		System.out.println("Updating Database for department");

	}

	@Override
	public void delete() {
		System.out.println("Deleting Database for department");

	}
}

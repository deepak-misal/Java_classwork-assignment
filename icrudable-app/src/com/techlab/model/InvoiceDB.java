package com.techlab.model;

public class InvoiceDB implements Icrudable {
	@Override
	public void create() {
		System.out.println("Creating Database for invoice");

	}

	@Override
	public void read() {
		System.out.println("Reading Database for invoice");

	}

	@Override
	public void update() {
		System.out.println("Updating Database for invoice");

	}

	@Override
	public void delete() {
		System.out.println("Deleting Database for invoice");

	}
}

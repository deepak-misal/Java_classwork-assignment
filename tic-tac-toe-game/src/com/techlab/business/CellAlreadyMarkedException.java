package com.techlab.business;

public class CellAlreadyMarkedException extends Exception{
	private String string;
	public CellAlreadyMarkedException(String string) {
		this.string=string;
	}
	public String getMessage() {
		return string;
	}

	private String toString(String string) {
		return string;
	}

}

package com.techlab.model;

public class InvalidAgeException extends Exception {
	private Person p;
	private int age;
	private String msg;
	public InvalidAgeException(Person p,int age) {
		this.p=p;
		this.age=age;
	}
	public void setMessage() {
		StringBuilder str=new StringBuilder();
		str.append("Invalid age\nPerson id:"+p.getId()+"\nPerson name:"+p.getName()+"\nPerson age:"+p.getAge());
		str.append("\nCan not vote because of invalid age:"+age);
		this.msg=str.toString();
	}
	public String getMessage() {
		this.setMessage();
		return msg;
	}

}

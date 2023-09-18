package com.jsp.maps;

public class Student {
	int id;
	String name;
	String email;
	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "["+id+" "+name+" "+email+"]";
	}
}

package com.jsp.varibleshadowing;

public class Student {
	
	int id=276;
	String name="XYZ";
	
	public static void main(String[] args) {
		int id=123;
		String name ="ABC";
		System.out.println(id);
		System.out.println(name);
	}

}

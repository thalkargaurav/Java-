package com.jsp.varibleshadowing;

public class Driver {
	public static void main(String[] args) {
		A a = new B();
		
		//always refers to object reference.
		//irrespective of static or non static.
		
		System.out.println(a.i);
		System.out.println(a.j);
	}

}

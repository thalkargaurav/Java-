package com.jsp.methodshadowing;

public class Driver {
	public static void main(String[] args) {
		A a = new B();
		a.m2();  //this is non-static method so it be over-riden.
		
		a.m1();  //this is static method so it will not override.
	}
	
	

}

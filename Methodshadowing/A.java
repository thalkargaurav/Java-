package com.jsp.methodshadowing;

public class A {
	
	public static void m1() {
		System.out.println("Static method m1() of A");
	}
	
	public void m2() {
		System.out.println("Non-static method m2() of A");
	}

}

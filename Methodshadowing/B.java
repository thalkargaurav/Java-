package com.jsp.methodshadowing;

public class B extends A {
	@Override
	public void m2() {
		System.out.println("m2 overridden by b");
	}
	
	public static void m1() {
		System.out.println("Static method m1() of B");
	}

}

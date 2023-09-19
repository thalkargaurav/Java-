package com.jsp.exception_handling;

public class ThrowsDeclaration {
	public static void main(String[] args) throws ArithmeticException,StringIndexOutOfBoundsException {
		int m=24; int n=0; String s="";
		System.out.println(m/n);
		System.out.println(s.charAt(5));
	}
}

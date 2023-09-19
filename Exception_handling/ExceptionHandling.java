package com.jsp.exception_handling;

public class ExceptionHandling {
	public static void main(String[] args) {
		int m=24;
		int n=2;
		String s="";
		try {
			int result=m/n;
			System.out.println(result);
			char c=s.charAt(5);
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}
}

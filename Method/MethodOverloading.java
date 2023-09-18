package com.jsp.methodoverloading;
public class MethodOverloading {
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public void sum(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String args[]) {
		MethodOverloading d=new MethodOverloading();
		d.sum(50, 20);
	}
}

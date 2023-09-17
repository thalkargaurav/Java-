package com.jsp.polymorphism;

public class Driver {
	public static void main(String[] args) {
		Son s = new Son();
		s.marry();
		
		Father f = new Son();
		f.marry();
	}

}

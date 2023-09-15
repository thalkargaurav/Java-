package com.jsp.string_programs;

public class ToReverseString {
	public static String reverseString(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;	
		}
		return rev;
	}
	
	public static void main(String[] args) {
		String s1="Hello";
		System.out.println(reverseString(s1));
	}

}

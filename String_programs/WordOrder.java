package com.jsp.string_programs;

public class WordOrder {
	public static void wordOrder(String str) {
		String s[]=str.split(" ");
		
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
}

	public static void main(String[] args) {
		String str="Hi Good Morning";
		wordOrder(str);

	}

}

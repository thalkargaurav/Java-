package com.jsp.wapperclass;
public class Wrapper {
	public static void main(String[] args) {
		//Boxing
		int a=20;
		Integer i=new Integer(a);
		Integer i2=Integer.valueOf(a);
		
		Integer b=a; //Auto-boxing
		
		//Unboxing
		int d=b.intValue();
		
		int c=b;  //Auto-unboxing
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}

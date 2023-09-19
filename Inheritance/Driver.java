package com.jsp.inheritance;

public class Driver {
	public static void main(String[] args) {
		
		//case1
		A a =new B();
		B b =(B)a;
		System.out.println(b.j);
		
		
		//case2
//		A a1 = new B(); //up casting
//		C c = (C)a1;    //down casting to child class type
//		System.out.println(c.k);  //leads to ClassCastException
		
		//case3
		A a3=new C();
		B b2 =(B)a3;
		System.out.println(b2.j);
	}

}

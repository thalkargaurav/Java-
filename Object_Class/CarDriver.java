package com.jsp.objectclass;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car("BMW","X5",6700000,"Marine Green");
		Car c2 = new Car("BMW","X5",6700000,"Marine Green");
		System.out.println(c1);  //toString
		System.out.println(c1.equals(c2));
		
		System.out.println("===============================");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}
}

package com.jsp.object;

public class LaptopDriver {
public static void main(String args[]) {
	Laptop laptop1=new Laptop();
	laptop1.brand="Acer";
	laptop1.price=129000.00;
	laptop1.processor="3.21GHz";
	laptop1.ram="16GB";
	
	System.out.println(laptop1.brand);
	System.out.println(laptop1.price);
	System.out.println(laptop1.processor);
	System.out.println(laptop1.ram);
	
	System.out.println("<=========================================>");
	
	Laptop l2=new Laptop();
	l2.brand="HP";
	l2.price=49000.00;
	l2.processor="3.00 GHz";
	l2.ram="8GB";
	System.out.println(l2.brand);
	System.out.println(l2.price);
	System.out.println(l2.processor);
	System.out.println(l2.ram);
	}

}

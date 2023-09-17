package com.jsp.object;

public class ConstructorOverloadingDriver {
	public static void main(String args[]) {
		ConstructorOverloading laptop=new ConstructorOverloading();
		
		ConstructorOverloading laptop2=new ConstructorOverloading("hp","16gb","intel");
		
		System.out.println(laptop2.ram);
		System.out.println(laptop2.brand);
		System.out.println(laptop2.processor);
		

}}

package com.jsp.object;

public class Pen {
	//defining attributes
	static String brand="Cello";
	static double price= 20.00;
	String color;
	String name;
	
	//define no argument user-defined constructor
	public Pen(){
		
		System.out.println("user defined constructor has been called");	
	}
	static {
	System.out.println("Program begins..s1");
	}
	{
		System.out.println("Object created Non-static Initializer");
	}
	
	

}

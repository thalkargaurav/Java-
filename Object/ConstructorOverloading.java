
package com.jsp.object;

public class ConstructorOverloading {
	
		//define attributes-properties
		String brand;
//		double price;
		String ram;
		String processor;
	
	
	public ConstructorOverloading(){
		System.out.println("Object loading started");
	}
	public ConstructorOverloading(String brand,String ram){
		this();
		this.brand=brand;
		this.ram=ram;
		
	}
	public ConstructorOverloading(String brand,String ram,String processor){
		this(brand,ram);
		this.processor=processor;
	}
	
	{
		System.out.println("NSI");
	}

}


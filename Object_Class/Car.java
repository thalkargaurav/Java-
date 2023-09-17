package com.jsp.objectclass;

import java.util.Objects;

public class Car {
	
	String brand;
	String name;
	double price;
	String color;
	
	public Car(String brand,String name,double price,String color) {
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	@Override
	public String toString() {
		return brand+" is car brand " +  name+" is car name "+price+" is car price "+color+" is car color";
	}
	
	@Override
	public boolean equals(Object obj) {
		Car c=(Car)obj;
		
		if(this.brand==c.brand && this.name==c.name && this.price==c.price && this.color==c.color) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public int hashCode(){
		return Objects.hash(brand,name,price,color);
	}

}

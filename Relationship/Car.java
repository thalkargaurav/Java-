package com.jsp.relationship;

public class Car {
	private String brand;
	private String name;
	private String color;
	private double price;
	
	private Engine engine;
	
	public Car(String brand,String name,String color,double price) {
		this.brand=brand;
		this.color=color;
		this.name=name;
		this.price=price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printCarDetails() {
		System.out.println("====Car====");
		System.out.println(name);
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		if(engine!=null) {
			engine.printEngine();
		}else {
			System.out.println("Engine is not present");
		}
	}
}

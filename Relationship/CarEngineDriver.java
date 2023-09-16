package com.jsp.relationship;

public class CarEngineDriver {
	public static void main(String[] args) {
		Car c1=new Car("BMW","X5","Aurora Green",6500000);
		c1.printCarDetails();
		
		c1.setEngine(new Engine("M5","2500cc"));
		c1.printCarDetails();
	}

}

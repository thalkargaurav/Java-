package com.jsp.relationship;

public class Mobile {
	private String Brand;
	private String model;
	private String color;
	private String ram;
	private String camera;
	
	private Sim1 sim1;
	private Sim2 sim2;
	
	public Mobile(String brand,String model,String color,String ram,String camera) {
		this.Brand=brand;
		this.model=model;
		this.color=color;
		this.camera=camera;
		this.ram=ram;
	}
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public Sim1 getSim1() {
		return sim1;
	}

	public void setSim1(Sim1 sim1) {
		this.sim1 = sim1;
	}

	public Sim2 getSim2() {
		return sim2;
	}

	public void setSim2(Sim2 sim2) {
		this.sim2 = sim2;
	}
	
	public void printMobileDetails() {
		System.out.println("====Mobile====");
		System.out.println(Brand);
		System.out.println(model);
		System.out.println(color);
		System.out.println(ram);
		System.out.println(camera);
		
		if(sim1!=null) {
			sim1.printSim1();
		}else {
			System.out.println("Sim1 not present");
		}
		
		if(sim2!=null) {
			sim2.printSim2();
		}else {
			System.out.println("Sim2 not present");
		}		
	}
}

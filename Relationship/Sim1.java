package com.jsp.relationship;

public class Sim1 {
	
	private String provider1;
	private String network1;
	private String speed1;
	
	public Sim1(String provider1,String network1,String speed1) {
		this.network1=network1;
		this.provider1=provider1;
		this.speed1=speed1;
	}

	public String getProvider1() {
		return provider1;
	}

	public void setProvider1(String provider1) {
		if(provider1==null) {
			System.out.println("Provider should not be empty");
		}else {
			this.provider1 = provider1;
		}
	}

	public String getNetwork1() {
		return network1;
	}

	public void setNetwork1(String network1) {
		this.network1 = network1;
	}

	public String getSpeed1() {
		return speed1;
	}

	public void setSpeed1(String speed1) {
		this.speed1 = speed1;
	}
	
	public void printSim1() {
		System.out.println("=====Sim1=====");
		System.out.println(provider1);
		System.out.println(network1);
		System.out.println(speed1);
		
	}
}

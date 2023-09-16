package com.jsp.relationship;

public class Sim2 {
	private String provider2;
	private String network2;
	private String speed2;
	
	public Sim2(String provider2,String network2,String speed2) {
		this.network2=network2;
		this.provider2=provider2;
		this.speed2=speed2;
	}

	public String getProvider2() {
		return provider2;
	}

	public void setProvider2(String provider2) {
		if(provider2==null) {
			System.out.println("Provider2 should not be empty");
		}else {
			this.provider2 = provider2;
		}
	}

	public String getNetwork2() {
		return network2;
	}

	public void setNetwork2(String network2) {
		this.network2 = network2;
	}

	public String getSpeed2() {
		return speed2;
	}

	public void setSpeed2(String speed2) {
		this.speed2 = speed2;
	}
	
	public void printSim2() {
		System.out.println("=====Sim2=====");
		System.out.println(provider2);
		System.out.println(network2);
		System.out.println(speed2);
		System.out.println("==============");
	}
	
	

}

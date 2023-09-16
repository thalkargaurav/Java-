package com.jsp.relationship;

public class MobileSimDriver {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Samsung","S23 Ultra","Lunar Grey","16GB","108MP");
		m1.printMobileDetails();
		
		m1.setSim1(new Sim1("Airtel","5G","upto 500 Mbps"));
		m1.setSim2(new Sim2("Vodafone","4G+","upto 150 Mbps"));
		m1.printMobileDetails();
	}
}

package com.jsp.object;

public class Students {
	String name;
	String email;
	String password;
	long contactno;
	
	
	public Students() {
		System.out.println("No args constr callled");
	}
	
	public Students(String n,String email,String password) {
		this.name=n;
		this.email=email;
		this.password=password;
		
	}
	
	public Students(String n,String email,String password,long contactno) {
		this.name=n;
		this.email=email;
		this.password=password;
		this.contactno=contactno;
	}

}

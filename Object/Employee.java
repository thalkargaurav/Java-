package com.jsp.object;

public class Employee {
	String name;
	int id;
	double salary;
	String Designation;
	String email;
	
	public Employee() {
		System.out.println("No args constr");
		}
	public Employee(String n,int id,double salary,String Designation,String email) {
		this.name=n;
		this.id=id;
		this.email=email;
		this.Designation=Designation;
		this.salary=salary;
	}
	{
		System.out.println("NSI");
	}

}

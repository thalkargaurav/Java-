package com.jsp.object;

public class EmployeeDriver {
	public static void main (String args[]) {
		Employee e1=new Employee();
		Employee e2=new Employee("XYZ",1024,5500,"Manager","xyz@gmail.com");
		System.out.println(e2.name);
		System.out.println(e2.salary);
		System.out.println(e2.id);
		System.out.println(e2.Designation);
		System.out.println(e2.email);
		
	}

}

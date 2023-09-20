package com.jsp.encapsulation;

public class EmployeeDriver {
	public static void main(String[] args) {
		
		Employee e1=new Employee();	
		e1.setId(234);
		e1.setName("Tushar");
		e1.setEmail("tman@gmail.com");
		e1.setCno(7710933547l);
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getCno());
		System.out.println(e1.getEmail());
	}
	
	

}

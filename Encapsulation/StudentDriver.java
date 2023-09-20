package com.jsp.encapsulation;

public class StudentDriver {
	
	public static void main(String args[]) {
		Student stu1=new Student();
		stu1.setId(276);
		stu1.setName("Tushar");
		stu1.setCno(7710933547l);
		stu1.setEmail("Tushar@gmail.com");
		
		System.out.println(stu1.getId());
		System.out.println(stu1.getName());
		System.out.println(stu1.getCno());
		System.out.println(stu1.getEmail());
	}
}

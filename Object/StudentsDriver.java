package com.jsp.object;

public class StudentsDriver {
	public static void main(String args[]) {
		
		Students s1=new Students();
		
		Students s2=new Students("xyz","xyz@mail.com","pass123",1234);
		System.out.println(s2.name);
		System.out.println(s2.email);
		System.out.println(s2.password);
		System.out.println(s2.contactno);
		Students s3=new Students("abc","abc@mail.com","pass456");
		System.out.println(s3.name);
		System.out.println(s3.email);
		System.out.println(s3.password);
		System.out.println(s3.contactno);
	}

}

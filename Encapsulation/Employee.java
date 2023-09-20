package com.jsp.encapsulation;

public class Employee {
	private int id;
	private String name;
	private String email;
	private long cno;
	
	
//	setter for id
	
	public void setId(int id) {
		if(id>0) {
			this.id=id;
		}else {
			System.out.println("Enter A Valid ID");
		}
	}
//	getter for id
	public int getId() {
		return id;
	}
	
	
	
//	setter for name
	public void setName(String name)
	{
		this.name=name;
	}
//	getter for name
	public String getName() {
		return name;
	}
	
	
	
//	setter email
	public void setEmail(String email)
	{
		this.email=email;
	}
//	getter for email
	public String getEmail() {
		return email;
	}
	
	
//	setter for cno
	public void setCno(long cno)
	{
		this.cno=cno;
	}
//	getter for cno
	public long getCno() {
		return cno;
	}
}

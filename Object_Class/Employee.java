package com.jsp.objectclass;

import java.util.Objects;

public class Employee {
	
	int id;
	String name;
	String email;
	
	
	public Employee(int id, String name,String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	// 1). toString example
	@Override
	public String toString() {
		return id+" is emp id " +  name+" is name "+email+" is email";
	}
	
	
	// 2). boolean equals example
	@Override
	public boolean equals (Object obj) {
		Employee e =(Employee)obj;
		if(this.id==e.id && this.name==e.name && this.email==e.email) {
			return true;
		}else {
			return false;
		}
	}
	
	// 3). hashCode example
	@Override
	public int hashCode() {
		return Objects.hash(id,name,email);
	}

}

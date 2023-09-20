package com.jsp.encapsulation;

public class Student {
	private int id;
	private String name;
	private String email;
	private long cno;
	
	
//	setter--->id
	public void setId(int id) {
		if(id>0) {
			this.id=id;
		}
	}
//	getter-->id
	public int getId() {
		return id;
	}
	
	//setter---> name
	public void setName(String name) {
					this.name=name;
		
	}
//	getter--->name
	public String getName() {
		return name;
	}
	
	//setter---> email
		public void setEmail(String email) {
		    this.email=email;	
		}
	//getter-->email	
		public String getEmail() {
			return email;
		}
		
//		setter--->cno
		public void setCno(long cno) {
				this.cno=cno;	
		}
//getter-->cno
		public long getCno() {
			return cno;
		}

}

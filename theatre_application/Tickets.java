package com.jsp.theatre_application;

public class Tickets {
	private String movie_name;
	private int no_of_tickets;
	
	//constructor
	public Tickets(String m, int n) {
		this.movie_name=m;
		this.no_of_tickets=n;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public int getNo_of_tickets() {
		return no_of_tickets;
	}

	public void setNo_of_tickets(int no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
	
	public void printTicketsDetails() {
		System.out.println("=====Tickets=====");
		System.out.println("Movie name "+movie_name);
		System.out.println("Tickets booked "+no_of_tickets);
	}
	
	
	

}

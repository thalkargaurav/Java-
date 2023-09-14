package com.jsp.theatre_application;

import java.util.Scanner;

public class BoxOffice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theatre threatre=new Theatre("inox",500);
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1. Show Availability 2. Book tickets 3. To check ticket deatils 4. Cancel ticket 5. Exit");
			int n=sc.nextInt();
			switch(n){
			case 1:{
				int number_of_seats=threatre.getNo_of_seats();
				System.out.println(number_of_seats+" Seats are available");
			}break;
			
			case 2:{
				System.out.println("Enter the movie name");
				String name=sc.next();
				System.out.println("Enter the number of seats");
				int num=sc.nextInt();
				threatre.setTicket(new Tickets(name,num));
				int res=threatre.bookTicket();
				System.out.println("Successfully Booked "+res+" tickets");
			}break;
			
			case 3:{
				System.out.println("Ticket Details");
				Tickets
				t=threatre.getTicket();
				System.out.println(t.getMovie_name());
				System.out.println(t.getNo_of_tickets());
			}break;
			
			case 4:{
				System.out.println("Enter the number of tickets to be cancelled");
				int cancel=sc.nextInt();
				threatre.cancelTicket(cancel);
			}break;
			
			case 5:{
				System.out.println("Thank you for using our service");
				flag=false;
			}break;
			
			default:{
				System.out.println("Wrong choice");
			}break;
			}		
		}	
	}

}

package com.jsp.exception_handling;

import java.util.Scanner;

public class Matrimony {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age<=20) {
			try {
				throw new UnderAgeLimitException();
			}catch(UnderAgeLimitException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}else 
			if(age>40){
			try {
				throw new OverAgeLimitException();
		}catch(OverAgeLimitException e) {
			e.printStackTrace();

		}
		}else {
			System.out.println("Good to go");
		}
	}

}

package com.jsp.arrays;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a int value");
			a[i]=sc.nextInt();
		}
			
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		}
	}
	

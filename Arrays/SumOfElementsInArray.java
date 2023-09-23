package com.jsp.arrays;

public class SumOfElementsInArray {
	
	public static int sumOfArray(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];		
	}
		return sum;
	}
	
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
			System.out.println(sumOfArray(a));
		}
		
	}


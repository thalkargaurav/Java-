package com.jsp.arrays;

public class LargestNumberInArray {
	public static int largestNumber(int a[]) {
		int largest=a[0];
		for(int i=1;i<a.length;i++) {
			if(largest<a[i]) {
				largest=a[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println(largestNumber(a));
	}
}


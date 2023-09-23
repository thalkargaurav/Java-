package com.jsp.array_searching_algorithms;


//linear search
public class SearchElement {
	public static void searchElement(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				System.out.println(" "+i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int a[]= {23,37,46,25,46,78,99};
		searchElement(a, 46);
	}

}

package com.jsp.sorting_algorithms;

public class SelectionSort {
	
	public static int[] sortedArray(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		return a;
	}
	public static void main(String[] args) {
		int a[]= {1,4,3,7,9,12,25,13,100,72};
		int res[]=sortedArray(a);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}

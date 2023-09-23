package com.jsp.array_searching_algorithms;

public class BinarySearch {
	public static void binarySearch(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println("Value present at "+mid);
				break;
			}
			else if(arr[mid]>key) {
				high=mid-1;
			}else
				if(arr[mid]<key) {
					low=mid+1;
				}
			System.out.println("Value not found");
			}
	}
	public static void main(String[] args) {
		int arr[]= {2,14,16,26,28,56,89,99};
		binarySearch(arr, 46);
	}

}

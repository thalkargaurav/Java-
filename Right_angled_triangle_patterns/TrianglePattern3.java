package com.jsp.right_angled_triangle_patterns;

public class TrianglePattern3 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			//to print spaces
			for(int s=1;s<=i-1;s++) {
				System.out.print(" ");	
			}
			for(int j=n;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

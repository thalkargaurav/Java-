package com.jsp.right_angled_triangle_patterns;

public class TrianglePattern1 {
	public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		//to print spaces
		for(int s=1;s<= n - i;s++) {
			System.out.print(" ");	
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
}

}

package com.jsp.left_angled_triangle_patterns;

public class TrianglePattern4 {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i%2);
				
			}
			System.out.println(" ");
		}
	}

}

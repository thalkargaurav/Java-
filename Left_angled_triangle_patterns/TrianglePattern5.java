package com.jsp.left_angled_triangle_patterns;

public class TrianglePattern5 {
	public static void main(String[] args) {
		int n=6;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i-j+1);
				
			}
			System.out.println();
		}
	}

}

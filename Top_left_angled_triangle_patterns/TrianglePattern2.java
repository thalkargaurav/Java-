package com.jsp.top_left_angled_triangle_patterns;

public class TrianglePattern2 {
	public static void main(String[] args) {
		int n=5;
		int k=1;
		for(int i=5;i>=1;i--) {
			for(int j=n;j>=k;j--) {
				System.out.print(j);
			}
			k++;
			System.out.println();
			
		}
	}

}

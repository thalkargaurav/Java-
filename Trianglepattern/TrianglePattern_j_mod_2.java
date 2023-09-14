package com.jsp.trianglepattern;

public class TrianglePattern_j_mod_2 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
				for(int j=1;j<=2*i-1;j++) {
					System.out.print(j%2);
			}
				System.out.println();
		}
	}
	}


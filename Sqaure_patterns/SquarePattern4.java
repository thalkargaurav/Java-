package com.jsp.sqaure_patterns;

public class SquarePattern4 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				System.out.print(i%2);
			}
			System.out.println();
		}
	}

}

package com.jsp.sqaure_patterns;

public class SqaurePattern8 {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(70-j)+" ");
				
			}
			System.out.println();
		}
	}

}

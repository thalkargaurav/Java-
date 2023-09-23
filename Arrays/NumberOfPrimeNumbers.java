package com.jsp.arrays;
import com.jsp.logicalprogramming.PrimeNumber;
public class NumberOfPrimeNumbers {
	
	public static boolean isPrime(int n) 
	  {
			int count=0;
			for(int i=1;i<=n;i++) 
			{
				if(n%i==0) 
				{
					count++;
				}
			}
			if(count==2)
			{
				return true;
			}else 
			{
				return false;
			}		
}
	public static void primeNumber(int a[]) {
		int count1=0;
		for(int i=0;i<a.length;i++) {
			boolean flag=isPrime(a[i]);
			if(flag==true) {
				count1++;
			}	
		}
		System.out.println(count1);
	}
	public static void main(String[] args) {
		int a[]= {1,3,2,7,8,9};
		primeNumber(a);
	}
}

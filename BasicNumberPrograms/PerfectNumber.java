package BasicNumberPrograms;

public class PerfectNumber {

	public static void isPerfectNumber(int n) {
		int sum=0;
for (int i=1;i<=n;i++) {
	if (n%i==0) 

		sum=sum+i;

}

	if(sum==n)	
	{
		System.out.println("is a perfect number");
	}else {
		System.out.println("is not perfect number");

	}


	}

	public static void main(String[]args) {

	 isPerfectNumber(28);


}
}

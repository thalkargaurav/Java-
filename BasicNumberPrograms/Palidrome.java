package BasicNumberPrograms;

public class Palidrome {

	public static void isPalidrome(int n) {
		int rev=0; int temp=n;
	while(n>0) {

		int temp1=n%10;
		rev=rev*10+temp1;
		n=n/10;
	}
	if(temp==rev)	
	{
		System.out.println("is a palidrome number");
	}else {
		System.out.println("is not palidrome number");

	}


	}

	public static void main(String[]args) {

	 isPalidrome(1111);


	}

}



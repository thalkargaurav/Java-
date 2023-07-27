package BasicNumberPrograms;

public class ReverseNumber {
	public static int isReverse(int n) {
		int rev=0;
	while(n>0) {

		int temp=n%10;
		rev=rev*10+temp;
		n=n/10;
	}
	return rev;		



	}

	public static void main(String[]args) {

	int r= isReverse(1298);
	System.out.print(r);

	}

}


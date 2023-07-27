package BasicNumberPrograms;

public class factorial {

	public static int printFactorial(int n) {
		int pro=1;
		while(n>0) {
			pro=pro*n;
			n--;
		}
		return pro;

	}

	public static void main(String[]args) {

	int r=	printFactorial(5);
	System.out.println(r);
	}

}

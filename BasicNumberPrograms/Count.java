package BasicNumberPrograms;

public class Count {
public static int countDigit(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;

	}

	public static void main(String[]args) {

	int r=	countDigit(1000);
	System.out.println(r);
	}


}




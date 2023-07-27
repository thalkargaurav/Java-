package BasicNumberPrograms;

public class Natural {

	public static int sumNaturalNumbers(int n) {
		int sum=0;
	for(int i=1;i<=n;i++) {

		sum=sum+i;

	}
	return sum;

		}


	public static void main(String[]args) {

	int r=	sumNaturalNumbers(6);
		System.out.println(r);
	}


}


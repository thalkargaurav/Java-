package BasicNumberPrograms;

public class Factors {

	public static void printFactors(int n) {

		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[]args) {

		printFactors(8);
	}




}

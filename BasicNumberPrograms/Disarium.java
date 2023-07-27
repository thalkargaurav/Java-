package BasicNumberPrograms;

public class Disarium {

	public static void main (String[] args) {
		int n=175;
		int sum=0;
		int count=0;
		int z=n;


		while(z>0) {
			z=z/10;
			count++;
		}
		z=n;

		while(z>0) {

			int pro=1;
			int ldigit=z%10;

			for(int i=1;i<=count;i++) {
				pro=pro*ldigit;
			}
			sum=sum+pro;
			z=z/10;
			count--;
		}if (sum==n) {

			System.out.println("is disarium number");
		}else {
			System.out.println("is  not disarium number");
		}

	}
	}




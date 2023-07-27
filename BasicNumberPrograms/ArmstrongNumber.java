package BasicNumberPrograms;

public class ArmstrongNumber{
	public static void main (String[] args) {
		int n=153;
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
		}if (sum==n) {

			System.out.println("is armstrong number");
		}else {
			System.out.println("is  not armstrong number");
		}

	}
	}

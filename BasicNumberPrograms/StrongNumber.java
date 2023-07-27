package BasicNumberPrograms;

public class StrongNumber {
	public static void main(String args []) {
		int n=145; int temp=n; int sum=0;

		while(temp>0) {
			int lastdigit=temp%10;
			int fact=1;

			for(int i=1;i<=lastdigit;i++) {

				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}if (sum==temp) {
			System.out.println("is strong number");
		}else {
			System.out.println("is strong number");
		}
	}

}
package BasicNumberPrograms;

public class Xylem {

	public static void main(String []args) {
		int innersum=0;int  count1=0;
		int outersum=0;int  count2=0;
		int n=1447; int p=n;

		while(n>0) {
			n=n/10;
			count1++;
		}
		p=n;
		while(p>0) {
		 p=p%10;
		count2++;
	}
	if(count2==1 || count2==count1) {
		innersum=innersum+p;
	}else {
		outersum=outersum+p;
	}p=p/10;
	if(outersum==innersum) {
		System.out.println("is a Xylem");
	}else {
		System.out.println("is a Pholem");
	}
	}
	}

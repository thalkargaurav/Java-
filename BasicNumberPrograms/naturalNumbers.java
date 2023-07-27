package BasicNumberPrograms;

public class naturalNumbers {

	public static void printNaturalNumbers(int start,int end_limit) {

		while(start<=end_limit) {

			System.out.println(start);
			start++;
		}
	}

	public static void main(String[]args) {

		printNaturalNumbers(10,50);
	}


}
   


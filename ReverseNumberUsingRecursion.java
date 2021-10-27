import java.util.Scanner;

public class ReverseNumberUsingRecursion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = in.nextInt();
	    ReverseNumber(number);
	       

	}
	
	public static void ReverseNumber(int n) {
		if(n<10) {
			System.out.print(n);
		}
		else {
			System.out.print(n%10);
			ReverseNumber(n/10);
		}

	}


}


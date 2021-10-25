import java.util.Scanner;

public class ReverseNumberUsingForLoop {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = in.nextInt();
		int reverse =0;
		for(;number!=0;number/=10) {
			int remainder = number%10;
			reverse =reverse*10+remainder;
		}
		System.out.println("The Reverse of the number is : " + reverse );
	}

}

package exercises;

import java.util.Scanner;

public class product {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("please enter the first number");
	int number1 = scan.nextInt();
	System.out.println("please enter the second number");
	int number2 = scan.nextInt();
	int result = number1 * number2;
	System.out.println("the producte result is " + result);

	}

	
}

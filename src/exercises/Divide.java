package exercises;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
	Scanner scan1 = new Scanner (System.in);
	System.out.println("please enter a first number");
	int number1 = scan1.nextInt();
	
	System.out.println("please enter the second number");
	int number2 = scan1.nextInt();
	
	float divide = number1/number2;
System.out.println("the divide is " + divide);
	}

}

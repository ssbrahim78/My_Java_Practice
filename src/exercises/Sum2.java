package exercises;

import java.util.Scanner;

public class Sum2 {
public int a;
public int b;
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("please enter the first number" );
		int number1 = scan1.nextInt();
		System.out.println("please enter the second number");
		int number2 = scan1.nextInt();
		int total = number1 + number2;
		System.out.println("the sum of the two entred numbers is " + total);
		scan1.close();
		

	}

}

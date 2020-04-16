package exercises;

import java.util.Scanner;

public class MultiFunctions {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("please enter the first number");
        int number1 = scan.nextInt();
        System.out.println("please enter the second number");
        int number2 = scan.nextInt();
        System.out.println("the sum of tow numbers is " + (number1 + number2));
        System.out.println("the multipl of tow numbers is " + (number1 * number2));
        System.out.println("the subtract of tow numbers is " + (number1 - number2));
        System.out.println("the divid of tow nubers is " + (number1/number2));
        System.out.println("the reminder of tow numbers is " + (number1%number2));
	}

}

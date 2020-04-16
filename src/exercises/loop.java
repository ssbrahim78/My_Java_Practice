package exercises;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number");
		int number = scan.nextInt();
		System.out.println("the number entred is " + number);
		System.out.println("please enter the table number");
		int tabNumb = scan.nextInt();
		System.out.println("the table number entred is " + tabNumb);
		
		int i;
		
		for  ( i=1;i<=tabNumb;i++ ) {
			int multip = (i * number);
	System.out.println("the multiplication of "+ i +" and " + number + " is " + multip);
			
		}
		

	}

}

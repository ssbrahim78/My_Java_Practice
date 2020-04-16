package exercises;

import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
						// Integer.toBinaryString(a);
		int a ;	
		Scanner scan = new Scanner (System.in);
		System.out.println("please enter a decimal number");
		a = scan.nextInt();
		//int x = a;
		System.out.println("the binary number of the entred number is "+ Integer.toBinaryString(a));
		scan.close();
	}

}

package exercises;

import java.util.Scanner;

public class calcul {

	public static void main(String[] args) {
		//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		double number1;
		double number2;
		double number3;
		double number4;
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("please enter first number1 " );
		number1 = scan.nextDouble();
		System.out.println("please enter first number2 " );
		number2 = scan.nextDouble();
		System.out.println("please enter first number3 " );
		number3 = scan.nextDouble();
		System.out.println("please enter first number4 " );
		number4 = scan.nextDouble();
	double result =    (( number1*number2-number2*number2 )/(number3-number4)    );
System.out.println("the result of the calcul is " + result);
	}

}

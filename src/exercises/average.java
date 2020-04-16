package exercises;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		
		int i=1; 
	   double num = 0;
	    
		Scanner scan = new Scanner(System.in);
		// average = numer1+number2+number3/i
		System.out.println("please enter the number of average numbers ");
		int n = scan.nextInt();
		while ( i<=n) {
			
			System.out.println("please enter a number"+i);
		 double	number=scan.nextDouble();
			 num=num + number;		
			i++;
		}
		double Average= num/i;
		System.out.println("the average of "+ n +" numbers is " + Average);
		scan.close();
		
		
		
		
				

	}

}

package exercises;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int size;
		int i=0;
		int j=0 ;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the size of the array");
		size = scan.nextInt();
		System.out.println("the size of the array is " + size);
		
		int myarray [] = new int[ size];
		while (i<size) {
		System.out.println("please enter an integer number");
		int number = scan.nextInt();
		
		 myarray[i]= number;
		  sum += number;
		 i++;
		
		}
		while ( j<size) {
			
		System.out.println("the "+j+" number of myarray is " + myarray[j]);
		j++;
}   
		System.out.println("the sum of the array integer numbers is "+ sum);
		scan.close();
	}

}

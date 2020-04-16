package exercises;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		// area= length* width  and perimeter= (lenght + width)*2
Scanner scan = new Scanner(System.in);
System.out.println("please enter the lenght");
  double length = scan.nextDouble();
  System.out.println("please enter the width");
  double width = scan.nextDouble();
  double area = length * width;
	System.out.println("the area for the rectangle is " + area);	
	double perimeter = 2*(length+width);
	System.out.println("the perimeter of the rectangle is " + perimeter);
	scan.close();	
		
		
	}

}

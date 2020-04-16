package exercises;

import java.util.Scanner;

public class circel {

	public static void main(String[] args) {
		// area and perimeter
		// area = (3.14)r*r
		// perimeter =(3.14)2r 
		 Scanner scaner = new Scanner (System.in);
		 System.out.println("enter the radius value");
		 double radius = scaner.nextDouble();
		 double area = Math.PI*radius*radius;
		 double perimeter = Math.PI*2*radius;
		 System.out.println("the area for the circle is " + area);
		 System.out.println("the perimeter for the circle is " + perimeter);
	}
}

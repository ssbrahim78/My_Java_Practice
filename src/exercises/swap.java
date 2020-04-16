package exercises;

import java.util.Scanner;

public class swap {
    
    
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	System.out.println("please enter first variable");
	String variabl1 = scan.nextLine();
	System.out.println("please enter a second variable");
	String variabl2 = scan.nextLine();
	System.out.println("the variables entred "+ "variable1 is "+ variabl1 + "\n"+"the variables entred "+ "variable2 is "+ variabl2 );
    
	String var;
	var = variabl1 ;
    variabl1 = variabl2;
    variabl2 = var;
    System.out.println("after swap, variabl1 is "+ variabl1 + "\n"+ "variabl2 is " + variabl2);
	scan.close();
	}

}

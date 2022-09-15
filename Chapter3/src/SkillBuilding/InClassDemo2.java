package SkillBuilding;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InClassDemo2 
{

	/*
	  Here dealing with if then statements
	  also takes users input
	*/
	
	
	
	
	
	public static void main(String[] args)
	{
	
		Scanner userinput = new Scanner(System.in);
		// This sets up decimal format to work add as many zeros as you want and then you can format it to a large decimal
		DecimalFormat dc = new DecimalFormat("0.000");
		
		
		int x = 5;
		double y = 6.72323524323;
		char m = 'A';
		String name = "Vigor";
		
		final double PI = 3.14;
		

		/*
		System.out.println("x + x =" + (x + x));
		System.out.println("m");
		*/
		
		System.out.println("Enter an integer: ");// prompting an int 
		int numEntered = userinput.nextInt();//recording an int
		
		System.out.println("Is this the number you've entered: " + numEntered);
		System.out.println("Please type yes Y/N");
		char ans = userinput.next().charAt(0);
		
		if(ans == 'Y') 
		{
			System.out.println("Great! We will move on.");
		}
		else
		{
			System.out.println("Sorry.");
		}
		
		System.out.println(dc.format(y));
	
	
	}

}

package SkillBuilding;

import java.util.Scanner;


public class InClassDemo {

	public static void main(String[] args) 
	{
		
		// THIS IS A TUTORIAL 
		
		
		java.util.Scanner userinput = new Scanner(System.in);
		
		int age;
		double salary;
		String name; 
		char FirstIntitial;
		
		System.out.println("Please enter your full name");
		
		//name is conveyed don't do it twice so here just name no String name
		
		
		
		name = userinput.nextLine(); 
		
		
		System.out.println("Please enter your age");
		
		
		age = userinput.nextInt(); 
		
		
		System.out.println("The name you've entered is " + name + " and your age is " + age );
		
		/* Test without scanner
		
		
		
		//int is for full #'s
		int age = 13;
		
		//double is for decimals
		double salary = 100.0; 
		
		//String is for text
		String name = "Crecent";
		
		
		char firstIntitial = 'A';

		// This is using hard coding, hard coding the age and salary
		System.out.println("Your age is " + age + " and your salary is " + salary  );

		*/
	
	}

}

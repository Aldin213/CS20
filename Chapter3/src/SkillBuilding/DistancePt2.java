package SkillBuilding;

import java.util.Scanner;

public class DistancePt2
{
	public static void main(String[] args) 
	{
		/* java.util.Scanner userinput = new Scanner(System.in);
		
		String distance1 = userinput.nextLine();
		String distance2 = userinput.nextLine();
		String distance3 = userinput.nextLine();
		
		System.out.println("Please enter the first distance ");
		distance1 = userinput.nextLine();
		
		System.out.println("Please enter the second distance ");
		distance2 = userinput.nextLine();
		
		System.out.println("Please enter the third distance ");
		distance3 = userinput.nextLine();
	
		String total = distance1 + distance2 + distance3;
		
		System.out.println("The total distance is " + total);
	
		 */
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter the first race distance: ");// prompting an int 
		int numEntered = userinput.nextInt();//recording an int
	
		System.out.println("Enter the second race distance: ");// prompting an int 
		int numEntered1 = userinput.nextInt();//recording an int
		
		System.out.println("Enter the third race distance: ");// prompting an int 
		int numEntered2 = userinput.nextInt();//recording an int

		int z = numEntered * numEntered1 * numEntered2;
		
		
		System.out.println("The total distance traveled is " + z + " km");
	
		
		
		
	
		
		
		
		
		
	
	}
}
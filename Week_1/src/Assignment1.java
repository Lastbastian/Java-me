//**************************************************
// Assignment1.java
// inputs       : 
// outputs      : 
// Written by   : Chris Bastian
// Last Modified: 1/25/16
//**************************************************

import java.util.Scanner;
public class Assignment1 {
	public static void main(String args[])
	{
		int count;
		char goAgain = 'y';
		Scanner input = new Scanner(System.in);
		
		while (goAgain != 'n')
		{
			System.out.print("How many asterisks?: ");
			count = input.nextInt();
			
			for (int i = 0; i < count; i++)
			{
				System.out.println("*");
			}
			
			System.out.println();
			System.out.print("Go Again? (y/n): ");
			
			goAgain = input.next().charAt(0);
		}
	}
}
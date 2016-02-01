//**************************************************
// BlackJack.java
// inputs       : 
// outputs      : 
// Written by   : Chris Bastian
// Last Modified: 1/27/16
//**************************************************

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
	public static void main(String args[])
	{
		char play = 'y';
		Scanner input = new Scanner(System.in);
		
		while (play != 'n')
		{
			int dealerTotal = 0;
			int playerTotal = 0;
			char hitMe = 'n';
			boolean bust = false;
			boolean blackJack = false;
			
			Random rand = new Random();
			int card1 = rand.nextInt(10) + 1;
			int card2 = rand.nextInt(10) + 1;
			int sumTotal = card1 + card2; 
			
		
			System.out.println("**************** Welcome to Black Jack ****************");
			System.out.println("You have been delt a " + card1 + " and a " + card2 + ".");
			System.out.println("Your total is: " + sumTotal + ".");
			
			System.out.println("Would you like another card? ");
			hitMe = input.next().charAt(0);
			
			while (hitMe == 'y' || hitMe == 'Y')
			{
				int anotherCard = rand.nextInt(10) + 1;
				
				System.out.println("You drew a " + anotherCard + ".");
				sumTotal += anotherCard;
				System.out.println("Your total is now: " + sumTotal + ".");
				if (sumTotal > 21)
					System.out.println("Bummer!  You are over 21.");
				else if (sumTotal == 21)
					System.out.println("Sweetness You got 21.");
				else
					System.out.println("Would you like another card? ");
					hitMe = input.next().charAt(0);
				
			}
				
		
			System.out.print("Would you like to play again?");
			play = input.next().charAt(0);
		
		}
		
		System.out.println("Thanks for playing!");
		
		
	}
}
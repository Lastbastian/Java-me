//**************************************************
// BlackJack.java
// inputs       : 
// outputs      : 
// Written by   : Chris Bastian
// Last Modified: 2/1/16
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
			char hitMe = 'n';
			boolean bust = false;
			boolean blackJack = false;
			
			Random rand = new Random();
			int card1 = rand.nextInt(10) + 1;
			int card2 = rand.nextInt(10) + 1;
			int playerTotal = card1 + card2; 
			
		
			System.out.println("**************** Welcome to Black Jack ****************");
			System.out.println("You have been delt a " + card1 + " and a " + card2 + ".");
			System.out.println("Your total is: " + playerTotal + ".");
			
			System.out.println("Would you like another card? ");
			hitMe = input.next().charAt(0);
			
			while (hitMe != 'n')
			{
				int anotherCard = rand.nextInt(10) + 1;
				
				System.out.println("You drew a " + anotherCard + ".");
				playerTotal += anotherCard;
				System.out.println("Your total is now " + playerTotal + ".");
				
				if (playerTotal > 21)
				{
					System.out.println("Bummer!  You are over 21.");
					bust = true;
					break;
				}
				else if (playerTotal == 21)
				{
					System.out.println("Sweetness! You got 21.");
					break;
				}
				else
					System.out.println("Would you like another card? ");
					hitMe = input.next().charAt(0);
			}
			
			int dealerCard1 = rand.nextInt(10) + 1;
			int dealerCard2 = rand.nextInt(10) + 1;
			dealerTotal = dealerCard1 + dealerCard2;
			
			while (dealerTotal < 17 && !bust && !blackJack)
			{
				System.out.println("The dealer has " + dealerTotal + ".");
				System.out.println("The dealer hits below 17.");
				int anotherCard = rand.nextInt(10) + 1;
				dealerTotal += anotherCard;
				System.out.println("The dealer drew a " + anotherCard);
				System.out.println("The dealer's total is now " + dealerTotal + ".");
			}
			
			if (bust)
				System.out.println("You loose.");
			else if (dealerTotal > 21)
				System.out.println("The dealer is over 21. You win!");
			else if (dealerTotal == 21)
				System.out.println("The dealer has 21. You loose.");
			else if (dealerTotal > playerTotal)
				System.out.println("The dealer beat you. You loose.");
			else
				System.out.println("Congratulations! You beat the dealer!");
					
			System.out.print("Would you like to play again?");
			play = input.next().charAt(0);
		
		}
		System.out.println("Thanks for playing!");
	}
}
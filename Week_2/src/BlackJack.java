//**************************************************
// BlackJack.java
// inputs       : 
// outputs      : 
// Written by   : Chris Bastian
// Last Modified: 1/27/16
//**************************************************

import java.util.Random;

public class BlackJack {
	public static void main(String args[])
	{
		int dealerTotal = 0;
		int playerTotal = 0;
		boolean play = true;
		Random rand = new Random();
		int card1 = rand.nextInt(10) + 1;
		int card2 = rand.nextInt(10) + 1;
		int sumTotal = card1 + card2; 
		
	
		System.out.println("**************** Welcome to Black Jack ****************");
		System.out.println("You have been delt a " + card1 + " and a " + card2 + ".");
		System.out.println("Your total is: " + sumTotal + ".");
		System.out.println("Would you like another card? ");
		
		while play
			
			
	
		
	}
}
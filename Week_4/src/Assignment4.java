//**************************************************
// Assignment4.java
// inputs       : 
// outputs      : 
// Written by   : Chris Bastian
// Last Modified: 2/16/16
//**************************************************

import java.util.Scanner;

public class Assignment4
{
	public static void main(String[] args)
	{
		final int HAND_SIZE = 5;
		int[] hand = new int[HAND_SIZE];
		int[] cardCount = {0,0,0,0,0,0,0,0,0,0};
							
		System.out.println("Enter five numeric cards, no face cards. Use 2 - 9.");
		
		Scanner keyboard = new Scanner(System.in);
		
		// gets 5 cards from the user
		for(int index = 0; index < HAND_SIZE; index++)
		{
			System.out.print("Card " + (index + 1) + ": ");
			hand[index] = keyboard.nextInt();
		}
		
		// increments the card count for the hand
		for(int index = 0; index < HAND_SIZE; index++){
			cardCount[hand[index]] += 1;
		}
		
		// Logic
		if(containsFourOfaKind(cardCount)) {
			System.out.println("You have four of a kind!");
		} else if(containsFullHouse(cardCount)) {
			System.out.println("You have a full house!");
		} else if(containsStraight(cardCount)) {
			System.out.println("You have a straight");
		} else if(containsThreeOfaKind(cardCount)) {
			System.out.println("You have three of a kind!");
		} else if(containsTwoPair(cardCount)) {
			System.out.println("You have two pair!");
		} else if(containsPair(cardCount)) {
			System.out.println("You have a pair!");
		} else
			System.out.println("You have a highcard!");
	}
	
	public static boolean containsPair(int cardCount[])
	{
		boolean pair = false;
		int numberOfPairs = 0;
		
	 	for (int i = 0; i < cardCount.length; i++)
	 	{
			if (cardCount[i] == 2)
				numberOfPairs += 1;
		}
	 	if (numberOfPairs == 1)
	 		pair = true;
	 	return pair;
	}
	
	public static boolean containsTwoPair(int cardCount[])
	{
		boolean twoPair = false;
		int numberOfPairs = 0;
		
		for (int i = 0; i < cardCount.length; i++) {
			if (cardCount[i] == 2)
				numberOfPairs += 1;
		}
		if (numberOfPairs == 2)
				twoPair = true;
		return twoPair;
	}
	
	public static boolean containsThreeOfaKind(int cardCount[])
	{	
		boolean threeKind = false;
		
		for (int i = 0; i < cardCount.length; i++)
		{
			if(cardCount[i] == 3)
				threeKind = true;
		}
		return threeKind;		
	}
	
	public static boolean containsStraight(int cardCount[])
	{
		int streak = 0;
		boolean straight = false;
		
		for (int i = 0; i < cardCount.length; i++){
			if (cardCount[i] == 1 && cardCount[i+1] == 1){
				streak += 1;
			}
		}	
		if (streak == 4)
			straight = true;
		return straight;
	}
	
	
	
	public static boolean containsFullHouse(int cardCount[])
	{
		boolean fullHouse = false;
		boolean threeKind = false;
		
		int numberOfPairs = 0;	
		 for (int i = 0; i < cardCount.length; i++) {
			if (cardCount[i] == 2)
				numberOfPairs += 1;
		}
		
		for (int i = 0; i < cardCount.length; i++) {
			if (cardCount[i] == 3)
			threeKind = true;
		}
		
		if (numberOfPairs == 1 && threeKind == true)
			fullHouse = true;
		
		return fullHouse;
		
	}
	
	
	
	public static boolean containsFourOfaKind(int cardCount[])
	{
		boolean fourKind = false;
		
		for (int i = 0; i < cardCount.length; i++) {
			if (cardCount[i] == 4)
				fourKind = true;
		}
		return fourKind;
	}
}


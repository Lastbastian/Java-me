import java.util.Scanner;

public class PokerHands
{
	public static void main(String[] args)
	{
		final int HAND_SIZE = 5;
		int[] hand = new int[HAND_SIZE];
							
		System.out.println("Enter five numeric cards, no face cards. Use 2 - 9.");
		
		Scanner keyboard = new Scanner(System.in);
		
		for(int index = 0; index < HAND_SIZE; index++)
		{
			System.out.print("Card " + (index + 1) + ": ");
			hand[index] = keyboard.nextInt();
		}
		
		containsPair(hand);
		containsTwoPair(hand);
		containsThreeOfaKind(hand);
		containsStraight(hand);
		containsFullHouse(hand);
		containsFourOfaKind(hand);
		
		
	}
	
	public static boolean  containsPair(int hand[])
	{
		for(int index = 0; index < hand.length - 1; index++)
		{
			if(hand[index] == hand[index + 1]
					return true;
					
		}
	}
	
	public static boolean  containsTwoPair(int hand[])
	{
		
	}
	public static boolean  containsThreeOfaKind(int hand[])
	{
		
	}
	public static boolean  containsStraight(int hand[])
	{
		
	}
	public static boolean  containsFullHouse(int hand[])
	{
		
	}
	public static boolean  containsFourOfaKind(int hand[])
	{
		
	}
	
}


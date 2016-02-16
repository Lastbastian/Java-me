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
	}
	
}
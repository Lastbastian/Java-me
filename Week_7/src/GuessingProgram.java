import java.util.Scanner;

public class GuessingProgram {
	public static void main(String[] args)
	{
		char gameOn = 0;
			
		while (gameOn != 'n')
		{
			char response = 0;
			int midpoint = 0;
			
			System.out.println("Think of a number between 1 and 100.");
				
			NumberGuesser guesser = new NumberGuesser();
			
			while (response != 'c')
			{
				midpoint = guesser.getCurrentGuess(guesser);
				
				System.out.println("Is the number " +  midpoint + " (h/l/c):");	
				Scanner keyboard = new Scanner(System.in);
				response = keyboard.next().charAt(0);
				
				if (response == 'h')
					guesser.higher();
				else 
					guesser.lower();
			}
			
			System.out.println("You picked " + midpoint + "? Great pick.");
			System.out.println("Do you want to play again: (y/n): ");
			Scanner keyboard = new Scanner(System.in);
			gameOn = keyboard.next().charAt(0);
		}
		System.out.println("Thanks for playing. Goodbye.");
	}
}

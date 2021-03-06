import java.util.Scanner;

public class GuessingProgram {
	public static void main(String[] args)
	{
		char gameOn = 0;
			
		while (gameOn != 'n')
		{
			char response = 0;
			int guess = 0;
			
			System.out.println("Think of a number between 1 and 100.");
				
			RandomNumberGuesser guesser = new RandomNumberGuesser();
			
			while (response != 'c')
			{
				guess = guesser.getCurrentGuess(guesser);
//				System.out.println("Lower = " + guesser.lower + ", higher = " + guesser.upper + ", guess = " + guess);
				
				System.out.println("Is the number " +  guess + " (h/l/c):");	
				Scanner keyboard = new Scanner(System.in);
				response = keyboard.next().charAt(0);
				
				if (response == 'h')
					guesser.setHigher(guess);
				else 
					guesser.setLower(guess);
			}
			
			System.out.println("You picked " + guess + "? Great pick.");
			System.out.println("Do you want to play again: (y/n): ");
			Scanner keyboard = new Scanner(System.in);
			gameOn = keyboard.next().charAt(0);
		}
		System.out.println("Thanks for playing. Goodbye.");
	}
}

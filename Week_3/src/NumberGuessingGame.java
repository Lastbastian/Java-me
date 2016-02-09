import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args)
	{
		do {
		playOneGame();
		} while (shouldPlayAgain());
	}
	
	public static void playOneGame()
	{
		Scanner input = new Scanner(System.in);
		int number;
		boolean correct = false;
		
		System.out.println("********** Welcome to the guessing game! **********");
		System.out.println("Guess a number between 1 and 100. ");
		number = input.nextInt();
		
		int lowEnd = 1;
		int highEnd = 100;
		
		do {
			Scanner input1 = new Scanner(System.in);
			char guessResponse;
			
			int nextGuess = (highEnd - lowEnd) / 2;
			System.out.println("Is it " + nextGuess + "?  (h/l/c)");
			guessResponse = input1.next().charAt(0);
			
			if (guessResponse == 'h')
			{
				lowEnd = nextGuess;
				System.out.println("My highend is " + highEnd + "\n" + "My lowend is " + lowEnd);
			}
			else if (guessResponse == 'l')
			{
				highEnd = nextGuess;
				System.out.println("My highend is " + highEnd + "\n" + "My lowend is " + lowEnd);
			}
			else
				correct = true;
		} while (!correct);
		
	}
	
	public static boolean shouldPlayAgain()
	{
		
		Scanner input = new Scanner(System.in);
		char response;
		boolean result;
		
		System.out.println("Would you like to play again? (y/n)");
		response = input.next().charAt(0);
		
		if (response == 'y')
			result = true;
		else
			result = false;
		
		return result;
	}
	
}


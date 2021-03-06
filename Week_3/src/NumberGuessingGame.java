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
		int nextGuess;
		
		while (!correct) {
			nextGuess = getMidpoint(lowEnd, highEnd);
			char response = getUserResponseToGuess(nextGuess);
			
			if (response == 'h')
				lowEnd = nextGuess;
			else if (response == 'l')
				highEnd = nextGuess;
			else
				correct = true;
		}
	}
	
	public static int getMidpoint(int myLowEnd, int myHighEnd)
	{
		int midpoint;
		return midpoint = (myLowEnd + myHighEnd) / 2;		
	}
	
	public static char getUserResponseToGuess(int guess)
	{
		Scanner input = new Scanner(System.in);
		char guessResponse;
		
		System.out.println("Is it " + guess + "?  (h/l/c)");
		return guessResponse = input.next().charAt(0);
		
//		return guessResponse;
	}
	
	public static boolean shouldPlayAgain()
	{
		
		Scanner input = new Scanner(System.in);
		char response;
		boolean result;
		
		System.out.println("Great! Would you like to play again? (y/n)");
		response = input.next().charAt(0);
		
		if (response == 'y')
			return result = true;
		else
			return result = false;
	}
}


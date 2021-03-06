import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser 
{
	Random rand = new Random();
	
	/**
	 * No args constructor to initialize a NumberGuesser object
	*/
	public RandomNumberGuesser()
	{
		lower = 1;
		upper = 100;
	}
	
	
	/**
	 * A constructor that takes two arguments and initializes a NumberGuesser object
	 * @param lowerBound
	 * @param upperBound
	 */
	public RandomNumberGuesser(int lowerBound, int upperBound)
	{
		lower = lowerBound;
		upper = upperBound;
	}
	
	
	/**
	 * The getCurrentGuess method overrides NumberGuesser method. Takes a NumberGuesser object and returns an int
	 * @param NumberGuesser object
	 * @return an random int generated between the lower and upper bounds
	 */
	@Override
	public int getCurrentGuess(NumberGuesser guess)
	{
		return rand.nextInt((guess.upper - guess.lower) + 1) + guess.lower;	
	}
}

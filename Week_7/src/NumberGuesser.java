public class NumberGuesser
{
	private int lower;
	private int upper;
	private int midpoint;
	
	// No args constructor
	public NumberGuesser()
	{
		lower = 1;
		upper = 100;
	}
	
	// Constructor with arguments
	public NumberGuesser(int lowerBound, int upperBound)
	{
		lower = lowerBound;
		upper = upperBound;
	}
	
	void higher()
	{
		// set lower to midpoint and higher stays the same
		lower = midpoint;
	}
		
	void lower()
	{
		upper = midpoint;
	}
	
	public int getCurrentGuess(NumberGuesser guess)
	{
		return midpoint = (guess.lower + guess.upper) / 2;
	}
	
	
	void reset()
	{
		
	}
}
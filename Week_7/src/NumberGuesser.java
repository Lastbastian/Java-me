public class NumberGuesser
{
	private int lower;
	private int upper;
	private int midpoint;
	
	/**
	 * No args constructor to initialize a NumberGuesser object
	 */
	public NumberGuesser()
	{
		lower = 1;
		upper = 100;
	}
	
	/**
	 * A constructor that takes two arguments and initializes a NumberGuesser object
	 * @param lowerBound
	 * @param upperBound
	 */
	public NumberGuesser(int lowerBound, int upperBound)
	{
		lower = lowerBound;
		upper = upperBound;
	}
	
	/**
	 * The higher method stores a value in the lower field
	 */
	void higher()
	{
		lower = midpoint;
	}
		
	
	/**
	 * The lower method stores a value in the upper field
	 */
	void lower()
	{
		upper = midpoint;
	}
	
	/**
	 * The getCurrentGuess method takes a NumberGuesser object and returns an int
	 * @param NumberGuesser object
	 * @return an int quotient of lower times upper divided by 2
	 */
	public int getCurrentGuess(NumberGuesser guess)
	{
		return midpoint = (guess.lower + guess.upper) / 2;
	}
	
	
	/**
	 * The reset method stores values in the lower and upper fields
	 */
	void reset()
	{
		lower = 1;
		upper = 100;
	}
}
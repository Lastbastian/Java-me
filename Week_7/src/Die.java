import java.util.Random;

public class Die {
	private int sides;
	private int value;
	
	// Constructor
	public Die(int numSides)
	{
		sides = numSides;
		roll();
	}
	
	// Roll class which sets the value of the roll
	public void roll()
	{
		Random rand = new Random();
	
		value = rand.nextInt(sides + 1);
	}
	
	public int getSides()
	{
		return sides;
	}
	
	public int getValue()
	{
		return value;
	}

}

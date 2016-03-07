
public class DieArgument {

	public static void main(String[] args)
	{
		final int SIX_SIDES = 6;
		final int TWENTY_SIDES = 20;
		
		Die sixDie = new Die(SIX_SIDES);
		Die twentyDie = new Die(TWENTY_SIDES);
		
		// Both rolls pass a Die object as an argument
		rollDie(sixDie);
		rollDie(twentyDie);
	}

	public static void rollDie(Die d)
	{
		System.out.println("Rolling a " + d.getSides() + " sided die.");
		
		d.roll();
		
		System.out.println("You rolled a " + d.getValue());
	}
	
}

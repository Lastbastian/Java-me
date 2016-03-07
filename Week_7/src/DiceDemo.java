public class DiceDemo
{
	public static void main(String[] args)
	{
		final int DIE1_SIDES = 6;
		final int DIE2_SIDES = 12;
		final int MAX_ROLLS = 5;
		
		Die die1 = new Die(DIE1_SIDES);
		Die die2 = new Die(DIE2_SIDES);
		
		System.out.println("This simulates the rolling of a " + DIE1_SIDES + " sided die and a " + DIE2_SIDES + " sided die.");
	
		for (int index = 0; index < MAX_ROLLS; index++)
		{
			die1.roll();
			die2.roll();
			
			System.out.println("Die 1 roll = " + die1.getValue() + " -- Die 2 roll = " + die2.getValue());
		}
	}
}
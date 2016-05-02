import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser {
	
	private int randomValue;
	private boolean randomValueNeedsUpdating;
	private Random generator;
	
	public RandomNumberGuesser(int l, int h) {
		super(l, h);
		
		randomValueNeedsUpdating = true;
		generator = new Random();
	}
	
	public int getCurrentGuess() {
		
		if (randomValueNeedsUpdating) {
			randomValue = low + (generator.nextInt((high - low) + 1));
			randomValueNeedsUpdating = false;
		}
		
		return randomValue;
	}
	
	public void higher() {
		if (super.low >= super.high)
		{
			throw new IllegalStateException("You have made and error - the compu-matrix has already guessed that number");
		}
		
		super.higher();
		randomValueNeedsUpdating = true;
	}
	
	public void lower() {
		if (super.high <= super.low)
		{
			throw new IllegalStateException("You have made and error - the compu-matrix has already guessed that number");
		}
		
		super.lower();
		randomValueNeedsUpdating = true;
	}
	
	public void reset() {
		super.reset();
		randomValueNeedsUpdating = true;
	}
	
}

public class FinalExam3 extends GradedActivity {
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam3(int questions, int missed)
	{
		double numericScore;
		
		numQuestions = questions;
		numMissed = missed;	
		
		pointsEach = 100.0 / questions;
		numericScore = 100.0 - (missed * pointsEach);
	
		setScore(numericScore);
	}
	
	public double getPointsEach()
	{
		return pointsEach;
	}
	
	public int numMissed()
	{
		return numMissed;
	}
	
	/**
	 * The equals method compares the calling object to the argument object for equality.
	 * @param g is the argument object
	 * @return true if the calling object's score is equal to the argument's score.
	 */
	
	public boolean equals(GradedActivity g)
	{
		boolean status;
		
		if (this.getScore() == g.getScore())
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public boolean isGreater(GradedActivity g)
	{
		boolean status;
		
		if (this.getScore() > g.getScore())
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public boolean isLess(GradedActivity g)
	{
		boolean status;
		
		if (this.getScore() < g.getScore())
			status = true;
		else
			status = false;
		
		return status;
	}
	
	
}

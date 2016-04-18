public class CurvedActivity extends GradedActivity
{
	double rawScore;
	double percentage;
	
	public CurvedActivity(double percent)
	{
		percentage = percent;
		rawScore = 0.0;
	}
	
	@Override  // must be used to override the super class method of the same name
	public void setScore(double s)
	{
		rawScore = s;
		super.setScore(rawScore * percentage);
	}
	
	
	
	
}

public class DvdMovie implements RetailItem {
	private String title;
	private int runningTime;
	private double retailPrice;
	
	public DvdMovie(String dvdTitle, int time, double cdPrice)
	{
		title = dvdTitle;
		runningTime = time;
		retailPrice = cdPrice;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getRunningTime()
	{
		return runningTime;
	}

	public double getRetailPrice()
	{
		return retailPrice;
	}
}

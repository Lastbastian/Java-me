
public class CompactDisc implements RetailItem
{
	private String title;
	private String artist;
	private double retailPrice;
	
	public CompactDisc(String cdTitle, String cdArtist, double string)
	{
		title = cdTitle;
		artist = cdArtist;
		retailPrice = string;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getArtist()
	{
		return artist;
	}

	public double getRetailPrice()
	{
		return retailPrice;
	}
}

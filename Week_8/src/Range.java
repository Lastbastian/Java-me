
public class Range {
	private  int lower;
	private int upper;
	
	public Range(int lowValue, int upValue)
	{
		lower = lowValue;
		upper = upValue;
	}
	
	

	public void setLower(int value)
	{
		lower = value;
	}
	
	public int getLower()
	{
		return lower;
	}
	
	public void setUpper(int value)
	{
		upper = value;
	}
	
	public int getUpper()
	{
		return upper;
	}
	
	public boolean equals(Range r)
	{
		boolean result = false;
		
		if (r.lower == this.lower && r.upper == this.upper)
			result = true;

		return result;
	}
	
	public boolean contains(Range r)
	{
		boolean result = false;
		
		if (r.lower > this.lower && r.upper < this.upper)
			result = true;
		
		return result;
	}
	
	public boolean contains(int num)
	{
		boolean result = false;
		
		if (num > this.lower && num < this.upper)
			result = true;
		
		return result;
	}
	
	
	
	

}

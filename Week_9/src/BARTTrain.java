
public class BARTTrain {
	
	private String nextStation;
	private double milesPerHour;
	private double milesToNextStation;
	private boolean inbound;
	
	public BARTTrain() 
	{
		nextStation = "";
		milesPerHour = 0;
		milesToNextStation = 0;
		inbound = true;
	}
	
	public BARTTrain(String station, double mph, double miles, boolean isInbound) 
	{
		nextStation = station;
		milesPerHour = mph;
		milesToNextStation = miles;
		inbound = isInbound;
	}
	
	public void setNextStation(String s)
	{
		nextStation = s;
	}
	
	public String getNextStation() 
	{
		return nextStation;
	}
 
	public double getMinutesToNextStation() 
	{
		return milesToNextStation * milesPerHour;
	}

	public void switchInbound()
	{
		if (inbound)  
			inbound = false;
		else
			inbound = true;
	}
	// Two trains are equal if they are in the same place, at the same speed, in the same direction. 
	public boolean equals(BARTTrain t)		
	{
		boolean result = false;
		
		if (t.milesPerHour == this.milesPerHour && t.nextStation == this.nextStation && t.milesToNextStation == this.milesToNextStation && t.inbound == this.inbound)
			result = true;
		
		return result;
	}
	
	public String toString()
	{
		String direction;
		
		if (inbound == true)
			direction = "Inbound";
		else
			direction = "Outbound";
		
		String str = direction + ". " + nextStation + " in " + getMinutesToNextStation() + " minutes.";
		
		return str;
	}

}

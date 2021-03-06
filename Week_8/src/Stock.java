
public class Stock {
	private String symbol;
	private double sharePrice;
	
	public Stock(String sym, double price)
	{
		symbol = sym;
		sharePrice = price;
	}
	
	public String getSymbol()
	{
		return symbol;
	}
	
	public double getSharePrice()
	{
		return sharePrice;
	}
	
	public String toString()
	{
		String str = "Trading symbol: " + symbol + "\nPrice: " + sharePrice;
	
		return str;
	}
	
	public Stock copy()
	{
		Stock copyObject = new Stock(symbol, sharePrice);
		
		return copyObject;
	}
}

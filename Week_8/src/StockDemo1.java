
public class StockDemo1 {
	public static void main(String[] args)
	{
		Stock company1 = new Stock("XYZ", 9.65);
		
		System.out.println(company1);	
		
		Stock company2;
		
		company2 = company1.copy();
		
		System.out.println(company2);
	}
}

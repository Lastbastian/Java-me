
public class PolymorphicInterfaceDemo {
	public static void main(String[] args)
	{
		CompactDisc cd = new CompactDisc("Purple Rain", "Prince", 15.99);
	
		DvdMovie dvd = new DvdMovie("Purple Rain", 130, 59.99);
		
		System.out.println("Item #1: " + cd.getTitle());
		showPrice(cd);
		
		System.out.println("Items #2 " + dvd.getTitle());
		showPrice(dvd);
		
	}
	
	private static void showPrice(RetailItem item)
	{
		System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
	}
}

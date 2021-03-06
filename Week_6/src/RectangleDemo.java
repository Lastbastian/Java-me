public class RectangleDemo
{
	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(5, 15);
		
		System.out.println("Sending the value 10.0 to the setLength method.");
		
		box.setLength(10.0);
		System.out.println("The length of the rectangle is " + box.getLength() + " inches long.");
		
		System.out.println("Sending the value 12.0 to the setWidth method.");
		
		box.setWidth(12.0);
		System.out.println("The width of the rectangle is " + box.getWidth() + " inches long.");
		
		System.out.println("The total are of the rectangle is " + box.getArea() + " inches squared.");
	
		System.out.println("Done");
	}
}
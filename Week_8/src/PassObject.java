
public class PassObject {
	public static void main(String[] args)
	{
		// creating a new Rectangle object
		Rectangle box = new Rectangle(12.0, 5.0);
		
		// Pass a reference to the object to the displayRectangle method
		displayRectangle(box);
		
	}
	
	public static void displayRectangle(Rectangle x)
	{
		System.out.println("The length is " + x.getLength() + "\nThe width is " + x.getWidth());		
	}
	
}

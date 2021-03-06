public class Rectangle
{
	private double length;
	private double width;
	
	
	// Constructor
	// @param l The length of the rectangle
	// @param w The width of the rectangle
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	
	// The setLength method stores a value in the length field. 
	public void setLength(double l)
	{
		length = l;
	}
	
	
	// The setWidth method stores a value in the width field. 
	public void setWidth(double w)
	{
		width = w;
	}
	
	
	// The getLength method returns the a rectangle objects length.
	// @return The value in the length field
	public double getLength()
	{
		return length;
	}
	
	
	// The getWidth method returns the a rectangle objects width.
	// @return The value in the width field
	public double getWidth()
	{
		return width;
	}
	
	
	// The getArea method returns a rectangle objects area.
	// @return The product of length times width
	public double getArea()
	{
		return length * width;
	}
}
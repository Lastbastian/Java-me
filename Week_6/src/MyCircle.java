public class MyCircle
{
	private double x;
	private double y;
	private double radius;
	private String name;
	
	
	// The setX method stores a value in the x field. 
	public void setX(double value)
	{
		x = value;		
	}
	
	
	// The getX method returns the the x-coordinate of a Circle object.
	// @return The value in the x field
	public double getX()
	{
		return x;		
	}
	
	
	// The setY method stores a value in the y field.
	public void setY(double value)
	{
		y = value;		
	}
	
	
	// The getY method returns the x-coordinate of a Circle object.
	// @return The value in the y field
	public double getY()
	{
		return y;		
	}
	
	
	// The setRadius method stores a value in the radius field.
	public void setRadius(double value)
	{
		radius = value;
	}

	
	// The getRadius method returns the radius of a Circle object.
	// @return The value in the radius field
	public double getRadius()
	{
		return radius;
	}
	
	
	// The setName method stores a value in the name field.
	public void setName(String value)
	{
		name = value;		
	}
	
	
	// The getName method returns the name of a Circle object.
	// @return The value in the name field.
	public String getName()
	{
		return name;
	}
	
	
	// The getArea method returns the area of a Circle object.
	// @return The product of pi times the value stored in the raidus^2
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	// The doesOverlap method returns true if the calling Circle object overlaps another Circle object
	// @ return A boolean result
	boolean doesOverlap(MyCircle otherCircle)
	{
		double distance;
		boolean result = false;
		
		distance = Math.sqrt(Math.pow((otherCircle.x - this.x),2) + Math.pow((otherCircle.y - this.y), 2));
		
		if (distance < (otherCircle.radius + this.radius))
			result =  true;
		
		return result;		
	}

}
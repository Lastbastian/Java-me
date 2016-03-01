public class MyCircle
{
	double x;
	double y;
	double radius;
	String name;
	
	public void setX(double value)
	{
		x = value;		
	}
	
	public double getX()
	{
		return x;		
	}
	
	public void setY(double value)
	{
		y = value;		
	}
	
	public double getY()
	{
		return y;		
	}
	
	public void setRadius(double value)
	{
		radius = value;
	}

	public double getRadius()
	{
		return radius;
	}
	
	public void setName(String value)
	{
		name = value;		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	boolean doesOverlap(MyCircle otherCircle)
	{
		double distance;
		boolean result = false;
		
		distance = Math.sqrt(Math.pow((otherCircle.getX() - getX()),2) + Math.pow((otherCircle.getY() - getY()), 2));
		
		if (distance < (radius + otherCircle.getRadius()))
			result =  true;
		
		return result;		
	}

}
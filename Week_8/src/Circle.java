
public class Circle {

	double radius;
	double y;
	double x;
	
	Circle(Point o, double r)
	{
		radius = r;
		
		
	}
	
	Circle(double xValue, double yValue, double r)
	{
		x = xValue;
		y = yValue;
		radius = r;
	}
	
	
	Circle()
	{
//		create a new Point object with an x and y coordinate of 0, and use this point object to initialize the origin member. It should set the radius to 1.
		Point newPoint = new Point(x, y);
		
		radius = 0;
	}
	Circle(Circle c)
	{
		
	}
	
	double getOrigin()
	{
		return x;
	}
	void setOrigin(Point p)
	{
		x = p.x
		y = p.y;
	}
	void setX(double value)
	{
		x = value;
	}
	
	double getX()
	{
		return x;
	}
	
	void setY(double value)
	{	
		y = value;
	}
	
	double getY()
	{
		return y;
	}
	
	void setRadius(double value)
	{
		radius = value;
	}
	
	double getRadius()
	{
		return radius;
	}
	
	double getArea()
	{
		double area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}
	
	String toString()
	{
		
	}
	
	boolean equals(Circle c)
	{
		
	}
	
	boolean doesOverlap(Circle c)
	{
		
	}
}

public class Circle {
	Point origin;
	double radius;
	
	public static void main(String[] args)
	{
		Point p1 = new Point(4, 5);
		// Two arg constructor
		Circle myCircle1 = new Circle(p1, 3.2);
		System.out.println(myCircle1);
		
		// Three arg constructor
		Circle myCircle2 = new Circle(2.0, 2.0, 1.0);
		System.out.println(myCircle2);
		
		// No args constructor
		Circle myCircle3 = new Circle();
		System.out.println(myCircle3);
		
		// Copy constructor
		Circle myCircle4 = new Circle(myCircle1);
		System.out.println(myCircle4);
		
		// Comparing myCircle1 and myCircle4
		if (myCircle1.equals(myCircle4))
			System.out.println("myCircle 1 and myCircle 4 are the same.");
		else
			System.out.println("myCircle 1 and myCircle 4 are different");
		
		// Comparing myCircle1 and myCircle3
		if (myCircle1.equals(myCircle3))
			System.out.println("myCircle 1 and myCircle 3 are the same.");
		else
			System.out.println("myCircle 1 and myCircle 3 are different.");
		
		// Using the overlap method to compare two overlapping circles
		if (myCircle1.doesOverlap(myCircle2))
			System.out.println("These two circles overlap.");
		else
			System.out.println("These two circles do not overlap.");
		// Using the overlap method to compare two non-overlapping circles
		if (myCircle1.doesOverlap(myCircle3))
			System.out.println("These two circles overlap.");
		else
			System.out.println("These two circles do not overlap.");
	}
	
	
//	The two argument constructor. This constructor should accept a Point object and double. 
//	It should initialize the new objects origin member so that it refers to a copy of the point argument, 
//	and the radius member to the double value.
	Circle(Point o, double r)
	{
		origin = new Point(o.getX(),o.getY());
		this.radius = r;
	}
	
//	The three argument constructor. This constructor should accept three double values, for x, y, 
//	and radius respectively. It should create a new Point object to store the x and y values, 
//	and store this Point object in the origin member. It should store the third double value into the radius member.  
//	Note that you can use the two argument constructor to write the three argument constructor.
	Circle(double xValue, double yValue, double r)
	{
		origin = new Point(xValue, yValue);
		this.radius = r;
	}
	
//	The no-argument constructor. This constructor should create a new Point object with an x and y coordinate of 0, 
//	and use this point object to initialize the origin member. It should set the radius to 1.
	Circle()
	{
		origin = new Point(0, 0);
		this.radius = 1;
	}
	
//	The copy constructor. This constructor should accept a Circle as an argument. It should set the origin member
//	to a copy of the point argumentŐs origin member. It should set the radius member to the point argumentŐs radius value;
	Circle(Circle c)
	{
		origin = new Point(c.getX(), c.getY());
		this.radius = c.getRadius();
	}

	Point getOrigin()
	{
		return origin;
	}
	
	void setOrigin(Point p)
	{
		origin = p;
	}
	
	void setX(double value)
	{
		origin.setX(value);
	}
	
	double getX()
	{
		return origin.getX();
	}
	
	void setY(double value)
	{
		origin.setY(value);
	}
	
	double getY()
	{
		return origin.getY();
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
		return Math.PI * Math.pow(radius, 2); 	
	}
	
	public String toString()
	{		
		String str = "The x coordinate is: " + this.getX() + "\nThe y coordinate is: " + this.getY() + "\nThe radius is: " + this.radius;
		
		return str;
	}

	public boolean equals(Circle c)
	{
		return this.getX() == c.getX() && this.getY() == c.getY();
	}
	
	boolean doesOverlap(Circle c)
	{
		double distance;
		boolean result = false;
		
		distance = Math.sqrt(Math.pow((c.getX() - this.getX()), 2) + Math.pow((c.getY() - this.getY()), 2));
		
		if (distance < (c.radius + this.radius))
			result =  true;
		
		return result;
	}
}

public class MyCircleTester {
	public static void main (String[] args)
	{
		
		MyCircle  circle1 = new MyCircle();
		MyCircle  circle2 = new MyCircle();
		MyCircle  circle3 = new MyCircle();
		
		circle1.setX(1.0);
		circle1.setY(1.0);
		circle1.setRadius(6.0);
		circle1.setName("Circle 1");
		
		System.out.println("The area of " + circle1.getName() + " is " + circle1.getArea());
		
		circle2.setX(3.0);
		circle2.setY(2.0);
		circle2.setRadius(2.0);
		circle2.setName("Circle 2");
		
		System.out.println("The area of " + circle2.getName() + " is " + circle2.getArea());
		
		circle3.setX(15.0);
		circle3.setY(14.5);
		circle3.setRadius(3.0);
		circle3.setName("Circle 3");
		
		System.out.println("The area of " + circle3.getName() + " is " + circle3.getArea());
		
		if(circle1.doesOverlap(circle2))
		{
			System.out.println(circle1.getName() + " overlaps " + circle2.getName());
			
		} else {
			System.out.println(circle1.getName() + " does not overlap " + circle2.getName());
		}
		if(circle1.doesOverlap(circle3))
		{
			System.out.println(circle1.getName() + " overlaps " + circle3.getName());
			
		} else {
			System.out.println(circle1.getName() + " does not overlap " + circle3.getName());
		}
		if(circle2.doesOverlap(circle3))
		{
			System.out.println(circle2.getName() + " overlaps " + circle3.getName());
		
		} else {
		System.out.println(circle2.getName() + " does not overlap " + circle3.getName());
		}
	}
}

//MyCircleTester
//The MyCircleTester.java code can be inside a static main method.  Use this as a place to test your class. I encourage you to spend a significant amount of time testing out the MyCircle class. This is a great way to learn the nuances of java syntax. Feel free to write and erase as much code as you want. (Naturally.)
//After you have tested the code to your own satisfaction, submit code that meets these minimum criteria
//Allocate and initialize at least three MyCircle objects. Two of them should overlap, and two should not.
//Display the areas of the three circles
//Invoke doesOverlap on MyCircles to show which circles overlap.
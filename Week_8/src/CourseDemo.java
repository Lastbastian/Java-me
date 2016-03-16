
public class CourseDemo {

	public static void main(String[] args)
	{
		// Create an Instructor object.
		Instructor myInstructor = new Instructor("Kramer", "Shawn", "RH3010");
		
		// Create a TextBook object.
		TextBook myTextBook = new TextBook("Starting Out With Java", "Gadis", "Person");
		
		// Create a Course object.
		Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);
		
		// Display
		System.out.println(myCourse);
	}
}

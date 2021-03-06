
public class Course {

	private String courseName;
	private Instructor instructor;
	private TextBook textBook;
	
	
	/**
	 * The constructor initializes the courseName, instructor, and text fields.
	 * @param name The name of the course
	 * @param instr An Instructor object
	 * @param text A TextBook object
	 */
	public Course(String name, Instructor instr, TextBook text)
	{
		// Assign the courseName.
		courseName = name;
		
		// Create a new Instructor object, passing instr as an argument to the copy constructor.
		instructor = new Instructor(instr);
		
		// Create a new TextBook object, passing text as an argument to the copy constructor.
		textBook = new TextBook(text);		
	}
	
	public String getName()
	{
		return courseName;
	}
	
	/**
	 * getInstructor method
	 * @return A reference to a copy of this course's Instructor object.
	 */
	public Instructor getInstructor()
	{
		// Return a copy of the instructor object.
		return new Instructor(instructor);
	}
	
	/**
	 * getTextBook method
	 * @return A reference to a copy of this course's TextBook object.
	 */
	
	public TextBook getTextBook()
	{
		// Return a copy of the textBook object.
		return new TextBook(textBook);
	}
	
	public String toString()
	{
		String str = "Course name: " + courseName + "\nInstructor:\n " + instructor + "\nTextbook Information:\n" + textBook;
	
		return str;
	}
	
	
	
}

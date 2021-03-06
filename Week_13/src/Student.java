public abstract class Student
{
	private String name;
	private String idNumber;
	private int yearAdmitted;
	
	public Student(String studentName, String id, int year)
	{
		name = studentName;
		idNumber = id;
		yearAdmitted = year;
	}
	
	public String toString()
	{	
		String str;
		
		str = "Name: " + name + "\nID Number: " + idNumber + "\nYear Admitted: " + yearAdmitted;
		return str;
	}
	
	/**
	 * The getRaminingHours method is abstract.
	 * It must be overridden in a subclass.
	 * @return The hours remaining for the student.
	 */
	public abstract int getRemainingHours();

}
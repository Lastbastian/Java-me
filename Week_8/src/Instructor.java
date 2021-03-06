
public class Instructor {
	private String lastName;
	private String firstName;
	private String officeNumber;
	
	public Instructor(String lname, String fname, String office)
	{
		lastName = lname;
		firstName = fname;
		officeNumber = office;		
	}
	
	/**
	 * The copy constructor initializes the object as a copy of another Instructor object.
	 * @param object2 The object to copy
	 */
	public Instructor(Instructor object2)
	{
		lastName = object2.lastName;
		firstName = object2.firstName;
		officeNumber = object2.officeNumber;
	}
	
	/** 
	 * The set method sets a value for each field
	 * @param lname The last name
	 * @param fname The first name
	 * @param office The office number
	 */
	public void set(String lname, String fname, String office)
	{
		lastName = lname;
		firstName = fname;
		officeNumber = office;
	}
	
	public String toString()
	{
		String str = "Last Name: " + lastName + " \n First Name: " + firstName + "\nOffice Number: " + officeNumber;
		
		return str;
	}
	
}

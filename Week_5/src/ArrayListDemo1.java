import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args)
	{
		ArrayList<String> nameList = new ArrayList<String>(); // 1st the a ArrayList reference variable nameList is 
		// created then a new ArrayList object is created (new ArrayList<string>)
		
		// adding to the nameList ArrayList
		nameList.add("James");
		nameList.add("Catherine");
		nameList.add("Bill");
		
		System.out.println("The array has " + nameList.size() + " objects stored in it.");
		
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + (index) + "   Name: " + nameList.get(index) + ".");			
		}
		
		// removing a nameList object at an index
		nameList.remove(1);
		
		System.out.println("The item at index 1 has been removed.  Here are the names now: ");
		
		System.out.println("The array has " + nameList.size() + " objects stored in it.");
		
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + (index) + "   Name: " + nameList.get(index) + ".");			
		}
		
		// inserting an item
		nameList.add(1, "Maryanne"); // the add method can take a position, thus it becomes insert
		
		System.out.println("A new name at index 1 has been inserted.  Here are the names now: ");
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + (index) + "   Name: " + nameList.get(index) + ".");			
		}
		
		// replacing an item
		nameList.set(1,"Judy Boo Boody");
		
		System.out.println("The name at index 1 was replaced with a new name.  Here are the names now: ");
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + (index) + "   Name: " + nameList.get(index) + ".");			
		}
	}
}

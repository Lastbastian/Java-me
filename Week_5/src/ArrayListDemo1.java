import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args)
	{
		ArrayList<String> nameList = new ArrayList<String>();
		
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
		
		System.out.println("The item at index 1 has been removed.  Here are the items now: ");
		
		System.out.println("The array has " + nameList.size() + " objects stored in it.");
		
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + (index) + "   Name: " + nameList.get(index) + ".");			
		}
	}
}

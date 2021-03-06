import java.util.ArrayList;

public class StringList {
	private ArrayList<String> stringList = new ArrayList<String>();
	
	public static void main(String[] args)
	{
		StringList myList = new StringList("Tell me why.");
		myList.add("Tell me how!!");
		System.out.println(myList.get(1));
		myList.add("Can you tell me?");
		System.out.println(myList.size());
		System.out.println(myList.totalCharCount());
		myList.clear();
	}
	
	public StringList(String s)
	{
		stringList.add(s);
	}
	

	public void add(String s)
	{
		stringList.add(s);
	}
	
	public String get(int i)
	{
		return stringList.get(i);
	}
	
	public int size()
	{
		return stringList.size();
	}
	
	public int totalCharCount()
	{
		int size = 0;
		
		for (int i = 0; i < stringList.size(); i++)
		{
			int count = stringList.get(i).length();
			size += count;
		}
		
		return size;
	}
	
	void clear()
	{
		for (int i = size() - 1; i >= 0; i--)
		{
			System.out.println("Removing item " + stringList.get(i));
			stringList.remove(i);
			System.out.println("Item removed.  There are now " + size() + " item(s) left.");
		}
	}
}


public class sampleTests {
	public static void main(String[] args)
	{
		String[] stringArray = new String[5];
		stringArray[0] = "ABC";
		stringArray[1] = "x";
		stringArray[2] = "LKJHK";
		
//		String str = "abcasfd";
//		System.out.println(str.length());
		
		intArrayWithStringLengths(stringArray);
	
	}
	
	public static int[] intArrayWithStringLengths(String[] s)
	{
		int[] intArray = new int[s.length];
		
		for (int index = 0; index < s.length; index++)
		{
			intArray[index] = s[index].length();
		}
		
		return intArray;
		
	}

}

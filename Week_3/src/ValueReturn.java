public class ValueReturn
{
	public static void main(String[] args)
	{
		int total, value1 = 20, value2 = 40;
		
		total = sum(value1, value2);
		
		System.out.println("The sum of " + value1 + " and " + value2 + " are " + total );
	}
	
	public static int sum(int myValue1, int myValue2)
	{
		int result = myValue1 + myValue2;
		return result;
	}
}
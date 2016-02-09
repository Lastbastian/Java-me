public class PassByValue
{
	public static void main(String[] args)
	{
		int number = 99;
		
		System.out.println("number is " + number);
		
		changeMe(number);
		
		System.out.println("number is still " + number);		
	}
	
	public static void changeMe(int myValue)
	{
		System.out.println("I am changing the value.");
		
		myValue = 0;									// This shows that the myValue is a copy of number and isn't changing the original value
		
		System.out.println("Now the value is " + myValue);
	}
}
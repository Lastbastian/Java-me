import java.util.ArrayList;
import java.util.Scanner;


public class StringProcessor {
	
	static String string;
	
	public static void main(String[] args)
	{
		String input;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a line of text. ");
		input = keyboard.nextLine();
		
		System.out.println("Input is: " + input);
		
		StringProcessor stringReader = new StringProcessor(input);
		
		System.out.println("Here is your string " + stringReader.string);
		
		System.out.println ("The word count of your string is: " + stringReader.wordCount() + " words.");
		System.out.println ("The upper case count in your string is: " + stringReader.uppercaseCount() + " characters.");
		System.out.println("The digit word cout is: ");
		System.out.println("The string with the spaces removed is: " + stringReader.getNoSpaceString() + ".");
		System.out.println("The string with the vowles replaced is: " + stringReader.getNoVowelString() + ".");
		System.out.println("The string with no digits is: " + stringReader.getNoDigitWordString() + ".");
		
	}
	

	public StringProcessor(String s)
	{
		string = s;	
	}
	
	void setString(String s)
	{
		string = s;
	}
	
	String getString()
	{
		return string;
	}
	
	int wordCount()
	{
		char[] array;
		array = string.toCharArray();
		int whitespaces = 0;
		
		for (int index = 0; index < array.length; index++)
		{
			if (Character.isWhitespace(array[index])){
				whitespaces++;
			}
		}
		
		return whitespaces + 1;
	}
	
	int uppercaseCount(){
		int upperCount = 0;
		char[] array;
		array = string.toCharArray();
		
		for (int index = 0; index < array.length; index++){
			if (Character.isUpperCase(array[index]))
				upperCount++;
		}
		
		return upperCount;
	}
	
	int digitCount(){
		int digitCount = 0;
		char[] array;
		array = string.toCharArray();
	
		for (int index = 0; index < array.length; index++){
			if (Character.isUpperCase(array[index]))
				digitCount++;
		}
	
		return digitCount;
	}
	
	int digitWordCount(){
		return 0;
	}
	
	String getNoSpaceString(){
		String newString = string.replace(" ", "");
		
		return newString;
	}
	
	String getNoVowelString(){
		String newString = string.replaceAll("[AaEeIiOoUu]", "-");
		
		return newString;
	}
	
	String getNoDigitWordString(){
		String[] parts = string.split("");
		
		StringBuilder strBuilder = new StringBuilder();
		
		for(int index = 0; index < parts.length; index++)
		{
			if (parts[index].equals("1")) {
				strBuilder.append("one");
			} else if (parts[index].equals("2")) {
				strBuilder.append("two");
			} else if (parts[index].equals("3")) {
				strBuilder.append("three");
			} else if (parts[index].equals("4")) {
				strBuilder.append("four");
			} else if (parts[index].equals("5")) {
				strBuilder.append("five");
			} else if (parts[index].equals("6")){
				strBuilder.append("six");
			} else if (parts[index].equals("7")) {
				strBuilder.append("seven");
			} else if (parts[index].equals("8")) {
				strBuilder.append("eight");
			} else if (parts[index].equals("9")) {
				strBuilder.append("nine");
			} else {
				strBuilder.append(parts[index]);
			}
		}
			
		String newString = strBuilder.toString();
		
		return newString;
	}

}

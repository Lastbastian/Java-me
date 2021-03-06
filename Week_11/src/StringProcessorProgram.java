import java.util.Scanner;

public class StringProcessorProgram {
	
	public static void main(String[] args)
	{
		String input;
		char choice = 'Y';
		
		do {
		
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a line of text. ");
			input = keyboard.nextLine();
			
			StringProcessor stringReader = new StringProcessor(input);
			
			System.out.println ("The word count of your string is: " + stringReader.wordCount() + " words.");
			System.out.println ("The upper case count in your string is: " + stringReader.uppercaseCount() + " character(s).");
			System.out.println("The digit word count is: " + stringReader.digitWordCount() + ".");
			System.out.println("The string with the spaces removed is: " + stringReader.getNoSpaceString() + ".");
			System.out.println("The string with the vowles replaced is: " + stringReader.getNoVowelString() + ".");
			System.out.println("The string with no digits is: " + stringReader.getNoDigitWordString() + ".");
			
			System.out.print("\nWould you like to enter another string? (Y or N) ");
			input = keyboard.nextLine();
			choice = input.charAt(0);
		} while (Character.toUpperCase(choice) == 'Y');
		System.out.println("***** All Done *****");
	}
}
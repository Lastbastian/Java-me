import java.util.Scanner;

public class StringReader {
	public static void main(String[] args)
	{
		String input;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a line of text. ");
		input = keyboard.nextLine();
		
		StringProcessor stringReader = new StringProcessor(input);
		
		System.out.println ("The word count of your string is: " + stringReader.wordCount() + " characters.");
	}
	

}

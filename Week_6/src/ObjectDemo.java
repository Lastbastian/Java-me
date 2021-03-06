import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class ObjectDemo
{
	public static void main(String[] args) throws IOException
	{
		
		int maxNumbers;
		int number;

		// Create a Scanner object to take user input
		Scanner keyboard = new Scanner(System.in);
		
		// Create a Random object to generate random numbers
		Random rand = new Random();
		
		// Create a PrintWriter object to open a new file
		PrintWriter outputFile = new PrintWriter("numbers.txt");
		
		System.out.println("How many numbers should I write?");
		maxNumbers = keyboard.nextInt();
		
		for(int index = 0; index < maxNumbers; index++)
		{
			number = rand.nextInt();
			
			outputFile.println(number);
		}
		
		// Close the file
		outputFile.close();
		System.out.println("Done man!");		
	}
}
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class ObjectDemo
{
	public static void main(String[] args) throws IOException
	{
		
		int maxNumbers;
		int number;
		
		Scanner keyboard = new Scanner(System.in);
		
		Random rand = new Random();
		
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
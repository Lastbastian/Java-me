import java.util.ArrayList;
import java.util.Scanner;


public class Assignment5
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		initialize(names, scores);
		
		
	}
	
	public static void initialize(ArrayList<String> names, ArrayList<Integer> scores)
	{
		Scanner input = new Scanner(System.in);
		
		for (int index = 0; index < names.size(); index++)
		{
			System.out.println("Enter the name for score #" + (index + 1) + ": ");
			names.add(input.nextLine());
//			scan.nextLine() // clear buffer
			System.out.println("Enter the name for Enter the score for score #" + (index + 1) + ": ");
			scores.add(input.nextInt());
		}
		
	}
	
	public static void sort(ArrayList<String> names, ArrayList<Integer> scores)
	{
		
	}
	
	public static void display(ArrayList<String> names, ArrayList<Integer> scores)
	{
		System.out.println("");
	}
}
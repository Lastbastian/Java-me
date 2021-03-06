import java.util.Scanner;

/**
 This program takes 5 names and scores, stores them in separate objects in an array then sorts and displays them.
 */

public class HighScoresProgram
{
	public static void main(String[] args)
	{
		HighScore[] scores = new HighScore[5];

		initialize(scores);
		sort(scores);
		display(scores);
	}
	
	public static void initialize(HighScore[] scores)
	{
		String name;
		int score;
		Scanner strInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		
		for (int index = 0; index < 5; index++)
		{	
			System.out.println("Enter the name for score #" + (index + 1) + ":");
			name = strInput.nextLine();
			
			System.out.println("Enter the score for score #" + (index + 1) + ": ");
			score = intInput.nextInt();
			
			scores[index] = new HighScore(name, score);			
		}	
	}
	
	public static void display(HighScore[] scores)
	{
		System.out.println("Top Scorers");
		for (int index = 0; index < 5; index++)
		{
			System.out.format(scores[index].name + "---" + scores[index].score + "\n");
		}
		
	}
	
	public static void sort(HighScore[] scores)
	{
		int startScan, index, first;
		HighScore scoreTemp;
		
		for (startScan = scores.length - 1; startScan > 0; startScan--)  
		{
			first = 0;   //initialize to subscript of first element
			
		    for(index = 1; index <= startScan; index++)   //locate smallest element between positions 1 and index.
		    {
		    	if (scores[index].score < scores[first].score)
		    		first = index;
		    }
		    
		    scoreTemp = new HighScore(scores[first].name, scores[first].score);

		    scores[first] = scores[startScan];
		    
		    scores[startScan] = scoreTemp;
		}         
	}
}
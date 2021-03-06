import java.util.Scanner;

public class CurvedActivityDemo {
	
	public static void main(String[] args)
	{
		double score;
		double curvePercentage;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the student's raw numeric score: ");
		score = keyboard.nextDouble();
		
		System.out.println("Enter the curve percentage: ");
		curvePercentage = keyboard.nextDouble();
		
		// Create a CurvedActivity object
		CurvedActivity curvedExam = new CurvedActivity(curvePercentage);
		
		// Set the exam score
		curvedExam.setScore(score);
		
		// Display the rawScore
		System.out.println("The raw score is " + curvedExam.getRawScore() + " points");
		
		// Display the curved score.
		System.out.println("The curved scored is " + curvedExam.getScore());
		
		// Display the exam grade.
		System.out.println("The exam grade is " + curvedExam.getGrade());
	}
}

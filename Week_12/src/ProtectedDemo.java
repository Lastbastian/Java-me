import java.util.Scanner;

public class ProtectedDemo {
	public static void main(String[] args)
	{
		int questions;
		int missed;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many questions are on the final exam? ");
		questions = keyboard.nextInt();
	
		System.out.println("How many quesitons did the student miss? ");
		missed = keyboard.nextInt();
		
		FinalExam2 exam = new FinalExam2(questions, missed);
		
		System.out.println("Each question counts " + exam.getPointsEach() + " points.\nThe exam score is "
							+ exam.getScore() + ". \nThe exam grade is " + exam.getGrade()+ ".");
		
		System.exit(0);
	}
}
import javax.swing.JOptionPane;

public class CreditCard
{
	public static void main(String[] args)
	{
		double salary;
		int creditRating;						// To hold credit rating
		String input;							// To hold the user's input S is capitalize because it is a class
		
		input = JOptionPane.showInputDialog("What is your annual salary? ");
		salary = Double.parseDouble(input);		// Parses type from String to double
		
		input = JOptionPane.showInputDialog("On a scale of 1 through 10, what is your credit rating?");
		creditRating = Integer.parseInt(input);
		
		if (salary >= 20000 && creditRating >= 7)
			qualify();
		else
			noQualify();
			
			System.exit(0);		
	}
	
	public static void qualify()
	{
		JOptionPane.showMessageDialog(null, "Congratulations! You qualify for the credit card!");
	}
	
	public static void noQualify()
	{
		JOptionPane.showMessageDialog(null, "You suck! You cannot even qualify for our shitty card!");
	}
}
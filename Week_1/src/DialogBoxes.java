import java.util.Scanner;
import javax.swing.JOptionPane;

public class DialogBoxes { 
	public static void main(String args[])
	{
		String firstName;
		String middleName;
		String lastName;
		
		firstName = JOptionPane.showInputDialog("Enter your first name:");
		middleName = JOptionPane.showInputDialog("Enter you middle name: ");
		lastName = JOptionPane.showInputDialog("and your last name: ");
		
		
		System.out.print("Hello " + firstName + " " + middleName + " " + lastName );
		JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + middleName + " " + lastName);
	}
}
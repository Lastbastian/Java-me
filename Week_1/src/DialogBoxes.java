import java.util.Scanner;

import javax.swing.JOptionPane;

public class DialogBoxes {
	public static void main(String args[])
	{
		
		JOptionPane.showMessageDialog(null, "Hello World!");
		String name;
		name = JOptionPane.showInputDialog("Enter your name.");
		System.out.print("Hello " + name);
	}
}
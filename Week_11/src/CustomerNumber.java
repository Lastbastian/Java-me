import javax.swing.JOptionPane;

public class CustomerNumber
{
	public static void main(String[] args)
	{
		String input;
		
		input = JOptionPane.showInputDialog("Enter a cusotmer number in the form LLLNNNN\n (LLL = letters and NNNN = numbers)");
	
		if (isValid(input))
		{
			JOptionPane.showMessageDialog(null,"That's a vaild cusomter number");	
		} else
		{
			JOptionPane.showMessageDialog(null, "The customer number is invalid");
		}
		
		System.exit(0);
	}

	private static boolean isValid(String custNum)
	{
		boolean goodSoFar = true;
		int i = 0;
		
		if (custNum.length() != 7)
			goodSoFar = false;
		
		while (goodSoFar && i < 3)
		{
			if(!Character.isLetter(custNum.charAt(i)))
				goodSoFar = false;
			i++;
		}
		
		while (goodSoFar && i < 7)
		{
			if(!Character.isDigit(custNum.charAt(i)))
				goodSoFar = false;
			i++;
		}
		return goodSoFar;
	}
}

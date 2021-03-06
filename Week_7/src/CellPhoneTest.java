import java.util.Scanner;

public class CellPhoneTest
{
	public static void main(String[] args)
	{
		String testMan;
		String testMod;
		double testPrice;
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Enter the manufacturer: ");
		testMan = keyboard.nextLine();
		
		System.out.println("Enter the model: ");
		testMod = keyboard.nextLine();
		
		System.out.println("Enter the retail price: ");
		testPrice = keyboard.nextDouble();
		
		CellPhone phone = new CellPhone(testMan, testMod, testPrice);
		
		System.out.println("The information you entered: ");
		System.out.println("Manufacturer: " + phone.getManufact());
		System.out.println("Model: " + phone.getModel());
		System.out.println("Retail Price: $" + phone.getRetailPrice());
	}	
}
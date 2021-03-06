import java.util.Scanner;

public class ObjectArray
{
	public static void main(String[] args)
	{
		final int NUM_ACCOUNTS = 3;
		
		// create an array that can reference BankAccount Objects
		BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];
		
		// create objects for the array
		createAccounts(accounts);
		
		System.out.println("Here are the balances for each account.");
		
		for (int index = 0; index < accounts.size; index++)
		{
			System.out.println("Account " + (index + 1) + ": $" + accounts[index].getBalance());
		}
	}
	
	public static void createAccounts(BankAccount[] array)
	{
		double balance;
		
		Scanner keyboard = new Scanner(System.in);
		
		for (int index = 0; index < array.size; index++)
		{
			System.out.print("Enter the balcnce for account " + (index + 1) + ": ");
			balance = keyboard.nextDouble();
			
			// creates the new bank account object
			array[index] = new BankAccount(balance);
		}		
	}
}
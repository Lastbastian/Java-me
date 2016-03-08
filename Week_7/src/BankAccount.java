public class BankAccount
{
	private double balance;
	
	// No Args constructor
	public BankAccount()
	{
		balance = 0.0;
	}

	// Constructor using a double argument
	public BankAccount(double startBalance)
	{
		balance = startBalance;
	}
	
	// Constructor using a string argument
	public BankAccount(String str)
	{
		balance = Double.parseDouble(str);
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void deposit(String str)
	{
		balance += Double.parseDouble(str);
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public void withdraw(String str)
	{
		balance -= Double.parseDouble(str);
	}
	
}
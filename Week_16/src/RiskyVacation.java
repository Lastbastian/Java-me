
public class RiskyVacation {
	
	public static void main(String[] args)
	{
		RiskyVacation florida = new RiskyVacation();
	}
	int days;
	public RiskyVacation() {
		days = 5;
		
		try {
			System.out.println("About to invoke risky");
			riskyMethod();
			System.out.println("just invoked risky");
			days = 11;
		} 
		catch (Exception e) {
			days = 3;
			System.out.println("Caught!");	
		}
		
		System.out.println("days = " + days);
	}
	
	private void riskyMethod()
	{
		days = 7;
		System.out.println("Risky!");
		throw new IllegalStateException("too risky!");
	}

}

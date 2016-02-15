//**************************************************
// SimpleMethod.java
// inputs       : 
// outputs      : 
// Written by   : Chris Bastian
// Last Modified: 2/8/16
//**************************************************

public class SimpleMethod {
	public static void main(String[] args){
		System.out.println("Hello from the main method.");
		displayMessage();
		System.out.println("Back in the main method.");
	}
	
	/**
	The displayMessage method displays a greeting
	 */
	public static void displayMessage()									// Method Header
	{																	// Start of method body
		System.out.println("Hello from the display message method!");	// Method body continued.
	}																	// End of method body.
}
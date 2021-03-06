//**************************************************
// Assignment5.java
// inputs       : 
// outputs      : 
// Written by   : Chris Bastian
// Last Modified: 2/23/16
//**************************************************

import java.util.ArrayList;
import java.util.Scanner;

/**
 This program takes 5 names and scores, stores them in separate ArrayLists then sorts and displays them.
 */

public class Assignment5
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>(5);
		ArrayList<Integer> scores = new ArrayList<Integer>(5);
		
		initialize(names, scores);
		sort(names, scores);
		display(names, scores);
	}
	
	
	
	/** 
	 * This method accepts to ArrayLists and takes  user input in the form of scores(ints) and names(strings) 
	 * and adds them to the ArrayLists.
	 * @param names - String ArrayList of names
	 * @param scores - Integer Arraylist of scores
	 */
	
	public static void initialize(ArrayList<String> names, ArrayList<Integer> scores)
	{
		Scanner strInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		
		for (int index = 0; index < 5; index++)
		{
			System.out.println("Enter the name for score #" + (index + 1) + ":");
			names.add(strInput.nextLine());
			
			System.out.println("Enter the score for score #" + (index + 1) + ": ");
			scores.add(intInput.nextInt());
		}	
	}
	
	
	
	/**
	 * Method sorts scores (and names) in descending order of score.
	 * @param names - String ArrayList of names
	 * @param scores - Integer ArrayList of scores
	 */
	
	public static void sort(ArrayList<String> names, ArrayList<Integer> scores)
	{
		int startScan, index, first, scoreTemp;
		String nameTemp;  
		for (startScan = scores.size() - 1; startScan > 0; startScan--)  
		{
			first = 0;   //initialize to subscript of first element
		    for(index = 1; index <= startScan; index++)   //locate smallest element between positions 1 and i.
		    {
		    	if( scores.get(index) < scores.get(first))
		    		first = index;
		    }
		    scoreTemp = scores.get(first);   //swap smallest found with element in position i.
		    nameTemp = names.get(first);
		          
		    scores.set(first, scores.get(startScan));
		    names.set(first, names.get(startScan));
		          
		    scores.set(startScan, scoreTemp);
		    names.set(startScan, nameTemp);
		}         
	}
	
	
	
	/**
	 * Method displays ArrayList in easy to read format.
	 * @param names - String ArrayList of names
	 * @param scores - Integer ArrrayList of scores
	 */
	public static void display(ArrayList<String> names, ArrayList<Integer> scores)
	{
		System.out.println("Top Scorers");
		for (int index = 0; index < 5; index++)
		{
			System.out.format(names.get(index) + ":  " + scores.get(index) + "\n");
		}
	}
}
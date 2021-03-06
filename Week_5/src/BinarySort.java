
public class BinarySort {
	public static void main(String[] args)
	{
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,15,16,17,18,55,66,77,88,99,224};
		
		int position = binarySearch(numbers, 77 );
		
		if (position != -1)
				System.out.print("Your value was found at index: " + position + ".");
			else
				System.out.print("Your value was not found in the array.");
		
	}
	
	public static int binarySearch(int[] array, int value)
	{
		int first, last, middle, position;
		boolean found;
		
		first = 0;
		last = array.length - 1;
		position = -1;
		found = false;
		
		while (!found && first <= last)
		{
			middle = (first + last) / 2;
			
			if (array[middle] == value)
			{
				found = true;
				position = middle;
			} 
			else if (array[middle] > value)
			{
				last = middle - 1;
			}
			else
				first = middle + 1;
		}
		return position;
	}
}

import java.util.ArrayList;

public class SelectionSort2
{
	public static void main(String[] args)
	{
//		int[] unsortedArray = {41, 6, 7, 4, 99, 33, 61, 56, 34, 58, 2, 11, 14, 1};
//		int[] sortedArray = selectionSort(unsortedArray);
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("James");
		nameList.add("Catherine");
		nameList.add("Bill");
		
		selectionSort(nameList);
	}
	
	public static void selectionSort(ArrayList<String> nameList)
	{
		int startScan;
		int index = 0;
		int minIndex = 0;
		char minValue;
		
		for (startScan = 0; startScan < (nameList.size() - 1); startScan++)
		{
			minIndex = startScan;
			minValue = nameList.get(startScan)[0];
			for(index = (startScan + 1); index < array.length; index++)
			{
				if (array[index] < minValue)
				{
					minValue = array[index];
					minIndex = index;
				}
			}
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}
		return array;
	}
}
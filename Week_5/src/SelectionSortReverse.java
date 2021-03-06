public class SelectionSortReverse
{
	public static void main(String[] args)
	{
		int[] unsortedArray = {41, 6, 7, 4, 99, 33, 61, 56, 34, 58, 2, 11, 14, 1};
		int[] sortedArray = selectionSort(unsortedArray);
		
		for (int value : sortedArray)
			System.out.print(value + " ");
	}
	
	public static int[] selectionSort(int[] array)
	{
		int startScan, index = 0, minIndex = 0, minValue = 0;
		
		for (startScan = array.length - 1; startScan > 0; startScan--)
		{
			minIndex = startScan;
			minValue = array[startScan];
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
	
//	   int i, j, first, temp;  
//	     for ( i = num.length - 1; i > 0; i - - )  
//	     {
//	          first = 0;   //initialize to subscript of first element
//	          for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
//	          {
//	               if( num[ j ] < num[ first ] )         
//	                 first = j;
//	          }
//	          temp = num[ first ];   //swap smallest found with element in position i.
//	          num[ first ] = num[ i ];
//	          num[ i ] = temp; 
//	      }    
}
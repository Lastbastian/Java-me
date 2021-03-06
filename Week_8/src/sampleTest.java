import java.util.ArrayList;

	
public class sampleTest {
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(22);
		a.add(1);
		a.add(36);
		a.add(5);
		
		for(int index = 0; index < a.size(); index++)
		{
			System.out.print(a.get(index) + " ");
		}
		
		int[] intArray = new int[5];
		intArray[4] = 100;
				
		for(int index = 0; index < 5; index++)
		{
			System.out.println(intArray[index] + " ");
		}
		
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.println((i + j) + " ");
			}
		}
		
		System.out.println(sumInteger(a));
		
		int num = 8;
		printAsterix(num);
	}
	
	public static int sumInteger(ArrayList<Integer> array)
	{
		int sum = 0;
		for (int i = 0; i < array.size(); i++ )
		{
			sum += array.get(i);
		}
		return sum;
	}
	
	public static void printAsterix(int number)
	{	
		for(int row = 0; row < number; row++)
		{
			if (row == 0 || row == number - 1)
			{
				for (int column = 0; column < number; column++)
					System.out.print("*");
			}
			else {
				for (int column = 0; column < number; column++)
				{
					if (column == 0 || column == number - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
	}

}

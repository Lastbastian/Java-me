import java.util.ArrayList;

public class Board {
	static final int ROWS = 10;
	static final int COLS = 10;
	ArrayList<Point> boardSpaces = new ArrayList<Point>(); // contains all the points on the board
	ArrayList<Point> shipBoard = new ArrayList<Point>(); // contains the points of all the ships
	ArrayList<Point> hitBoard = new ArrayList<Point>(); // contains all the point called that were hits
	ArrayList<Point> missBoard = new ArrayList<Point>(); // contains all the points called that were misses
	
	public Board() // Constructor
	{
		for(int r = 0; r < 10; r++)
		{
			for(int c = 0; c < 10; c++)
				{boardSpaces.add(new Point(r, c));}
		}
	}
	
	public void addShip(Ship o)
	{
		if (o.isVertical)
		{
			for (int index = 0; index < o.size; index++)
			{
				shipBoard.add(new Point(o.origin.getX(), o.origin.getY() + index));		
			}
		}
		else 
		{
			for (int index = 0; index < o.size; index++)
			{
				shipBoard.add(new Point(o.origin.getX() + index, o.origin.getY()));		
			}
		}
			
	}

	public void display()
	{	
		int i = 0;
		for (int r = 9; r >= 0; r--)	
		{
			
			System.out.print(r);
			
			for (int c = 0; c < 10; c++)
			{
				System.out.print("[" + boardSpaces.get(i).getX() + "]" + "[" + boardSpaces.get(i).getY() + "],");
				i++;
			}
			System.out.println();
			
		}
		for (int r = 0; r <= 9; r++)
			System.out.print(" " + r + " ");
		System.out.println("");
	
	}
}

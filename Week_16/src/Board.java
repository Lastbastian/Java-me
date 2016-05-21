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
			for(int c = 9; c >= 0; c--)
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
		boolean hitMatch = false;
		boolean missMatch = false;
		
		for (int r = 9; r >= 0; r--)
		{
			System.out.print(r);
			
			for (int c = 9; c >=0; c--)
			{
				for (int i = 0; i < boardSpaces.size(); i++)
				{
					for (int j = 0; j < hitBoard.size(); j++)
					{
						System.out.println(boardSpaces.get(i).getX() + hitBoard.get(i).getY() + " = " + hitBoard.get(i).getX() + hitBoard.get(i).getY());
						if (boardSpaces.get(i).equals(hitBoard.get(j)))
							hitMatch = true;
						else
							hitMatch = false;
					}
				}
				
				for (int i = 0; i < boardSpaces.size(); i++)
				{
					for (int j = 0; j < missBoard.size(); j++)
					{
						if (boardSpaces.get(i).equals(missBoard.get(j)))
						{
							missMatch = true;
						}
						else
						{
							missMatch = false;
						}
					}
				}
				
				if (hitMatch)
				System.out.println(boardSpaces.get(i).getX() + hitBoard.get(j).getY() + " = " + hitBoard.get(j).getX() + hitBoard.get(j).getY());
//					System.out.print(" X ");
				else if (missMatch)
				System.out.println(boardSpaces.get(i).getX() + missBoard.get(j).getY() + " = " + hitBoard.get(j).getX() + missBoard.get(j).getY());
//					System.out.print(" . ");
//				else
//					System.out.print(" ~ ");
			}
			System.out.println();
		}
		for (int r = 0; r <= 9; r++)
			System.out.print(" " + r + " ");
		System.out.println("");
	}
}

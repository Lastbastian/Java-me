import java.util.ArrayList;

public class Board {
	static final int ROWS = 10;
	static final int COLS = 10;
	private ArrayList<Point> boardSpaces = new ArrayList<Point>();
	ArrayList<Point> shipBoard = new ArrayList<Point>();
	ArrayList<Point> hitBoard = new ArrayList<Point>();
	
	public Board()
	{
		for (int r = 0; r < ROWS; r++)
		{
			for (int c = 0; c < COLS; c++)
			{
				boardSpaces.add(new Point(r, c));
			}
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
		for (int r = 0; r < ROWS; r++)
		{
			int index = 0;
			
			for (int c = 0; c < COLS; c++) {
				System.out.print(" " + boardSpaces.get(index).displayCharacter() + " ");		
			}
			index++;
			
			System.out.println();
		}
	}
}

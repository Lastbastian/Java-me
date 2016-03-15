// shows the passing a Rectangle object by reference - references the original object and there it can be changed
public class PassObject2 {

	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(12.0, 5.0);
		
		System.out.println("Contents of the box object:");
		System.out.println("Length : " + box.getLength());
		System.out.println("Width : " + box.getWidth());
		
		changeRectangle(box);
		
		System.out.println("Contents of the box object:");
		System.out.println("Length : " + box.getLength());
		System.out.println("Width : " + box.getWidth());
		
	}
	
	public static void changeRectangle(Rectangle r)
	{
		r.setLength(0.0);
		r.setWidth(0.0);
	}
}

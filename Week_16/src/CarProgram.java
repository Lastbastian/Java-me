import java.util.ArrayList;

public class CarProgram {
	public static void main(String[] args)
	{
		ArrayList<Car> carList = new ArrayList<Car>(); 
		ArrayList<Car> otherList = new ArrayList<Car>();
		
		Car newCar = new Car(2, 4);
		Car otherCar = new Car(1, 3);
		Car thisCar = new Car(2, 5);
		Car notherCar;
		notherCar = otherCar;
		
		carList.add(newCar);
		carList.add(otherCar);
		carList.add(thisCar);
		
		otherList.add(notherCar);
		
		if (otherList.contains(otherCar))
			System.out.println("Yay");
		else
			System.out.println("Nay");
	}

}
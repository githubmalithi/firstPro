package firstPro;

public class Car extends Vehicle {

	public Car(int id) {
		super(id);
	}
	
	
	@Override
	public void drive(){
		System.out.println("Car " +getId() +" is running...");
	}

	
	
}

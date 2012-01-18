package firstPro;

public class Car extends Vehicle {

	public Car(int id,String md) {
		super(id,md);
	}
	
	
	
	@Override
	public void drive(){
		System.out.println("The " + getModel() +" Car " +getId() +" is running...");
	}

	
	
}

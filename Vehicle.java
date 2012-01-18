package firstPro;

public class Vehicle {
	
	private int id_num;
	
	public Vehicle(int id){
		id_num=id;
	}
	
	public void drive(){
		System.out.println("Vehicle is running..");
	}
	
	public int getId(){
		return id_num;
	}

	
}

package firstPro;

public class Vehicle {
	
	private int id_num;
	public String model;
	
	public Vehicle(int id,String md){
		id_num=id;
		model=md;
	}
	
	public void drive(){
		System.out.println("Vehicle is running..");
	}
	
	public int getId(){
		return id_num;
	}
	
	public String getModel(){
		return model;
	}

	
}

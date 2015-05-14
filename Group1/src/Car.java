
import java.util.*;
public class Car implements VehicleI {
/*
+getQuarterMileTime() : double
- make this random < 10 seconds

+toString() : String*/
	
	private String make;
	private String model;
	public Car(String make, String model){
		this.make=make;
		this.model=model;
	}

	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String toString(){
		return "Make: "+ make+" Model "+ model; 
		
	}
	public double getQuaterMile(){
		Random random= new Random();
		
		return random.nextDouble()*10;
	}
	
	

}

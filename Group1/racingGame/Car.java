package RacingGame;
import java.util.*;
public class Car implements VehicleI {
/*
+getQuarterMileTime() : double
- make this random < 10 seconds

+toString() : String*/
	
	private String make;
	private String model;
	public Car(String car){
		switch (car){
		
		case "Lamborghini":
			this.make = "Lamborghini";
			this.model= "Murcielago";
			break;
		case "Ferrari":
			this.make = "Ferrari";
			this.model= "599 GTO";
			break;
				
		case "Pagani":
			this.make = "Pagani";
			this.model= "Zonda F";
			break;
		case "McLaren":
			this.make = "McLaren";
			this.model= "650S Spider";
			break;
		case "Porche":
				this.make = "Porche";
				this.model= "Boxster Spyder";
				break;
			
		
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

public class Vehicle {
	private String make;
	private String model;
	
	Vehicle(String make, String model){
		this.make = make;
		this.model = model;
	}
	
	Vehicle() {}
	
	public double getQuarterMileTime(){
		return Math.random()*10.0; // less than 10s
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String toString() {
		return ("This car is " + make + " " + model);
	}	
}

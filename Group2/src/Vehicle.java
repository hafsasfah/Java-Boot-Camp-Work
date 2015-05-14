public class Vehicle {
	private String make;
	
	Vehicle(String make, String model){
		this.make = make;
	}
	
	Vehicle() {}
	
	public double getQuarterMileTime(){
		return Math.random()*10.0; // less than 10s
	}
	
	public String getMake() {
		return make;
	}
	
	public String toString() {
		return ("This car is " + make);
	}	
}

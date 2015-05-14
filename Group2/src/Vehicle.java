public class Vehicle {
	private String make;
	private String color;
	
	Vehicle(String make, String color){
		this.make = make;
		this.color = color;
	}
	
	Vehicle() {}
	
	public double getQuarterMileTime(){
		return Math.random()*10.0; // less than 10s
	}
	
	public String getMake() {
		return make;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return ("This car is " + make);
	}	
}
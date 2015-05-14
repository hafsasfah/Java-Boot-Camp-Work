public class Vehicle implements iVehicle {
	private String make;
	private String color;
	
	Vehicle(String make, String model){
		this.make = make;
	}
	

	public double getQuarterMileTime(){
		return Math.random()*10.0; // less than 10s
	}
	
	public String getMake() {
		return make;
	}
	
	public String toString() {
		return ("This car is " + make);
	}

	@Override
	public String getColor() {
		
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}	
}

public class CarFactory implements iVehicleFactory 
{
	public iVehicle getVehicle() {
		return new Car();
	}

}

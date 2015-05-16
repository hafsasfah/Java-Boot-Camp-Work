
public class TankFactory implements iVehicleFactory {

	@Override
	public iVehicle getVehicle() {
		// TODO Auto-generated method stub
		return new Tank();
	}

}

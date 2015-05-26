import java.util.Observable;

public abstract class iProperty extends Observable {

	abstract void assignPlayerToProperty(iPlayer player);
	abstract void chargePlayerRent(int rent);
	Coordinates coord = new Coordinates();
	abstract String getName();
	
}

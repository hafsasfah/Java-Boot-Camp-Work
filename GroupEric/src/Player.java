import javax.swing.JPanel;


public class Player implements iPlayer {
	
	private String name;
	private int cash;
	private iVehicle vehicle;

	public Player( String name, int cash )
	{
		this.name = name;
		this.cash = cash;
	}
	
	public String getName() {
		return name;
	}

	public int getCash() {
		return cash;
	}

	public void addCash(int cash ) {
		cash += cash;
	}

	public void setVehicle(iVehicle vehicle) {
		this.vehicle = vehicle;
	}

	public iVehicle getVehicle() {
		return vehicle;
	}

	public JPanel getPanel() {
		JPanel panel = new JPanel();
		
	}

}

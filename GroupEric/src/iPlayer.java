import javax.swing.JPanel;

public interface iPlayer {
	String getName();
	int getCash();
	void addCash ( int cas );
	void setVehicle( iVehicle vehicle );
	iVehicle getVehicle();
	JPanel getPanel();
}

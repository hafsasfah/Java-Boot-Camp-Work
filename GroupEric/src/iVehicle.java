import javax.swing.JPanel;

public interface iVehicle {
	String getMake();
	String getModel();
	String getColor();
	String toString();
	double getQuarterMileTime();
	JPanel getPanel();
	boolean isReady();
}

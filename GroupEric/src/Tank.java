import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tank implements iVehicle {

	@Override
	public String getMake() {
		// TODO Auto-generated method stub
		return "Tank";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Tank";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Tank";
	}

	@Override
	public double getQuarterMileTime() {
		// TODO Auto-generated method stub
		return 10.0;
	}

	@Override
	public JPanel getPanel() {
		JPanel panel = new JPanel();
		panel.add( new JLabel("Tank!!!"));
		return panel;
	}
	
	public String toString()
	{
		return "Tahk SMASH!";
	}
	
	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return true;
	}

}

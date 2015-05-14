import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Car implements iVehicle {

	private String make;
	private String model;
	private String color;
	private double lastQuarterMileTime;
	
	public Car( String make, String model, String color )
	{
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public double getQuarterMileTime() {
		lastQuarterMileTime = new Random().nextDouble() * 10;
		return lastQuarterMileTime;
	}

	public JPanel getPanel() {
		JPanel panel = new JPanel();
		JLabel makeLabel = new JLabel(make);
		JLabel modelLabel = new JLabel(model);
		JLabel colorLabel = new JLabel(color);
		JLabel quarterMileTimeLabel = new JLabel(Double.toString(lastQuarterMileTime));
		panel.setLayout(new GridLayout(4,1));
		panel.add(makeLabel);
		panel.add(modelLabel);
		panel.add(colorLabel);
		panel.add(quarterMileTimeLabel);
		return panel;
	}

}

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Car implements iVehicle {

	private String make;
	private String model;
	private String color;
	private double lastQuarterMileTime;
	private boolean isValid;
	
	private JPanel panel;
	
	private JLabel pickACarLabel;
	
	private JRadioButton fordFocusButton;
	private JRadioButton fordMustangButton;
	private JRadioButton fordTransitButton;
	private ButtonGroup carsButtonGroup;
	
	private JRadioButton redButton;
	private JRadioButton blueButton;
	private JRadioButton yellowButton;
	private ButtonGroup colorsButtonGroup;
	
	private JButton selectCarButton;
	
	private JLabel makeLabel;
	private JLabel modelLabel;
	private JLabel colorLabel;
	private JLabel quarterMileTimeLabel;
	
	public Car()
	{
		isValid = false;
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		pickACarLabel = new JLabel("Design your car");
		
		JPanel carMakeAndModelPanel = new JPanel();
		
		fordFocusButton = new JRadioButton("Ford Focus");
		fordFocusButton.setSelected(true);
		fordMustangButton = new JRadioButton("Ford Mustang");
		fordTransitButton = new JRadioButton("Ford Transit");
		
		carMakeAndModelPanel.add(fordFocusButton);
		carMakeAndModelPanel.add(fordMustangButton);
		carMakeAndModelPanel.add(fordTransitButton);
		
		carsButtonGroup = new ButtonGroup();
		carsButtonGroup.add(fordFocusButton);
		carsButtonGroup.add(fordMustangButton);
		carsButtonGroup.add(fordTransitButton);
		
		JPanel colorPanel = new JPanel();
		
		redButton = new JRadioButton("Red");
		redButton.setSelected(true);
		blueButton = new JRadioButton("Yellow");
		yellowButton = new JRadioButton("Blue");
		
		colorPanel.add(redButton);
		colorPanel.add(blueButton);
		colorPanel.add(yellowButton);
		
		colorsButtonGroup = new ButtonGroup();
		colorsButtonGroup.add(redButton);
		colorsButtonGroup.add(blueButton);
		colorsButtonGroup.add(yellowButton);
		
		selectCarButton = new JButton("Save and use car");
		selectCarButton.addActionListener( new SelectCarButtonActionListener() );
		
		JPanel topPanel = new JPanel();
		topPanel.add(pickACarLabel);
		panel.add(topPanel);
		
		panel.add(carMakeAndModelPanel);
		panel.add(colorPanel);
		panel.add(selectCarButton);
		
		makeLabel = new JLabel();
		modelLabel = new JLabel();
		colorLabel = new JLabel();
		quarterMileTimeLabel = new JLabel();
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
	
	public String toString()
	{
		return String.format("%s %s %s", color, make, model);
	}

	public double getQuarterMileTime() {
		lastQuarterMileTime = new Random().nextDouble() * 10;
		quarterMileTimeLabel.setText(String.format("Quarter Mile TIme: %.3f", lastQuarterMileTime));
		return lastQuarterMileTime;
	}

	public JPanel getPanel() 
	{	
		return panel;
	}
	
	public boolean isReady() {
		return isValid;
	}
	
	private void changePanel()
	{
		panel.removeAll();
		panel.setLayout(new GridLayout(4,1));
		panel.add(makeLabel);
		panel.add(modelLabel);
		panel.add(colorLabel);
		panel.add(quarterMileTimeLabel);
	}
	
	private class SelectCarButtonActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if ( fordFocusButton.isSelected() )
			{
				make = "Ford";
				model = "Focus";
			}
			else if ( fordMustangButton.isSelected() )
			{
				make = "Ford";
				model = "Mustang";
			}
			else if ( fordTransitButton.isSelected() )
			{
				make = "Ford";
				model = "Transit";
			}
			
			if ( redButton.isSelected() )
			{
				color = "Red";
			}
			else if ( yellowButton.isSelected() )
			{
				color = "Yellow";
			}
			else if ( blueButton.isSelected() )
			{
				color = "Blue";
			}
			
			makeLabel.setText(make);
			modelLabel.setText(model);
			colorLabel.setText(color);
			
			changePanel();
			panel.revalidate();
			
			isValid = true;;
		}
	}
}

import javax.swing.*;

import java.awt.*;
public class VehicleGui extends JPanel{
	
	public final String ford="Ford";
	public final String toyota="Toyota";
	public final String lamborghini="Lamborghini";
	public final String ferrari="Ferrari";
	
	// Making selection Buttons
	private JRadioButton FordSelection; 
	private JRadioButton ToyotaSelection;
	private JRadioButton LamborghiniSelection;
	private JRadioButton FerrariSelection;
	private JRadioButton Button;
	
	public VehicleGui(){
		setLayout(new GridLayout(4,1));
		
		//Creating Radio buttons
		FordSelection = new JRadioButton(ford);
		ToyotaSelection= new JRadioButton(toyota);
		LamborghiniSelection=new JRadioButton(lamborghini);
		FerrariSelection=new JRadioButton(ferrari);
		
		// Group the radio buttons
		Button=new JRadioButton();
		Button.add(FordSelection);
		Button.add(ToyotaSelection);
		Button.add(LamborghiniSelection);
		Button.add(FerrariSelection);
		
		setBorder(BorderFactory.createTitledBorder("Choose a Car"));
		
		//Add buttons to panel
		add(FordSelection);
		add(ToyotaSelection);
		add(LamborghiniSelection);
		add(FerrariSelection);
	
	}
	
	
}

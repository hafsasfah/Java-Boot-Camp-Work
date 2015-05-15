import javax.swing.*;

import java.awt.*;
public class VehicleGui extends JPanel{
	
	public final String ford="Ford";
	public final String toyota="Toyota";
	public final String lamborghini="Lamborghini";
	public final String ferrari="Ferrari";
	
	// Making selection Buttons
	private JCheckBox FordSelection; 
	private JCheckBox ToyotaSelection;
	private JCheckBox LamborghiniSelection;
	private JCheckBox FerrariSelection;
	private JCheckBox Button;
	
	public VehicleGui(){
		setLayout(new GridLayout(4,1));
		
		//Creating Radio buttons
		FordSelection= new JCheckBox(ford);
		ToyotaSelection= new JCheckBox(toyota);
		LamborghiniSelection=new JCheckBox(lamborghini);
		FerrariSelection=new JCheckBox(ferrari);
		
		// Group the radio buttons
		Button=new JCheckBox();
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

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
	private ButtonGroup Button;
	
	public VehicleGui(){
		setLayout(new GridLayout(4,1));
		
		//Creating Radio buttons
		FordSelection= new JRadioButton("Ford");
		ToyotaSelection= new JRadioButton("Toyota");
		LamborghiniSelection=new JRadioButton("Lamborghini");
		FerrariSelection=new JRadioButton("Ferrari");
		
		// Group the radio buttons
		Button=new ButtonGroup();
		Button.add(FordSelection);
		Button.add(ToyotaSelection);
		Button.add(LamborghiniSelection);
		Button.add(FerrariSelection);
	}
public static void main(String args[]){
	VehicleGui();
}
private static void VehicleGui() {
	// TODO Auto-generated method stub
	
}


}

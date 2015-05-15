import java.awt.*;

import javax.swing.*;


public class ColorGUI extends JPanel {
	public final String red="Red";
	public final String white="White    ";
	public final String black="Black";
	public final String green="Green";
	
	// Making selection Buttons
	private JRadioButton Red; 
	private JRadioButton White;
	private JRadioButton Black;
	private JRadioButton Green;
	private JRadioButton button;

	
	public ColorGUI(){
		Vehicle player=new Vehicle(null, black);
		setLayout(new GridLayout(4,1));
		
		//Creating Radio buttons
		Red= new JRadioButton(red);
		if(Red.isSelected())
		{
		 player.setColor(red);
		}
		White= new JRadioButton(white);
		if(White.isSelected())
		{
			player.setColor(white);
		}
		Black=new JRadioButton(black);
		if(Black.isSelected())
		{
			player.setColor(black);
		}
		Green=new JRadioButton(green);
		if(Green.isSelected())
		{
			player.setColor(green);
		}
		
		// Group the radio buttons
		button=new JRadioButton();
		button.add(Red);
		button.add(White);
		button.add(Black);
		button.add(Green);
		
		setBorder(BorderFactory.createTitledBorder("Choose a Color   "));
		
		//Add buttons to panel
		add(White);
		add(Red);
		add(Black);
		add(Green);
	
	}


}

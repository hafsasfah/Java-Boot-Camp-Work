import java.awt.*;
import java.util.*;
import javax.swing.*;

public class GUI extends JFrame
{

	private JComboBox betBox;				//list of wagers
	private JLabel label;					//displays the message 
	private JTextField selectedWager; 		//select the wager 
	
	public GUI()
	{
		//set the title
		setTitle("Car Race");
		
		//specify an action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Build the size (x, y) and visibility
		setSize(300, 400);
		setVisible(true);
		
		
		
		
		
	}
	
	public static void main(String[]args)
	{
		
		
		GUI cargame = new GUI();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

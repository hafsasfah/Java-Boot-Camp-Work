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

		setLayout(new GridLayout(3,2));
		
		JPanel cell1 = new JPanel();
		JPanel cell2 = new JPanel();
		JPanel empty = new JPanel();
		JPanel empty2 = new JPanel();
		JPanel empty3 = new JPanel();
		JPanel empty4 = new JPanel();
		
		JLabel label1 = new JLabel("Cell 1.");
		JLabel label2 = new JLabel("Cell 2.");
		
		JButton panel = new JButton("Player 1 GO");
		JButton panel2 = new JButton("Player 2 GO");

		cell1.add(label1);
		cell1.add(panel);
		cell2.add(label2);
		cell2.add(panel2);
		
		this.add(empty);
		this.add(empty2);
		this.add(empty3);
		this.add(empty4);
		this.add(cell1);
		this.add(cell2);
		
		setVisible(true);
		setResizable(false);
		
	}
	
	public static void main(String[]args)
	{
		GUI cargame = new GUI();
	}

}

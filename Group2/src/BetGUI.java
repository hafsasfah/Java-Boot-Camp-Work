import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BetGUI extends JFrame 
{
	protected static final int wager = 0;
	//JPanel panel=new JPanel();
	JLabel label = new JLabel();
	JTextField wagerField = new JTextField(10);
	JButton enter = new JButton("Enter");
	
	public BetGUI() 
	{
		setLayout(new GridLayout(1,1));
		 setTitle("Wager");
		 setVisible(true);
		 setSize(200,200);
		 
		 	 
		 add(wagerField);
		 
		 wagerField.addActionListener(new ActionListener()
		 {
			 public void actionPerfromed(ActionEvent e)
			 { Bet b1=new Bet(null, null, wager);
				 String input = wagerField.getText();
				 int Wager = Integer.parseInt(input);
				 b1.setWager(Wager);
				 
			 }

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			

		
		 });
		 
		  add(label);
		 //add(panel);
	}
}
	
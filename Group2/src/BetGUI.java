import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BetGUI extends JFrame 
{
	JPanel panel=new JPanel();
	JLabel label=new JLabel();
	JTextField wagerField=new JTextField(10);
	JButton enter=new JButton("Enter");
	
	public BetGUI() 
	{
 
		 setTitle("Wager");
		 setVisible(true);
		 setSize(200,200);
		 
		 	 
		 panel.add(wagerField);
		 
		 wagerField.addActionListener(new ActionListener()
		 {
			 public void actionPerfromed(ActionEvent e)
			 { 
				 Bet b=new Bet(null, null, getDefaultCloseOperation());
				 int input = Integer.parseInt(enter.getText());
				 input=b.setWager(wager);
			 }

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			

		
		 });
		 
		  add(label);
		 add(panel);
	}
}
	
package RacingGame;

import java.awt.FlowLayout;
import java.awt.Image;
import java.io.IOException;

import javax.swing.*;




public class RaceCar extends JFrame
{
	//private JLabel label;
	//private ImageIcon image;
	
	public RaceCar(){
		
		//setLayout(new FlowLayout());
		//image = new ImageIcon (getClass().getResource("image.jpg"));
		//JLabel label = new JLabel (image);
		//add(label);
		
		
	}
	
		
	
	public static void main(String[] args)  
	{
		//RaceCar rc = new RaceCar();
		
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run() 
			{
				

				JFrame frame = new MainFrame("Race Car Plus");
				frame.setSize(500, 400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
				
			}
		});
	}
	
	
}
package RacingGame;

import java.io.IOException;

import javax.swing.*;


public class RaceCar 
{
	public static void main(String[] args)  
	{
		
		
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
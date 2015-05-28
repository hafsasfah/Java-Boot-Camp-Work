


import javax.swing.*;

import java.awt.*;
import java.util.*;


public class Monopoly extends JApplet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8806528854526693121L;
	
	
	
	public Monopoly(int totalPlayer)
	{
		
		
		
		
	}
	
	
	public static void main(String []args)
	{
		int totalPlayer = 0;
		
		while(totalPlayer < 2 || totalPlayer > 8)
		{
			Scanner keyboard = new Scanner(System.in);
			JOptionPane.showInputDialog("Enter Total Players: ");
			totalPlayer = keyboard.nextInt();
			
		}
		
		Monopoly game = new Monopoly(totalPlayer);
	
	}
	
	
	
	
	
	

}

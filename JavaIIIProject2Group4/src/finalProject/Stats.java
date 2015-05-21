package finalProject;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Stats implements ActionListener {
	
	private JPanel panel;
	static Random r = new Random();
	static Random r2 = new Random();
	static Random r3 = new Random();
	AdventureGame ag;
	
	static int dice3t1 = r.nextInt(6);
	static int dice3t2 = r2.nextInt(6); 
	static int dice3t3 = r3.nextInt(6); 
	static int statNumber1 = dice3t1 * 3;
	static int statNumber2 = dice3t2 * 3;
	static int statNumber3 = dice3t3 * 3;
	static int dex = statNumber1;
	static int strg = statNumber2;
	static int intel = statNumber3;
	static int hp = 100;
	
	public Stats(AdventureGame ag)
	{
		this.ag = ag;
		panel = new JPanel();
	}

	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand();
				
				if (actionCommand.equals("SCEPTOR"))
				{
					JLabel statsLabel = new JLabel("<html> DEX: "+dex+"<br/> STRG: "+
							strg+"<br/> INTEL: "+intel+"<br/> HEALTH: "+hp);
					ag.PlayerPaneStats.add(statsLabel);
					
					ag.PlayerPaneStats.revalidate();
					
				}
			   if (actionCommand.equals("MAGE SWORD"))	
				{
					JLabel statsLabel = new JLabel("<html> DEX: "+dex+"<br/> STRG: "+
							strg+"<br/> INTEL: "+intel+"<br/> HEALTH: "+hp);
					ag.PlayerPaneStats.add(statsLabel);
					
					ag.PlayerPaneStats.revalidate();
					
				}	
					
	}
//public static void main(String[] args)
//{
//new Stats();	
//}

	}



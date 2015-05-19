

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Stats implements ActionListener {
	
	
	Random r = new Random();
	Random r2 = new Random();
	Random r3 = new Random();
	AdventureGame AdvGame;
	
	int dice3t1 = r.nextInt(6);
	int dice3t2 = r2.nextInt(6); 
	int dice3t3 = r3.nextInt(6); 
	int statNumber1 = dice3t1 * 3;
	int statNumber2 = dice3t2 * 3;
	int statNumber3 = dice3t3 * 3;
	int dex = statNumber1;
	int strg = statNumber2;
	int intel = statNumber3;
	int hp = 100;
	
	public Stats(AdventureGame AdvGame)
	{
		this.AdvGame = AdvGame;
	}
	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand();
				
				if (actionCommand.equals("SCEPTOR"))
				{
					JLabel statsLabel = new JLabel("<html> DEX: "+dex+"<br/> STRG: "+
							strg+"<br/> INTEL: "+intel+"<br/> HEALTH: "+hp);
					statsLabel.setBounds(195, 125, 80, 92);
					//contentPane.add(statsLabel);
				}
				else if (actionCommand.equals("MAGE SWORD"))
				{
					JLabel statsLabel = new JLabel("<html> DEX: "+dex+"<br/> STRG: "+
							strg+"<br/> INTEL: "+intel+"<br/> HEALTH: "+hp);
					
					AdvGame.add(statsLabel);
					AdvGame.setSize(1000,1000);
				}
				else if (actionCommand.equals("BOW AND ARROW"))
				{
					JLabel statsLabel = new JLabel("<html> DEX: "+dex+"<br/> STRG: "+
							strg+"<br/> INTEL: "+intel+"<br/> HEALTH: "+hp);
					
					AdvGame.add(statsLabel);
					AdvGame.setSize(1000,1000);
				}	
				else if (actionCommand.equals("LONG SWORD"))
				{
					JLabel statsLabel = new JLabel("<html> DEX: "+dex+"<br/> STRG: "+
							strg+"<br/> INTEL: "+intel+"<br/> HEALTH: "+hp);
					
					AdvGame.add(statsLabel);
					AdvGame.setSize(1000,1000);
				}	
				else if (actionCommand.equals("PISTOL"))
				{
					JLabel statsLabel = new JLabel("<html> DEX: "+dex+"<br/> STRG: "+
							strg+"<br/> INTEL: "+intel+"<br/> HEALTH: "+hp);
					
					AdvGame.add(statsLabel);
					AdvGame.setSize(1000,1000);
				}	
				else if (actionCommand.equals("DAGGERS"))
				{
					JLabel statsLabel = new JLabel("<html> DEX: "+dex+"<br/> STRG: "+
							strg+"<br/> INTEL: "+intel+"<br/> HEALTH: "+hp);
					
					AdvGame.add(statsLabel);
					AdvGame.setSize(1000,1000);
				}	
					
	}
}

package finalProject;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Stats implements ActionListener {
	
	private JPanel panel;
	private Random r;
	private Random r2;
	private Random r3;
	private AdventureGame ag;
	
	private int dice3t1;
	private int dice3t2; 
	private int dice3t3; 
	private int statNumber1;
	private int statNumber2;
	private int statNumber3;
	private int dex;
	private int strg;
	private int intel;
	private int hp;
	
	public Stats(AdventureGame ag)
	{
		this.ag = ag;
		panel = new JPanel();
		
		r = new Random();
		r2 = new Random();
		r3 = new Random();
		
		dice3t1 = r.nextInt(6);
		dice3t2 = r2.nextInt(6); 
		dice3t3 = r3.nextInt(6); 
		statNumber1 = dice3t1 * 3;
		statNumber2 = dice3t2 * 3;
		statNumber3 = dice3t3 * 3;
		dex = statNumber1;
		strg = statNumber2;
		intel = statNumber3;
		hp = 100;
	}

	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand();
				
				if (actionCommand.equals("SCEPTOR"))
				{
					JLabel statsLabel = new JLabel("<html> DEX: "+ag.player1Stats.getDex()+"<br/> STRG: "+
							ag.player1Stats.getStrg()+"<br/> INTEL: "+ag.player1Stats.getIntel()+"<br/> HEALTH: "+ag.player1Stats.getHp());
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

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getStrg() {
		return strg;
	}

	public void setStrg(int strg) {
		this.strg = strg;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	}



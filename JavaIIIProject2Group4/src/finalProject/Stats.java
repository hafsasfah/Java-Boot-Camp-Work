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
	private int MonsterHp;
	
	public Stats(AdventureGame ag)
	{
		this.ag = ag;
		panel = new JPanel();
		
		r = new Random();
		r2 = new Random();
		r3 = new Random();
		
		dice3t1 = r.nextInt(6)+1;
		dice3t2 = r2.nextInt(6)+1; 
		dice3t3 = r3.nextInt(6)+1; 
		statNumber1 = dice3t1 + dice3t2 ;
		statNumber2 = dice3t2 + dice3t3 + dice3t1;
		statNumber3 = dice3t3 + dice3t1;
		dex = statNumber1;
		strg = statNumber2;
		intel = statNumber3;
		hp = 100;
		MonsterHp = 20;
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
				   JLabel statsLabel = new JLabel("<html> DEX: "+ag.player2Stats.getDex()+"<br/> STRG: "+
							ag.player2Stats.getStrg()+"<br/> INTEL: "+ag.player2Stats.getIntel()+"<br/> HEALTH: "+ag.player2Stats.getHp());
					ag.PlayerPaneStats.add(statsLabel);
					
					ag.PlayerPaneStats.revalidate();
					
				}	
			   if (actionCommand.equals("BOW AND ARROW"))	
				{
				   JLabel statsLabel = new JLabel("<html> DEX: "+ag.player3Stats.getDex()+"<br/> STRG: "+
							ag.player3Stats.getStrg()+"<br/> INTEL: "+ag.player3Stats.getIntel()+"<br/> HEALTH: "+ag.player4Stats.getHp());
					ag.PlayerPaneStats.add(statsLabel);
					
					ag.PlayerPaneStats.revalidate();
					
				}	
			   if (actionCommand.equals("LONG SWORD"))	
				{
				   JLabel statsLabel = new JLabel("<html> DEX: "+ag.player4Stats.getDex()+"<br/> STRG: "+
							ag.player4Stats.getStrg()+"<br/> INTEL: "+ag.player4Stats.getIntel()+"<br/> HEALTH: "+ag.player4Stats.getHp());
					ag.PlayerPaneStats.add(statsLabel);
					
					ag.PlayerPaneStats.revalidate();
					
				}	
			   if (actionCommand.equals("PISTOL"))	
				{
				   JLabel statsLabel = new JLabel("<html> DEX: "+ag.player1Stats.getDex()+"<br/> STRG: "+
							ag.player1Stats.getStrg()+"<br/> INTEL: "+ag.player1Stats.getIntel()+"<br/> HEALTH: "+ag.player1Stats.getHp());
					ag.PlayerPaneStats.add(statsLabel);
					
					ag.PlayerPaneStats.revalidate();
					
				}	
			   if (actionCommand.equals("DAGGERS"))	
				{
				   JLabel statsLabel = new JLabel("<html> DEX: "+ag.player2Stats.getDex()+"<br/> STRG: "+
							ag.player2Stats.getStrg()+"<br/> INTEL: "+ag.player2Stats.getIntel()+"<br/> HEALTH: "+ag.player2Stats.getHp());
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
	public int getMonsterHp() {
		return MonsterHp;
	}

	public void setMonsterHp(int MonsterHp) {
		this.MonsterHp = MonsterHp;
	}

	}



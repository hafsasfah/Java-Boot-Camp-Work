package finalProject;

//import ButtonListener;
//import Stats;
//import testImage;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.Border;


public class AdventureGame  extends JFrame  // RENAME CLASS TO THE PLAYER CLASS?
{
	JTextArea jt;
	JPanel PlayerPane ;
	JPanel PlayerPaneNames ;
	JPanel PlayerPaneStats ;
	JPanel MonsterPaneStats;
	JLabel statsLabel ;
	
	public static void main (String[] args)
	{
		
		new AdventureGame();
		
	}
	private String player1name;
	private String player2name;
	private String player3name;
	private String player4name;
	
	private Stats monster1Stats;
	private Stats monster2Stats;
	Stats player1Stats;
	private Stats player2Stats;	
	
	private Character player1;
	
	
public AdventureGame()
	{
	
	setTitle("Adventure Time!");
	setVisible(true);
	setSize(1000, 700);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	
	 monster1Stats = new Stats(this);
	 monster2Stats = new Stats(this);
	 player1Stats = new Stats(this);
	 player2Stats = new Stats(this);
	
		
		JPanel contentPane = new JPanel();
		
	
		JButton btnNewButton = new JButton("Fight!!!");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				int attack = player1Stats.getStrg() - monster1Stats.getHp();
				
				jt.setText("The monster took "+player1Stats.getStrg()+" damage!");	
				
			 
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				jt.setText("You searched the room! ");	
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Run!!!");
		btnNewButton_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				jt.setText("YOU RAN LIKE A LILLTE GIRL! and fell on your face.. ");	
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Rest");
		btnNewButton_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				jt.setText("Your party took a nap! ");
				
			}
		});
		contentPane.add(btnNewButton_3);
		
		//Directional Buttons
		JButton btnNewButton_4 = new JButton("WEST");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("NORTH");
		btnNewButton_5.addActionListener(new ActionListener()
		{
			
			
			public void actionPerformed(ActionEvent e) 
			{
				//statsLabel = new JLabel();
				Random r =  new Random();
				Random r2 = new Random();
				Random r3 = new Random();
				Random r4 = new Random();
				
				int north = r.nextInt(6)+1;
				int south  = r2.nextInt(6)+1; 
				int east  = r3.nextInt(6)+1;
				int west   = r4.nextInt(6)+1;
				
				jt.setText("You have gone north and encountered some monsters!!" +north);
				
				
				 switch (north) {
			     case 1: 
			    	 jt.setText("2 Orcs and a Dragon are in this room!");
			    	
			    	 JLabel statsLabel = new JLabel("<html>Dragon: <br/> DEX: "+monster1Stats.getDex()+"<br/> STRG: "+
			    			 monster1Stats.getStrg() +"<br/> INTEL: "+monster1Stats.getIntel()+"<br/> HEALTH: "+monster1Stats.getHp());
			    	 
			    	 JLabel statsLabel2 = new JLabel("<html>Dragon: <br/> DEX: "+monster2Stats.getDex()+"<br/> STRG: "+
			    			 monster2Stats.getStrg() +"<br/> INTEL: "+monster2Stats.getIntel()+"<br/> HEALTH: "+monster2Stats.getHp());
			    	 
			    	 JLabel statsLabel3 = new JLabel("<html>Dragon: <br/> DEX: "+player1Stats.getDex()+"<br/> STRG: "+
			    			 player1Stats.getStrg() +"<br/> INTEL: "+player1Stats.getIntel()+"<br/> HEALTH: "+player1Stats.getHp());
			    	 
			    	MonsterPaneStats.add(statsLabel);
			    	MonsterPaneStats.add(statsLabel2);
			    	MonsterPaneStats.add(statsLabel3);
						
					MonsterPaneStats.revalidate();
			    	 
			    	 			break;
			     case 2:   
			    	 jt.setText("An Orc,2 Dragons and 5 wolves are in this room!");
			    	 break;
			    	 
			    	 
				 				
			     case 3:  
			    	 jt.setText("An Orc and 6 Dragons are in this room!");
				 				break;
			     case 4: 
			    	 jt.setText("9 Orcs and 2 Dragons are in this room!");
				 				break;
			     case 5:  
			    	 jt.setText("5 Orcs and 1 wolf are in this room!");
				 				break;
			     case 6: 
			    	 jt.setText("3 Orcs, A wolf, and 3 Dragons are in this room!");
				 				break;
				}
				
				
			}
		});
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("SOUTH");
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("EAST");
		contentPane.add(btnNewButton_7);
		
		add(contentPane, BorderLayout.SOUTH);
		
		JPanel jp = new JPanel();
		this.jt = new JTextArea(60,40);
		jp.add(this.jt);
		add(jp);
		add(jp,BorderLayout.CENTER);
		

		
		
		
		
		
		
		/*this.player1name = JOptionPane.showInputDialog("Player 1 please enter your name.");
		this.player2name = JOptionPane.showInputDialog("Player 2 please enter your name.");
		this.player3name = JOptionPane.showInputDialog("Player 3 please enter your name.");
		this.player4name = JOptionPane.showInputDialog("Player 4 please enter your name.");*/
		
		PlayerPane = new JPanel();
		PlayerPaneNames = new JPanel();
		PlayerPaneStats = new JPanel();
		MonsterPaneStats = new JPanel();
		
		PlayerPane.setLayout(new GridLayout(1,2));
		PlayerPaneNames.setLayout(new GridLayout(4,1));
		PlayerPaneStats.setLayout(new GridLayout(4,1));
		MonsterPaneStats.setLayout(new GridLayout(4,2));
		
		JButton ply1 = new JButton();
		ply1.setIcon(new ImageIcon (getClass().getResource("142.jpg")));
		ply1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				new testImage(AdventureGame.this);
				new ButtonListener(AdventureGame.this);
				new Stats(AdventureGame.this);
				

			}
		});
		
		PlayerPaneNames.add(ply1);
		
		
		JButton ply2 = new JButton();
		ply2.setIcon(new ImageIcon (getClass().getResource("139.jpg")));
		ply2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				new testImage(AdventureGame.this);
				new ButtonListener(AdventureGame.this);
				new Stats(AdventureGame.this);
			}
		});
	
		PlayerPaneNames.add(ply2);

		
		JButton ply3 = new JButton();
		ply3.setIcon(new ImageIcon (getClass().getResource("138.jpeg")));
		ply3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				new testImage(AdventureGame.this);
				new ButtonListener(AdventureGame.this);
				new Stats(AdventureGame.this);
			}
		});
		
		PlayerPaneNames.add(ply3);

		JButton ply4 = new JButton();
		ply4.setIcon(new ImageIcon (getClass().getResource("140.jpeg")));
		ply4.addActionListener(new ActionListener()
		{ 
			public void actionPerformed(ActionEvent e) 
			{
				new testImage(AdventureGame.this);
				new ButtonListener(AdventureGame.this);
				new Stats(AdventureGame.this);
			}
		});
	
		PlayerPaneNames.add(ply4);
		
		
		PlayerPane.add(PlayerPaneNames);
		PlayerPane.add(PlayerPaneStats);
		
		add(PlayerPane, BorderLayout.WEST);
		add(MonsterPaneStats, BorderLayout.EAST);
		
				
		JLabel player1Label = new JLabel(player1name);
		JLabel player2Label = new JLabel(player2name);
		JLabel player3Label = new JLabel(player3name);
		JLabel player4Label = new JLabel(player4name);
		
		
		
		/*player1.add(player1Label);
		player2.add(player2Label);
		player3.add(player3Label);
		player4.add(player4Label);
		*/
		revalidate();
		
		}
	}





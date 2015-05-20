
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultCaret;



public class GUI extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Player MainPlayer;
	RoomGenerator createDungeon = new RoomGenerator();
	
	private JPanel playerLabel;
	private JTextArea playerStats;
	private JTextArea outputMUD; 
	private JPanel textMap;
	private JScrollPane scroller;
	private JPanel buttonMap;
	private JPanel attackMap;
	private JPanel runMap;
	private JButton buttonNorth;
	private JButton buttonWest;
	private JButton buttonSouth;
	private JButton buttonEast;
	private JButton buttonAttack;
	private JButton buttonRun;

    static byte gridLayout[][]  =  {{1,0,0,1,1}, 
									{1,0,1,0,1}, 
									{1,1,1,1,1},
									{1,1,0,0,1},
									{1,1,0,1,1}};

    Room dungeon[][] = new Room [5][5];

	
	public GUI()
	{
		playerLabel = new JPanel();
		MainPlayer = new Player();
		buildPlayer(MainPlayer);
		setLayout(new GridLayout(2,2));
		setTitle("MUD");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		createDungeon.populateDungeon(gridLayout, dungeon);
		buildTextPanel();
		buildButtonMap();
		this.add(textMap);
		
		this.add(buttonMap);
		
		buildAttackMap();
		this.add(attackMap);

		buildStory();

		checkButtons();
		setVisible(true);
		outputMUD.append("\n" + dungeon[MainPlayer.location.row][MainPlayer.location.column].roomDescription());
	}
	
	public void buildStory()
	{
		dungeon[0][0].describeRoom("You are in a slimy, dimly lit stone room. There are no furnishings or trinkets that suggest comfort to be found.");
		dungeon[1][0].describeRoom("You squeeze through a narrow crack in the wall to find what was most certainly once a home for goblins. "
								+ "\nBones litter the ground around a smoking campfire.");
		dungeon[2][1].describeRoom("You walk down a dark corridor dimly lit by fading torches, the stench in the air is overwhelming with dead corpses.");
		dungeon[2][2].describeRoom("You enter a huge stone room with a giant statue of a goblin and a skulking figure standing in pure darkness in the corner.");
		dungeon[2][3].describeRoom("You make a hasty exit into another hallway leading up to a winding stairway.");
		dungeon[2][4].describeRoom("You look up and down the massive staircase.");	
	}
	
	public void buildPlayer(Player player)
	{
		player.name = JOptionPane.showInputDialog("Input a name.");
		playerStats = new JTextArea("Character Name: " + MainPlayer.getName() + "\n"
				+ "Health: " + MainPlayer.getHitPoints() + "\n"
				+ "Strength: " + MainPlayer.getStrength() + "\n"
				+ "Dexterity: " + MainPlayer.getDexterity() + "\n"
				+ "Intelligence: " + MainPlayer.getIntelligence(), 20,20);
		playerLabel.add(playerStats);
		this.add(playerLabel);
	}
	public void refreshCharacterPanel()
	{
		playerStats.setText("Character Name: " + MainPlayer.getName() + "\n"
				+ "Health: " + MainPlayer.getHitPoints() + "\n"
				+ "Strength: " + MainPlayer.getStrength() + "\n"
				+ "Dexterity: " + MainPlayer.getDexterity() + "\n"
				+ "Intelligence: " + MainPlayer.getIntelligence());	
	}
	public void buildTextPanel()
	{
		textMap = new JPanel();
		textMap.setLayout(new GridLayout(1,2));
		outputMUD = new JTextArea();
		DefaultCaret caret = (DefaultCaret)outputMUD.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		outputMUD.setText("Welcome to the Dungeon, " + MainPlayer.getName() + ".");
		outputMUD.setEditable(false);
		outputMUD.setSize(new Dimension(800,300));
		outputMUD.setLineWrap(true);
		scroller = new JScrollPane(outputMUD);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		textMap.add(scroller);
	}
	
	public void buildButtonMap()
	{
		buttonMap = new JPanel();
		buttonNorth = new JButton("North");
		buttonWest = new JButton("West  ");
		buttonSouth = new JButton("South");
		buttonEast = new JButton("East  ");
		
		
		buttonNorth.addActionListener(new MovementButtonListener());
		buttonWest.addActionListener(new MovementButtonListener());
		buttonSouth.addActionListener(new MovementButtonListener());
		buttonEast.addActionListener(new MovementButtonListener());
		
		
		buttonMap.add(buttonNorth);
		buttonMap.add(buttonWest);
		buttonMap.add(buttonSouth);
		buttonMap.add(buttonEast);
		
		
	}
	
	public void buildAttackMap()
	{
		attackMap = new JPanel();
		attackMap.setLayout(new FlowLayout());
		buttonAttack = new JButton("Attack");
		buttonAttack.addActionListener(new AttackButtonListener());
		attackMap.add(buttonAttack);
		
		buttonRun = new JButton("Run");
		buttonRun.addActionListener(new MovementButtonListener());
		attackMap.add(buttonRun);
	}
	
	private void checkButtons()
	{

		if(!(createDungeon.lookNorth(MainPlayer, dungeon)))
		{
			buttonNorth.setEnabled(false);
		}
		else
			buttonNorth.setEnabled(true);
		if(!(createDungeon.lookWest(MainPlayer, dungeon)))
		{
			buttonWest.setEnabled(false);
		}
		else
			buttonWest.setEnabled(true);
		if(!(createDungeon.lookSouth(MainPlayer, dungeon)))
		{
			buttonSouth.setEnabled(false);
		}
		else
			buttonSouth.setEnabled(true);
		if(!(createDungeon.lookEast(MainPlayer, dungeon)))
		{
			buttonEast.setEnabled(false);
		}
		else
			buttonEast.setEnabled(true);
		if(dungeon[MainPlayer.location.row][MainPlayer.location.column].Monstercontainer.size() > 0)
		{
			buttonAttack.setEnabled(true);
		}
		else
			buttonAttack.setEnabled(false);
		if(MainPlayer.alive == false)
		{
			buttonNorth.setEnabled(false);
			buttonWest.setEnabled(false);
			buttonSouth.setEnabled(false);
			buttonEast.setEnabled(false);
			buttonAttack.setEnabled(false);
		}
	}
	
	private class AttackButtonListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent E)
		{
			MainPlayer.attack(dungeon[MainPlayer.location.row][MainPlayer.location.column].Monstercontainer.get(0));
			outputMUD.append("\n" + MainPlayer.getName() + " attacks the " + dungeon[MainPlayer.location.row][MainPlayer.location.column].Monstercontainer.get(0).getName() + "!");
			if(dungeon[MainPlayer.location.row][MainPlayer.location.column].Monstercontainer.get(0).deathCheck() == true)
			{
				outputMUD.append("\n" + dungeon[MainPlayer.location.row][MainPlayer.location.column].Monstercontainer.get(0).getName() + " is dead. It's body quickly turns to ash, and is blown away.");
				dungeon[MainPlayer.location.row][MainPlayer.location.column].Monstercontainer.remove(0);
				
			}
			checkButtons();
			refreshCharacterPanel();
		}
		
	}
	
	private class MovementButtonListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent E)
		{
			dungeon[MainPlayer.location.row][MainPlayer.location.column].container.remove(MainPlayer);
			if(E.getSource() == buttonNorth)
			{
				MainPlayer.location.row -= 1;
				dungeon[MainPlayer.location.row][MainPlayer.location.column].container.add(MainPlayer);
				checkButtons();
				dungeon[MainPlayer.location.row][MainPlayer.location.column].enterRoom();
				outputMUD.append("\nMoved North");
				outputMUD.append("\n" + dungeon[MainPlayer.location.row][MainPlayer.location.column].roomDescription());
				
			}
			if(E.getSource() == buttonWest)
			{
				MainPlayer.location.column -= 1;
				dungeon[MainPlayer.location.row][MainPlayer.location.column].container.add(MainPlayer);
				checkButtons();
				dungeon[MainPlayer.location.row][MainPlayer.location.column].enterRoom();
				outputMUD.append("\nMoved West.");
				outputMUD.append("\n" + dungeon[MainPlayer.location.row][MainPlayer.location.column].roomDescription());
			}
			if(E.getSource() == buttonSouth)
			{
				MainPlayer.location.row += 1;
				dungeon[MainPlayer.location.row][MainPlayer.location.column].container.add(MainPlayer);
				checkButtons();
				dungeon[MainPlayer.location.row][MainPlayer.location.column].enterRoom();
				outputMUD.append("\nMoved South.");
				outputMUD.append("\n" + dungeon[MainPlayer.location.row][MainPlayer.location.column].roomDescription());
			}
			if(E.getSource() == buttonEast)
			{
				MainPlayer.location.column += 1;
				dungeon[MainPlayer.location.row][MainPlayer.location.column].container.add(MainPlayer);
				checkButtons();
				dungeon[MainPlayer.location.row][MainPlayer.location.column].enterRoom();
				outputMUD.append("\nMoved East.");
				outputMUD.append("\n" + dungeon[MainPlayer.location.row][MainPlayer.location.column].roomDescription());
			}
			
			
			
			
			/*
			player at (position,position)
			if room is available around player coordinates
			move to room based on button pressed
			call that rooms enter procedure
			update buttons
			
			*/
		}
		
		
	}
	
	public static void main(String[] args)
	{
		
		GUI gameFace = new GUI();
		
		
		
	}
}

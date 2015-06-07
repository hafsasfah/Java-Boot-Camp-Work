package AdventureGameClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.DefaultCaret;



public class Gui extends JFrame
{
	private static final long serialVersionUID = 5193;
	
	character Team;
	RandomRoom createDungeon = new RandomRoom();
	
	private JPanel playerLabel;
	private JTextArea playerStats;
	private JTextArea outputMUD; 
	private JPanel textMap;
	private JScrollPane scroller;
	private JPanel buttonMap;
	private JPanel attackMap;
	private JButton buttonNorth;
	private JButton buttonWest;
	private JButton buttonSouth;
	private JButton buttonEast;
	private JButton buttonAttack;
	private JButton buttonRun;

    static byte gridLayout[][]  =  
    	{
    	
    	{ 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1}, 
    	{ 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1}, 
    	{ 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1},
    	{ 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1},
    	{ 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1},
    	{ 0, 1, 0, 1, 0, 0 ,1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1}, 
    	{ 0, 1, 0, 1, 0, 1 ,1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1}, 
    	{ 0, 1, 0, 1, 1, 0 ,1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
    	{ 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1},
    	{ 1, 1, 1, 1, 0, 1 ,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1}
									
    };


    Room dungeon[][] = new Room [10][10];

	
	public Gui()
	{
		playerLabel = new JPanel();
		Team = new character();
		buildPlayer();
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


		checkButtons();
		setVisible(true);
		outputMUD.append("\n" + dungeon[Team.location.row][Team.location.column].roomDescription());
	}
	
	
	public void buildPlayer()
	{
		Team.setName(JOptionPane.showInputDialog("Input a name."));
		playerStats = new JTextArea("Character Name: " + Team.getName() + "\n"
				+ "HP: " + Team.getHitPoints() + "\n"
				+ "Strength: " + Team.getStrength() + "\n"
				+ "Dexterity: " + Team.getDexterity() + "\n"
				+ "Wisdom: " + Team.getWisdom() + "\n"
				+ "Mana:  "+ Team.getMana(), 20,20);
		playerLabel.add(playerStats);
		this.add(playerLabel);
	}
	public void refreshCharacterPanel()
	{
		playerStats.setText("Character Name: " + Team.getName() + "\n"
				+ "Health: " + Team.getHitPoints() + "\n"
				+ "Strength: " + Team.getStrength() + "\n"
				+ "Dexterity: " + Team.getDexterity() + "\n"
				+ "Intelligence: " + Team.getWisdom());	
	}
	public void buildTextPanel()
	{
		textMap = new JPanel();
		textMap.setLayout(new GridLayout(1,2));
		outputMUD = new JTextArea();
		DefaultCaret caret = (DefaultCaret)outputMUD.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		outputMUD.setText(" redon Dungeonmade with help from some team over the weekend" + Team.getName() + ".");
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

		buttonNorth.setEnabled ( createDungeon.lookNorth(Team, dungeon ) );
		buttonWest.setEnabled ( createDungeon.lookWest(Team, dungeon ) );
		buttonSouth.setEnabled ( createDungeon.lookSouth(Team, dungeon ) );
		buttonEast.setEnabled ( createDungeon.lookEast(Team, dungeon ) );
		

		if(dungeon[Team.location.row][Team.location.column].Monstercontainer.size() > 0)
		{
			buttonAttack.setEnabled(true);
		}
		else
			buttonAttack.setEnabled(false);
		
		
		if(Team.alive == false)
		{
			buttonNorth.setEnabled(false);
			buttonWest.setEnabled(false);
			buttonSouth.setEnabled(false);
			buttonEast.setEnabled(false);
			buttonAttack.setEnabled(false);
			buttonRun.setEnabled(false);
		}
	}
	
	private class AttackButtonListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent E)
		{
			Team.attack(dungeon[Team.location.row][Team.location.column].Monstercontainer.get(0));
			outputMUD.append("\n" + Team.getName() + " attacks the " + dungeon[Team.location.row][Team.location.column].Monstercontainer.get(0).getName() + "!");
			if(dungeon[Team.location.row][Team.location.column].Monstercontainer.get(0).deathCheck() == true)
			{
				outputMUD.append("\n" + dungeon[Team.location.row][Team.location.column].Monstercontainer.get(0).getName() + " Hope, this things dead...");
				dungeon[Team.location.row][Team.location.column].Monstercontainer.remove(0);
				
			}
			checkButtons();
			refreshCharacterPanel();
		}
		
	}
	
	private class MovementButtonListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent E)
		{
			dungeon[Team.location.row][Team.location.column].container.remove(Team);
			if(E.getSource() == buttonNorth)
			{
				Team.location.row -= 1;
				dungeon[Team.location.row][Team.location.column].container.add(Team);
				checkButtons();
				dungeon[Team.location.row][Team.location.column].enterRoom();
				outputMUD.append("\nMoved North");
				outputMUD.append("\n" + dungeon[Team.location.row][Team.location.column].roomDescription());
				
			}
			if(E.getSource() == buttonWest)
			{
				Team.location.column -= 1;
				dungeon[Team.location.row][Team.location.column].container.add(Team);
				checkButtons();
				dungeon[Team.location.row][Team.location.column].enterRoom();
				outputMUD.append("\nMoved West.");
				outputMUD.append("\n" + dungeon[Team.location.row][Team.location.column].roomDescription());
			}
			if(E.getSource() == buttonSouth)
			{
				Team.location.row += 1;
				dungeon[Team.location.row][Team.location.column].container.add(Team);
				checkButtons();
				dungeon[Team.location.row][Team.location.column].enterRoom();
				outputMUD.append("\nMoved South.");
				outputMUD.append("\n" + dungeon[Team.location.row][Team.location.column].roomDescription());
			}
			if(E.getSource() == buttonEast)
			{
				Team.location.column += 1;
				dungeon[Team.location.row][Team.location.column].container.add(Team);
				checkButtons();
				dungeon[Team.location.row][Team.location.column].enterRoom();
				outputMUD.append("\nMoved East.");
				outputMUD.append("\n" + dungeon[Team.location.row][Team.location.column].roomDescription());
			}
			
			
	
		}
		
		
	}
	
	public static void main(String[] args)
	{
		
		
		
	}
}

import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.GridBagLayout;
//import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;



public class GUI extends JFrame{
	
	private static final long serialVersionUID = -7961136662816131164L;
	private JButton searchButton;
	private JButton sleepButton;
	private JButton attackButton;
	private JButton runButton;
	private JButton northButton;
	private JButton downButton;
	private JButton leftButton;
	private JButton rightButton;
	private JTextArea console;
	private JTextArea location; // may remove this display later
	private JPanel textAreaPanel;
	private JPanel locationPanel;
	private JPanel buttonsPanel;
	private JPanel actionsButtonsPanel;
	private JPanel actionstopButtonsPanel;
	private JPanel actionsbottomButtonsPanel;
	private JPanel movementButtonsPanel;
	private iMaze maze;
	private iCharacter player;
	

	public GUI(){
		super ("Group 3's awesome adventure game");
		//maze = new Maze("10x10.maze");
		//maze = new Maze();
		player = new Character();
		
		//Create and place Panels
		locationPanel = new JPanel();
		add(this.locationPanel,BorderLayout.PAGE_START);
		this.textAreaPanel = new JPanel();
		add(this.textAreaPanel,BorderLayout.CENTER);
		this.buttonsPanel = new JPanel();
		add(this.buttonsPanel,BorderLayout.PAGE_END);
		
		
		
		//adds buttons to buttons panel   // working on better positioning
		this.movementButtonsPanel = new JPanel();
		this.movementButtonsPanel.setLayout(new BorderLayout());
		this.buttonsPanel.add(this.movementButtonsPanel,BorderLayout.WEST);
		this.actionsButtonsPanel = new JPanel();
		this.actionsButtonsPanel.setLayout(new BorderLayout());
		this.buttonsPanel.add(this.actionsButtonsPanel,BorderLayout.EAST);
		actionstopButtonsPanel = new JPanel();
		actionstopButtonsPanel.setLayout(new BorderLayout());
		this.actionsButtonsPanel.add(actionstopButtonsPanel,BorderLayout.NORTH);
		actionsbottomButtonsPanel = new JPanel();
		actionsbottomButtonsPanel.setLayout(new BorderLayout());
		this.actionsButtonsPanel.add(actionsbottomButtonsPanel,BorderLayout.SOUTH);
		
		
		
		//adds location text field to its panel   // may remove this panel before release
		this.location = new JTextArea("Current Location: "+ player.getCharLocationString(),1,30);
		//location.setBackground(Color.lightGray);//trying to remove background color
		this.locationPanel.add(location,BorderLayout.NORTH);
		
		//adds game dialog box to its panel
		console = new JTextArea("Current Location: "+ player.getCharLocationString() +"\n",20,30); 
		this.textAreaPanel.add(console,BorderLayout.SOUTH);
		
	
		
		//Movement buttons added to button panel
		northButton = new JButton("North");
		this.movementButtonsPanel.add(northButton,BorderLayout.PAGE_START);
		downButton = new JButton("South");
		this.movementButtonsPanel.add(downButton,BorderLayout.PAGE_END);
		leftButton = new JButton("West");
		this.movementButtonsPanel.add(leftButton,BorderLayout.LINE_START);
		rightButton = new JButton("East");
		this.movementButtonsPanel.add(rightButton,BorderLayout.LINE_END);
		
		//Action buttons added to button panel
		searchButton = new JButton("Search ");
		this.actionstopButtonsPanel.add(searchButton,BorderLayout.WEST);
		sleepButton = new JButton(" Sleep");
		this.actionstopButtonsPanel.add(sleepButton,BorderLayout.EAST);
		attackButton = new JButton("Attack");
		this.actionsbottomButtonsPanel.add(attackButton,BorderLayout.EAST);
		runButton = new JButton("    Run   ");
		this.actionsbottomButtonsPanel.add(runButton,BorderLayout.WEST);	
		
		//Event handling for all buttons
		Listener handler = new Listener();
		northButton.addActionListener(handler);
		downButton.addActionListener(handler);
		leftButton.addActionListener(handler);
		rightButton.addActionListener(handler);
		sleepButton.addActionListener(handler);
		searchButton.addActionListener(handler);
		attackButton.addActionListener(handler);
		runButton.addActionListener(handler);		
		screenUpdate();
		
		
		
	}
	
	private void screenUpdate(){
		buttonCheck();
		clearConsole();
		//add any other screen updates here as needed
		
	}
	//clears game dialog
	private void clearConsole(){
		console.setText("");
		this.location.setText("Current Location: "+ player.getCharLocationString());
	}
	
	//checks button availability
	private void buttonCheck(){
		int[] playerLocation = player.getCharLocation();
		if(!(maze.existsUp(playerLocation))){
			northButton.setEnabled(false);
		}
		else northButton.setEnabled(true);
		if(!(maze.existsDown(playerLocation))){
			downButton.setEnabled(false);
		}else downButton.setEnabled(true);
		if(!(maze.existsLeft(playerLocation))){
			leftButton.setEnabled(false);
		}else leftButton.setEnabled(true);
		if(!(maze.existsRight(playerLocation))){
			rightButton.setEnabled(false);
		}else rightButton.setEnabled(true);
		
		
		//if statements needed for action buttons
		searchButton.setEnabled(true);
		
		sleepButton.setEnabled(true);
		
		attackButton.setEnabled(true);
		
		runButton.setEnabled(true);
		
	}
	
	private class Listener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) {
			
			
			
			if(event.getSource() == northButton){
				player.generateMvmtUp();
				screenUpdate();
				console.append("North \n");
				
			}	
			else if(event.getSource() == downButton){
				player.generateMvmtDown();
				screenUpdate();
				console.append("South \n");
			}
			else if(event.getSource() == leftButton){
				player.generateMvmtLeft();
				screenUpdate();
				console.append("West \n");
			}
			else if(event.getSource() == rightButton){
				player.generateMvmtRight();
				screenUpdate();
				console.append("East\n");
			}
			
			else if(event.getSource() == searchButton){
			buttonCheck();
				console.append("The Room is empty.....oh so very Empty\n");
								
			}	
			else if(event.getSource() == sleepButton){
				buttonCheck();
				console.append("You had a siesta, feel better?\n");
			}
			else if(event.getSource() == attackButton){
				buttonCheck();
				console.append("You attacked.........................a wall. "
						+ "\nIf you had a weapon you probably just dented it\n"
						+ "Good job ace. Real smooth\n");
			}
			else if(event.getSource() == runButton){
				buttonCheck();
				console.append("Running from shadows? Some adventurer you are.\n");
			}
		}
		
	}
	
	

}

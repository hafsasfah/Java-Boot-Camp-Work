
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
	static public JTextArea console;
	private JTextArea location; // may remove this display later
	private JPanel textAreaPanel;
	private JPanel locationPanel;
	private JPanel buttonsPanel;
	private JPanel actionsButtonsPanel; 
	private JPanel actionstopButtonsPanel;
	private JPanel actionsbottomButtonsPanel;
	
	private static iMaze maze = new Maze();
	//private static maze = new Maze("10x10.maze");
	private Party party;
	
	
			
	

	public GUI(){
		super ("Group 3's awesome adventure game");
		
		party = new Party();
		
		//Create and place Panels
		locationPanel = new JPanel();
		add(this.locationPanel,BorderLayout.PAGE_START);
		this.textAreaPanel = new JPanel();
		add(this.textAreaPanel,BorderLayout.CENTER);
		this.buttonsPanel = new JPanel();
		add(this.buttonsPanel,BorderLayout.PAGE_END);
		
		
		
		
		//adds buttons to buttons panel   // working on better positioning	
		this.buttonsPanel.add(party.getPanel(),BorderLayout.WEST); /////////
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
		this.location = new JTextArea("Current Location: "+ party.getCharLocationString(),1,30);
		//location.setBackground(Color.lightGray);//trying to remove background color
		this.locationPanel.add(location,BorderLayout.NORTH);
		
		//adds game dialog box to its panel
		console = new JTextArea("Current Location: "+ party.getCharLocationString() +"\n",20,30); 
		this.textAreaPanel.add(console,BorderLayout.SOUTH);
		
	
		
	
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
		sleepButton.addActionListener(handler);
		searchButton.addActionListener(handler);
		attackButton.addActionListener(handler);
		runButton.addActionListener(handler);		
		screenUpdate();
		
		
		
	}
	
	private void screenUpdate(){
		party.screenUpdate();
		
		buttonCheck();
		clearConsole();
		//add any other screen updates here as needed
		
	}
	//clears game dialog
	private void clearConsole(){
		console.setText("");
		this.location.setText("Current Location: "+ party.getCharLocationString());
	}
	
	//checks button availability
	private void buttonCheck(){
		
		
		
		//if statements needed for action buttons
		searchButton.setEnabled(true);
		
		sleepButton.setEnabled(true);
		
		attackButton.setEnabled(true);
		
		runButton.setEnabled(true);
		
	}
	public static iMaze getMaze(){
		return maze;
	}	
	private class Listener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) {
		
			
			if(event.getSource() == searchButton){
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

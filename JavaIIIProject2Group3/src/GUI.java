
import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.GridBagLayout;
//import java.awt.FlowLayout;


import javax.swing.*;



public class GUI extends JFrame{
	
	private static final long serialVersionUID = -7961136662816131164L;

	static private JTextArea console;
	private JTextArea location; // may remove this display later
	private JPanel textAreaPanel;
	private JPanel locationPanel;
	private JPanel buttonsPanel; //

	
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
		this.buttonsPanel.add(party.getMovementPanel(),BorderLayout.WEST); /////////
		
		this.buttonsPanel.add(party.getActionPanel(),BorderLayout.EAST); //////////

		
		
		
		//adds location text field to its panel   // may remove this panel before release
		this.location = new JTextArea("Current Location: "+ party.getCharLocationString(),1,30);
		//location.setBackground(Color.lightGray);//trying to remove background color
		this.locationPanel.add(location,BorderLayout.NORTH);
		
		//adds game dialog box to its panel
		console = new JTextArea("",20,30); 
		this.textAreaPanel.add(console,BorderLayout.SOUTH);
		
	}
	static public void appendConsole(String string){
		console.append(string);
	}
	static public  void setConsole(String string){
		console.setText(string);
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
		
		
		
		
	}
	public static iMaze getMaze(){
		return maze;
	}	
	
	
	

}

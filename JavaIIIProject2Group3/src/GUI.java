
import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.GridBagLayout;
//import java.awt.FlowLayout;


import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;



public class GUI extends JFrame{
	
	private static final long serialVersionUID = -7961136662816131164L;

	
	private JTextArea location; // may remove this display later
	private JPanel textAreaPanel;
	private JPanel locationPanel;
	private JPanel buttonsPanel; //

	static private JTextArea console;
	static private  iMaze maze ;
	//private static maze = new Maze("10x10.maze");
	private Party party;
	
	
			
	

	public GUI(){
		super ("Group 3's awesome adventure game");
		maze  = new Maze();
		
		//To be removed when rob is done with start page.
		PlayerCharacterFactory factory = new PlayerCharacterFactory();
		iCharacter[] character = new Character[6];
		for(int i=0;i< character.length ;i++){
			character[i]= factory.createCharacter(" New PLayer "+ i," Demo");
		}
		
		party = new Party(character);
		
		//adding character party panel
		add(party.getPartyPanel(),BorderLayout.WEST);
		
		//adding npc party panel
		add(maze.getRoom(party.getLocation().getLocation()).getNpcs().getPartyPanel(),BorderLayout.EAST);
		
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
		
		//add sound
		try {
			music();
		} catch (Exception e) {
			;
		}
		
	}
	static public void appendConsole(String string){
		console.append(string);
	}
	static public  void setConsole(String string){
		console.setText(string);
	}
	
	private void screenUpdate(){
		try {party.screenUpdate();
		}
		catch(Exception e){}
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
	
	static void music() throws Exception{
		URL url = new URL(
	            "http://cd.textfiles.com/10000soundssongs/WAV/0010101.WAV");
	        Clip clip = AudioSystem.getClip();
	        // getAudioInputStream() also accepts a File or InputStream
	        AudioInputStream ais = AudioSystem.
	            getAudioInputStream( url );
	        clip.open(ais);
	        clip.start();
	        //clip.loop(Clip.LOOP_CONTINUOUSLY);
	       /* SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                // A GUI element to prevent the Clip's daemon Thread
	                // from terminating at the end of the main()
	                JOptionPane.showMessageDialog(null, "Close to exit!");
	            }
	        });*/
	}
		
	

}

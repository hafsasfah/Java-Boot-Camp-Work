
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;



public class GUI extends JFrame{
	
	private static final long serialVersionUID = -7961136662816131164L;
	private JButton upButton;
	private JButton downButton;
	private JButton leftButton;
	private JButton rightButton;
	private JTextArea console;
	private iMaze maze;
	private iCharacter player;
	
	
	public GUI(){
		super ("Group 3's awesome adventure game");
		setLayout(new FlowLayout());
		maze = new Maze();
		player = new Character();
		
		
		console = new JTextArea("Current Location: "+ player.getCharLocationString() +"\n",20,30); 
		add(console);
		upButton = new JButton("North");
		add(upButton);
		downButton = new JButton("South");
		add(downButton);
		leftButton = new JButton("West");
		add(leftButton);
		rightButton = new JButton("East");
		add(rightButton);
		
		Listener handler = new Listener();
		upButton.addActionListener(handler);
		downButton.addActionListener(handler);
		leftButton.addActionListener(handler);
		rightButton.addActionListener(handler);
		screenUpdate();
		
		
		
	}
	private void screenUpdate(){
		buttonCheck();
		//add any other screen updates here as needed
	}
	private void buttonCheck(){
		int[] playerLocation = player.getCharLocation();
		if(!(maze.existsUp(playerLocation))){
			upButton.setEnabled(false);
		}
		else upButton.setEnabled(true);
		if(!(maze.existsDown(playerLocation))){
			downButton.setEnabled(false);
		}else downButton.setEnabled(true);
		if(!(maze.existsLeft(playerLocation))){
			leftButton.setEnabled(false);
		}else leftButton.setEnabled(true);
		if(!(maze.existsRight(playerLocation))){
			rightButton.setEnabled(false);
		}else rightButton.setEnabled(true);
	}
	private class Listener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) {
			
			
			
			if(event.getSource() == upButton){
				//System.out.println("Up");
				
				player.generateMvmtUp();
				buttonCheck();
				console.append("North Current Location: "+ player.getCharLocationString() +"\n");
				
			}	
			else if(event.getSource() == downButton){
				//System.out.println("Down");
				
				player.generateMvmtDown();
				buttonCheck();
				console.append("South Current Location: "+ player.getCharLocationString() +"\n");
			}
			else if(event.getSource() == leftButton){
				//System.out.println("Left");
			
				player.generateMvmtLeft();
				buttonCheck();
				console.append("West Current Location: "+ player.getCharLocationString() +"\n");
			}
			else if(event.getSource() == rightButton){
				//System.out.println("Right");
			
				player.generateMvmtRight();
				buttonCheck();
				console.append("East Current Location: "+ player.getCharLocationString() +"\n");
			}
		}
		
	}
	
	

}


import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;



public class GUI extends JFrame{
	private JButton upButton;
	private JButton downButton;
	private JButton leftButton;
	private JButton rightButton;
	private JTextField console;
	private iMaze maze;
	private iCharacter player;
	
	
	public GUI(){
		super ("Group 3's awesome adventure game");
		setLayout(new FlowLayout());
		maze = new Maze();
		player = new Character();
		
		
		
		upButton = new JButton("UP");
		add(upButton);
		downButton = new JButton("Down");
		add(downButton);
		leftButton = new JButton("Left");
		add(leftButton);
		rightButton = new JButton("Right");
		add(rightButton);
		
		Listener handler = new Listener();
		upButton.addActionListener(handler);
		downButton.addActionListener(handler);
		leftButton.addActionListener(handler);
		rightButton.addActionListener(handler);
		buttonCheck();
		
		
		
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
			
			String string ="";
			
			if(event.getSource() == upButton){
				System.out.println("Up");
				player.generateMvmtUp();
				buttonCheck();
				
			}	
			else if(event.getSource() == downButton){
				System.out.println("Down");
				player.generateMvmtDown();
				buttonCheck();
			}
			else if(event.getSource() == leftButton){
				System.out.println("Left");
				player.generateMvmtLeft();
				buttonCheck();
			}
			else if(event.getSource() == rightButton){
				System.out.println("Right");
				player.generateMvmtRight();
				buttonCheck();
			}
		}
		
	}
	
	

}

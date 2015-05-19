import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;




public class Party {
	private Location location;
	Character[] characters;
	
	
	
	// GUI fields
	private JButton northButton;	//
	private JButton downButton;		//
	private JButton leftButton;		//
	private JButton rightButton; //
	private JPanel movementButtonsPanel; 
	
	public Party(){
		location= new Location();
		
		// Create MovementButtons  Panel
		this.movementButtonsPanel = new JPanel();							
		this.movementButtonsPanel.setLayout(new BorderLayout());		
		
		
		
		//Adds movement buttons to panel
		northButton = new JButton("North");
		this.movementButtonsPanel.add(northButton,BorderLayout.PAGE_START);
		downButton = new JButton("South");
		this.movementButtonsPanel.add(downButton,BorderLayout.PAGE_END);
		leftButton = new JButton("West");
		this.movementButtonsPanel.add(leftButton,BorderLayout.LINE_START);
		rightButton = new JButton("East");
		this.movementButtonsPanel.add(rightButton,BorderLayout.LINE_END);
		
		//Event handling for movement buttons
		Listener handler = new Listener();
		northButton.addActionListener(handler);
		downButton.addActionListener(handler);
		leftButton.addActionListener(handler);
		rightButton.addActionListener(handler);
		
		
	}
	
	
	public String getCharLocationString() {
		return location.toString();
	}
	
	
	public void generateMvmtUp() {
		 this.location.moveUp();
	}
	
	
	public void generateMvmtDown() {
		 this.location.moveDown();
	}
	
	
	public void generateMvmtLeft() {
		 this.location.moveLeft();
	}
	
	
	public void generateMvmtRight() {
		 this.location.moveRight();
	}
	public void screenUpdate(){
		buttonCheck();
		//clearConsole();
	
	
	}
	public JPanel getPanel(){
		return movementButtonsPanel;
	}
	
	private void buttonCheck(){
		int[] playerLocation = location.getLocation();
		if(!(GUI.getMaze().existsUp(playerLocation))){
			northButton.setEnabled(false);
		}
		else northButton.setEnabled(true);
		if(!(GUI.getMaze().existsDown(playerLocation))){
			downButton.setEnabled(false);
		}else downButton.setEnabled(true);
		if(!(GUI.getMaze().existsLeft(playerLocation))){
			leftButton.setEnabled(false);
		}else leftButton.setEnabled(true);
		if(!(GUI.getMaze().existsRight(playerLocation))){
			rightButton.setEnabled(false);
		}else rightButton.setEnabled(true);
		
	
		
	}
	
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent event) {
		
		
		
			if(event.getSource() == northButton){
				generateMvmtUp();
				screenUpdate();
				GUI.console.append("North \n");
				
			}	
			else if(event.getSource() == downButton){
				generateMvmtDown();
				screenUpdate();
				GUI.console.append("South \n");
			}
			else if(event.getSource() == leftButton){
				generateMvmtLeft();
				screenUpdate();
				GUI.console.append("West \n");
			}
			else if(event.getSource() == rightButton){
				generateMvmtRight();
				screenUpdate();
				GUI.console.append("East\n");
			}
		}
	}
	
	
	

}

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;




public class Party {
	private Location location;
	Character[] characters;
	// GUI fields
		//subPanels
		private JPanel movementButtonsPanel; 
		private JPanel actionsButtonsPanel; 
			//sub action button panels
			private JPanel actionstopButtonsPanel;
			private JPanel actionsbottomButtonsPanel;
				//actionButtons
				private JButton searchButton;
				private JButton sleepButton;
				private JButton attackButton;
				private JButton runButton;
			//movementButtons
			private JButton northButton;
			private JButton downButton;	
			private JButton leftButton;	
			private JButton rightButton; 
	
	public Party(){
		location= new Location();
		generateGUI();
		//Creating main button panel
		
		// Create MovementButtons  Panel
		this.movementButtonsPanel = new JPanel();							
		this.movementButtonsPanel.setLayout(new BorderLayout());
		
		//Create Action panels and sub panels
		this.actionsButtonsPanel = new JPanel();
		this.actionsButtonsPanel.setLayout(new BorderLayout());
		actionstopButtonsPanel = new JPanel();
		actionstopButtonsPanel.setLayout(new BorderLayout());
		this.actionsButtonsPanel.add(actionstopButtonsPanel,BorderLayout.NORTH);
		actionsbottomButtonsPanel = new JPanel();
		actionsbottomButtonsPanel.setLayout(new BorderLayout());
		this.actionsButtonsPanel.add(actionsbottomButtonsPanel,BorderLayout.SOUTH);
		
			//Action buttons added to button panel
			searchButton = new JButton("Search ");
			this.actionstopButtonsPanel.add(searchButton,BorderLayout.WEST);
			sleepButton = new JButton(" Sleep");
			this.actionstopButtonsPanel.add(sleepButton,BorderLayout.EAST);
			attackButton = new JButton("Attack");
			this.actionsbottomButtonsPanel.add(attackButton,BorderLayout.EAST);
			runButton = new JButton("    Run   ");
			this.actionsbottomButtonsPanel.add(runButton,BorderLayout.WEST);	
			
			//Adds movement buttons to panel
			northButton = new JButton("North");
			this.movementButtonsPanel.add(northButton,BorderLayout.PAGE_START);
			downButton = new JButton("South");
			this.movementButtonsPanel.add(downButton,BorderLayout.PAGE_END);
			leftButton = new JButton("West");
			this.movementButtonsPanel.add(leftButton,BorderLayout.LINE_START);
			rightButton = new JButton("East");
			this.movementButtonsPanel.add(rightButton,BorderLayout.LINE_END);
			
		//Event handling for buttons
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
	
	
	
	private void generateGUI() {
		//Creating main button panel
		
				// Create MovementButtons  Panel
				this.movementButtonsPanel = new JPanel();							
				this.movementButtonsPanel.setLayout(new BorderLayout());
				
				//Create Action panels and sub panels
				this.actionsButtonsPanel = new JPanel();
				this.actionsButtonsPanel.setLayout(new BorderLayout());
				actionstopButtonsPanel = new JPanel();
				actionstopButtonsPanel.setLayout(new BorderLayout());
				this.actionsButtonsPanel.add(actionstopButtonsPanel,BorderLayout.NORTH);
				actionsbottomButtonsPanel = new JPanel();
				actionsbottomButtonsPanel.setLayout(new BorderLayout());
				this.actionsButtonsPanel.add(actionsbottomButtonsPanel,BorderLayout.SOUTH);
				
					//Action buttons added to button panel
					searchButton = new JButton("Search ");
					this.actionstopButtonsPanel.add(searchButton,BorderLayout.WEST);
					sleepButton = new JButton(" Sleep");
					this.actionstopButtonsPanel.add(sleepButton,BorderLayout.EAST);
					attackButton = new JButton("Attack");
					this.actionsbottomButtonsPanel.add(attackButton,BorderLayout.EAST);
					runButton = new JButton("    Run   ");
					this.actionsbottomButtonsPanel.add(runButton,BorderLayout.WEST);	
					
					//Adds movement buttons to panel
					northButton = new JButton("North");
					this.movementButtonsPanel.add(northButton,BorderLayout.PAGE_START);
					downButton = new JButton("South");
					this.movementButtonsPanel.add(downButton,BorderLayout.PAGE_END);
					leftButton = new JButton("West");
					this.movementButtonsPanel.add(leftButton,BorderLayout.LINE_START);
					rightButton = new JButton("East");
					this.movementButtonsPanel.add(rightButton,BorderLayout.LINE_END);
					
				//Event handling for buttons
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



	public String getCharLocationString() {
		return location.toString();
	}

	public void screenUpdate(){
		buttonCheck();
		//clearConsole();
	}
	
	public JPanel getActionPanel(){
		return this.actionsButtonsPanel;
	}
	
	public JPanel getMovementPanel(){
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
		

		//if statements needed for action buttons
		searchButton.setEnabled(true);
		
		sleepButton.setEnabled(true);
		
		attackButton.setEnabled(true);
		
		runButton.setEnabled(true);
		
	
		
	}
	
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent event) {
		
		
		
			if(event.getSource() == northButton){
				location.moveUp();
				screenUpdate();
				GUI.appendConsole("North \n");
				
			}	
			else if(event.getSource() == downButton){
				location.moveDown();
				screenUpdate();
				GUI.appendConsole("South \n");
			}
			else if(event.getSource() == leftButton){
				location.moveLeft();
				screenUpdate();
				GUI.appendConsole("West \n");
			}
			else if(event.getSource() == rightButton){
				location.moveRight();
				screenUpdate();
				GUI.appendConsole("East\n");
			}
			
			else if(event.getSource() == searchButton){
				buttonCheck();
				GUI.appendConsole("The Room is empty.....oh so very Empty\n");
									
				}	
			else if(event.getSource() == sleepButton){
				buttonCheck();
				GUI.appendConsole("You had a siesta, feel better?\n");
			}
			else if(event.getSource() == attackButton){
				buttonCheck();
				GUI.appendConsole("You attacked.........................a wall. "
						+ "\nIf you had a weapon you probably just dented it\n"
						+ "Good job ace. Real smooth\n");
			}
			else if(event.getSource() == runButton){
				buttonCheck();
				GUI.appendConsole("Running from shadows? Some adventurer you are.\n");
			}
		}
	}
	
	
	

}

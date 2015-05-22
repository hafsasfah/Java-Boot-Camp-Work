import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Party {
	// private PlayerCharacterFactory playerFactory ;
	private Location location;
	private iCharacter[] characters = new Character[6];

	// GUI fields
	private JPanel partyPanel;
	// subPanels
	private JPanel movementButtonsPanel;
	private JPanel actionsButtonsPanel;
	// sub action button panels
	private JPanel actionstopButtonsPanel;
	private JPanel actionsbottomButtonsPanel;
	// actionButtons
	private JButton searchButton;
	private JButton sleepButton;
	private JButton attackButton;
	private JButton runButton;
	private JButton suicideButton;
	// movementButtons
	private JButton northButton;
	private JButton downButton;
	private JButton leftButton;
	private JButton rightButton;

	public Party(iCharacter[] characters) {
		location = new Location();

		this.characters = characters;
		generateGUI();

	}

	public iCharacter[] getCharacter() {
		return characters;
	}

	public void setCharacter(iCharacter[] update) {
		characters = update;
	}

	private void generateGUI() {
		// Creating party panel
		partyPanel = new JPanel();
		partyPanel.setLayout(new BoxLayout(partyPanel, BoxLayout.Y_AXIS));
		
		for (iCharacter c : characters) {
			partyPanel.add(c.getPanel());
			partyPanel.repaint();
		}

		// Create MovementButtons Panel
		this.movementButtonsPanel = new JPanel();
		this.movementButtonsPanel.setLayout(new BorderLayout());

		// Create Action panels and sub panels
		this.actionsButtonsPanel = new JPanel();
		this.actionsButtonsPanel.setLayout(new BorderLayout());
		actionstopButtonsPanel = new JPanel();
		actionstopButtonsPanel.setLayout(new BorderLayout());
		this.actionsButtonsPanel
				.add(actionstopButtonsPanel, BorderLayout.NORTH);
		actionsbottomButtonsPanel = new JPanel();
		actionsbottomButtonsPanel.setLayout(new BorderLayout());
		this.actionsButtonsPanel.add(actionsbottomButtonsPanel,
				BorderLayout.SOUTH);

		// Action buttons added to button panel
		searchButton = new JButton("Search ");
		this.actionstopButtonsPanel.add(searchButton, BorderLayout.WEST);
		sleepButton = new JButton(" Sleep");
		this.actionstopButtonsPanel.add(sleepButton, BorderLayout.EAST);
		attackButton = new JButton("Attack");
		this.actionsbottomButtonsPanel.add(attackButton, BorderLayout.EAST);
		runButton = new JButton("    Run   ");
		this.actionsbottomButtonsPanel.add(runButton, BorderLayout.WEST);
		suicideButton = new JButton(" Hara Kiri ");
		this.actionstopButtonsPanel.add(suicideButton, BorderLayout.SOUTH);

		// Adds movement buttons to panel
		northButton = new JButton("North");
		this.movementButtonsPanel.add(northButton, BorderLayout.PAGE_START);
		downButton = new JButton("South");
		this.movementButtonsPanel.add(downButton, BorderLayout.PAGE_END);
		leftButton = new JButton("West");
		this.movementButtonsPanel.add(leftButton, BorderLayout.LINE_START);
		rightButton = new JButton("East");
		this.movementButtonsPanel.add(rightButton, BorderLayout.LINE_END);

		// Event handling for buttons
		Listener handler = new Listener();
		northButton.addActionListener(handler);
		downButton.addActionListener(handler);
		leftButton.addActionListener(handler);
		rightButton.addActionListener(handler);
		sleepButton.addActionListener(handler);
		searchButton.addActionListener(handler);
		attackButton.addActionListener(handler);
		runButton.addActionListener(handler);
		suicideButton.addActionListener(handler);
		try {
			screenUpdate();
		} catch (Exception e) {}

	}

	public String getCharLocationString() {
		return location.toString();
	}

	public void screenUpdate()  {
		buttonCheck();
		GUI.location.setText("Current Location: "+ getCharLocationString());
		//clearConsole();
	}

	public JPanel getPartyPanel() {
		return partyPanel;
	}

	public JPanel getActionPanel() {
		return this.actionsButtonsPanel;
	}

	public JPanel getMovementPanel() {
		return movementButtonsPanel;
	}

	private void buttonCheck() {
		int[] playerLocation = location.getLocation();
		if (!(GUI.getMaze().canGoNorth(playerLocation))) {
			northButton.setEnabled(false);
		} else
			northButton.setEnabled(true);
		if (!(GUI.getMaze().canGoSouth(playerLocation))) {
			downButton.setEnabled(false);
		} else
			downButton.setEnabled(true);
		if (!(GUI.getMaze().canGoWest(playerLocation))) {
			leftButton.setEnabled(false);
		} else
			leftButton.setEnabled(true);
		if (!(GUI.getMaze().canGoEast(playerLocation))) {
			rightButton.setEnabled(false);
		} else
			rightButton.setEnabled(true);

		// if statements needed for action buttons
		searchButton.setEnabled(true);

		sleepButton.setEnabled(true);

		attackButton.setEnabled(true);

		runButton.setEnabled(true);

		suicideButton.setEnabled(true);
		
		
		updateAllPanels();

	}

	public void updateAllPanels() {
		for (iCharacter c : characters) {
			c.panelUpdate();
		}
		for (iCharacter c : GUI.getMaze().getRoom(location.getLocation())
				.getParty().getCharacter()) {
			c.panelUpdate();
		}
	}

	public Party getParty() {
		return this;
	}

	private class Listener implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == northButton) {
				location.moveUp();
				
					screenUpdate();
		
				GUI.setConsole("North \n");

			} else if (event.getSource() == downButton) {
				location.moveDown();
				
					screenUpdate();
				
				GUI.setConsole("South \n");
			} else if (event.getSource() == leftButton) {
				location.moveLeft();
				
					screenUpdate();
				
				GUI.setConsole("West \n");
			} else if (event.getSource() == rightButton) {
				location.moveRight();
				updateAllPanels();
				
					screenUpdate();
				
				GUI.setConsole("East\n");
			}

			else if (event.getSource() == searchButton) {
				try {
					buttonCheck();
				} catch (Exception e) {}
				GUI.appendConsole("The Room is empty.....oh so very Empty\n");
				// add function here
			} else if (event.getSource() == sleepButton) {
				try {
					buttonCheck();
					sleepMusic();
				} catch (Exception e) {}
				// Action.sleep(characters.getHitPoints());
				GUI.appendConsole("You had a siesta, feel better?\n");
			} else if (event.getSource() == attackButton) {
				
					Action.attack(getParty(),
							GUI.getMaze().getRoom(location.getLocation())
									.getParty());
					buttonCheck();
					updateAllPanels();
			
				try {
					battleMusic();
					battleMusic2();
				} catch (Exception e) {}
				

				
				// GUI.appendConsole("You attacked.........................a wall. "
				// + "\nIf you had a weapon you probably just dented it\n"
				// + "Good job ace. Real smooth\n");
			} else if (event.getSource() == runButton) {
				try {
					buttonCheck();
					runMusic();
				} catch (Exception e) {}
				// Action.run(characters.getHitPoints());
				GUI.appendConsole("Running from shadows? Some adventurer you are.\n");
			} else if (event.getSource() == suicideButton) {
				try {
					buttonCheck();
					suicideMusic();
				} catch (Exception e) {}
				Action.haraKiri();
				System.exit(0);
			}
		}
	}

	public Location getLocation() {
		return location;
	}

	static void battleMusic() throws Exception {
		URL url = new URL(
				"http://themushroomkingdom.net/sounds/wav/mk64/mk64_announcer04-jp.wav");
		Clip clip = AudioSystem.getClip();
		AudioInputStream ais = AudioSystem.getAudioInputStream(url);
		clip.open(ais);
		clip.start();
	}
	
	static void battleMusic2() throws Exception {
		URL url2 = new URL(
				"http://themushroomkingdom.net/sounds/wav/mk64/mk64_wario05-jp.wav");
		Clip clip = AudioSystem.getClip();
		AudioInputStream ais2 = AudioSystem.getAudioInputStream(url2);
		clip.open(ais2);
		clip.start();
	}
	
	static void suicideMusic() throws Exception {
		URL url = new URL(
				"http://themushroomkingdom.net/sounds/wav/mk64/mk64_peach05.wav");
		Clip clip = AudioSystem.getClip();
		AudioInputStream ais = AudioSystem.getAudioInputStream(url);
		clip.open(ais);
		clip.start();
	}

	static void sleepMusic() throws Exception {
		URL url = new URL(
				"http://themushroomkingdom.net/sounds/wav/sm64/sm64_mario_tired.wav");
		Clip clip = AudioSystem.getClip();
		AudioInputStream ais = AudioSystem.getAudioInputStream(url);
		clip.open(ais);
		clip.start();
	}
	
	static void runMusic() throws Exception {
		URL url = new URL(
				"http://themushroomkingdom.net/sounds/wav/sm64/sm64_mario_here_we_go.wav");
		Clip clip = AudioSystem.getClip();
		AudioInputStream ais = AudioSystem.getAudioInputStream(url);
		clip.open(ais);
		clip.start();
	}

}

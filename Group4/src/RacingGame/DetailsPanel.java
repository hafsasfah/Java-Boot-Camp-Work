package RacingGame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;


public class DetailsPanel extends JPanel  {
private String player1name;
private String player2name;
public double testBet;
private int testPlay1bank = 100;
private int testPlay2bank= 100;
private JLabel label;
private ImageIcon image;




public DetailsPanel() 
{
	Dimension size = getPreferredSize();
	size.width = 500;
	setPreferredSize(size);
	
	this.player1name = JOptionPane.showInputDialog("Player 1 please enter your name.");
	this.player2name = JOptionPane.showInputDialog("Player 2 please enter your name.");
	
	//setLayout(new FlowLayout());
	//image = new ImageIcon (getClass().getResource("racecargame.png"));
	//label = new JLabel (image);
	//add(label);
	//NEED A LIL EXTRA WORK ON BET
	setBorder(BorderFactory.createTitledBorder("Place your bet"));
	
	JLabel player1Label = new JLabel(this.player1name);
	JLabel player2Label = new JLabel(this.player2name);
	JLabel  player1BankLabel = new JLabel(this.player1name + " Bank: ");
	JLabel  player2BankLabel = new JLabel(this.player2name + " Bank: ");
	JLabel player1CarLabel = new JLabel(this.player1name+ "'s" + " Car: ");
	JLabel player2CarLabel = new JLabel(this.player2name+"'s" + " Car: ");
	
	
	JTextField bothPlayerWageField = new JTextField(10);
	String bothPlayersBetInput = bothPlayerWageField.getText();
	JLabel placeBetLabel = new JLabel("How much do you want to bet?");
	JButton betBtn = new JButton("PLACE BET");
	betBtn.addActionListener(new ActionListener()
	{
		public double testBet;

		public void actionPerformed(ActionEvent e) 
		{
			String bothPlayersBetInput = bothPlayerWageField.getText();
			this.testBet = Double.parseDouble(bothPlayersBetInput);
			
			return;
		}
		
	});
	
	JLabel player1wagesField = new JLabel(""+testPlay1bank); // later add int wages
	JLabel player2wagesField = new JLabel(""+testPlay2bank); // same
	
	JButton addBtn = new JButton("RACE");
	addBtn.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			Random r = new Random();
			
			int ply1RandomNumber = r.nextInt(10); 
			int ply2RandomNumber = r.nextInt(10);
			
			if (ply1RandomNumber > ply2RandomNumber)
			{
				
				JOptionPane.showMessageDialog(null, "Player 1: " + ply1RandomNumber + "\nPlayer 2: "
					+ ply2RandomNumber + "\nPlayer 1 is the WINNER!"	, "Title", JOptionPane.INFORMATION_MESSAGE);
			}
			if (ply1RandomNumber < ply2RandomNumber){
				
				JOptionPane.showMessageDialog(null, "Player 1: " + ply1RandomNumber + "\nPlayer 2: "
						+ ply2RandomNumber + "\nPlayer 2 is the WINNER!"	, "Title", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			
			
		}
			
	});
	
	// ADDING A PIC TEST //
	
	//BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\F01000154.CORP-9BM7KX1\\Pictures"));
	//JLabel picLabel = new JLabel(new ImageIcon(myPicture));
	//add(picLabel);
	
	
	
	// GO BACK AND RENAME - PLAYER 1 CAR SELECTION
	String[] carStrings = {"Honda","BMW","Ford"};
	JComboBox cmbCarsList = new JComboBox(carStrings);
	JLabel lblText = new JLabel();
	
	cmbCarsList.setSelectedIndex(1); // player 1 starts with 2nd car
	cmbCarsList.addActionListener(cmbCarsList);
	add(cmbCarsList);
	//add(lblText);
	
	// GO BACK AND RENAME - PLAYER 2 CAR SELECTION
	String[] carStrings1 = {"Honda","BMW","Ford"};
	JComboBox cmbCarsList1 = new JComboBox(carStrings1);
	JLabel lblText1 = new JLabel();
	
	cmbCarsList1.setSelectedIndex(2); // player 2 starts with 3rd car
	cmbCarsList1.addActionListener(cmbCarsList1);
	add(cmbCarsList1);
	//add(lblText1);
	
	// race button
	
	
	setLayout(new GridBagLayout());
	
	GridBagConstraints gc = new GridBagConstraints();  
	
	
	gc.weightx = 0.25;
	gc.weighty = 0.5;
	gc.anchor = GridBagConstraints.LINE_START;
	
	// First column //
	
	gc.gridx = 0;
	gc.gridy = 0;
	add(player1BankLabel, gc);
	
	gc.gridx = 0;
	gc.gridy = 1;
	add(player1Label, gc);
	
	gc.gridx = 1;
	gc.gridy = 0;
	add(player1wagesField, gc);
	
	gc.gridx = 1;
	gc.gridy = 1;
	
	
	// second player column //
	
	gc.gridx = 0;
	gc.gridy = 2;
	add(player2BankLabel, gc);
	
	gc.gridx = 0;
	gc.gridy = 3;
	add(player2Label, gc);
	
	gc.gridx = 1;
	gc.gridy = 2;
	add(player2wagesField, gc);
	

	
	//run column //
		
		gc.weighty = 10;
		gc.anchor = GridBagConstraints.LAST_LINE_START;
		gc.gridx = 0;
		gc.gridy = 7;
		add(addBtn, gc);
	
	// pick your car column //	
		
		gc.gridx = 1;
		gc.gridy = 4;
		add(cmbCarsList1, gc);
	
		gc.gridx = 0;
		gc.gridy = 4;
		add(player1CarLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 5;
		add(cmbCarsList, gc);
	
		gc.gridx = 0;
		gc.gridy = 5;
		add(player2CarLabel, gc);
		
		// BET COLUMN
		
		gc.gridx = 0;
		gc.gridy = 6;
		add(betBtn, gc);
		
		gc.gridx = 1;
		gc.gridy = 6;
		add(bothPlayerWageField, gc);
	
	
	
	
	
	
	
	
	
	
}



	
}

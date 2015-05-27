package view;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.Dice;
import controller.Controller;

public class GameboardView {
	JButton endTurn;
	JButton rollDice;
	JButton buy;
	JTextArea console;
	
	
	JPanel buttonsPanel;
	
	public GameboardView(){
		
		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));
		//buttonsPanel.setLayout(new BorderLayout());
		endTurn= new JButton("End Turn");
		buttonsPanel.add(endTurn);
		rollDice = new JButton("Roll Dice");
		buttonsPanel.add(rollDice);
		buy = new JButton("    BUY!    ");
		buttonsPanel.add(buy);
		console = new JTextArea();
		buttonsPanel.add(console);
		console.setText("This is a console\n\n\n\nAnother line");
		
		
		
		Listener handler = new Listener();
		endTurn.addActionListener(handler);
		endTurn.setEnabled(false);
		rollDice.addActionListener(handler);
		buy.addActionListener(handler);
	
		
		
		
		
	}
	public JPanel getPanel(){
		return buttonsPanel;
	}
	public void buttonCheck(){
		if (Controller.getCurrentProp().getOwner()>=0) {
			buy.setEnabled(false);
		}
		else
			buy.setEnabled(true);
		
		
	}

	
private class Listener implements ActionListener {

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == endTurn) {
			Controller.endTurn();
			endTurn.setEnabled(false);
			rollDice.setEnabled(true);
			buttonCheck();
		} 
		else if (event.getSource() == rollDice) {
			Controller.playerRoll();
			endTurn.setEnabled(true);
			rollDice.setEnabled(false);
		} 
		else if (event.getSource() == buy) {
			Dice.rollDie();
			buy.setEnabled(false);
		}
	
	}
}
}
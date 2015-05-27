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
		//buttonsPanel.setLayout(new BorderLayout());
		endTurn= new JButton("End Turn");
		buttonsPanel.add(endTurn);
		rollDice = new JButton("Roll Dice");
		buttonsPanel.add(rollDice);
		buy = new JButton("BUY!");
		buttonsPanel.add(buy);
		console = new JTextArea();
		buttonsPanel.add(console);
		console.setText("This is a console\n\n\n\nAnother line");
		
		
		
		Listener handler = new Listener();
		endTurn.addActionListener(handler);
		rollDice.addActionListener(handler);
		buy.addActionListener(handler);
	
		
		
		
		
	}
	public JPanel getPanel(){
		return buttonsPanel;
	}

	
private class Listener implements ActionListener {

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == endTurn) {
			Controller.endTurn();
		} 
		else if (event.getSource() == rollDice) {
			Controller.playerRoll();
		} 
		else if (event.getSource() == buy) {
			Dice.rollDie();
		}
	
	}
}
}
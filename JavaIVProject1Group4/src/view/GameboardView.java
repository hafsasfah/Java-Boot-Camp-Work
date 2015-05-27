package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import controller.Controller;

public class GameboardView implements Observer{
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
		buy.setEnabled(false);
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
			buy.setEnabled(false);
			
		} 
		else if (event.getSource() == rollDice) {
			Controller.playerRoll();
			endTurn.setEnabled(true);
			rollDice.setEnabled(false);
			buttonCheck();
		} 
		else if (event.getSource() == buy) {
			Controller.buyProp();
			buy.setEnabled(false);
		}
	
	}
}


@Override
public void update(Observable arg0, Object arg1) {
	// TODO Auto-generated method stub
	
}
}
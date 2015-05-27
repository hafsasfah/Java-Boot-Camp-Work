package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.Controller;

public class GameboardView {
	JButton endTurn;
	
	
	JPanel buttonsPanel;
	public GameboardView(){
		
		buttonsPanel = new JPanel();
		endTurn= new JButton("End Turn");
		buttonsPanel.add(endTurn);
		
		
		
		Listener handler = new Listener();
		endTurn.addActionListener(handler);
	
		
		
		
		
	}
	public JPanel getPanel(){
		return buttonsPanel;
	}

	
private class Listener implements ActionListener {

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == endTurn) {
			Controller.endTurn();
	
			

		} 
	
	}
}
}
package view;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import model.Property;
import controller.Controller;

public class GameboardView implements Observer{
	JButton endTurn;
	JButton rollDice;
	JButton buy;
	JTextArea console;
	
	
	JPanel buttonsPanel;
	JPanel topPanel;
	JPanel leftPanel;
	JPanel rightPanel;
	JPanel bottomPanel;
	
	
	public GameboardView(){
		generateButtonPanel();
		generateBottomPanel();
		generateTopPanel();
		generateLeftPanel();
		generateRightPanel();
	
		
		
		
		
	}
	public void generateButtonPanel(){
		buttonsPanel = new JPanel();
		//buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));
		//buttonsPanel.setLayout(new BorderLayout());
		endTurn= new JButton("End Turn");
		buttonsPanel.add(endTurn);
		rollDice = new JButton("Roll Dice");
		buttonsPanel.add(rollDice);
		buy = new JButton("    BUY!    ");
		buttonsPanel.add(buy);
		buy.setEnabled(false);
	//	console = new JTextArea();
	//	buttonsPanel.add(console);
	//	console.setText("This is a console\n\n\n\nAnother line");
		
		
		
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
public JPanel getBottomPanel(){
	return bottomPanel;
}

private void generateBottomPanel(){
	bottomPanel = new JPanel();
	PropertyView genericPropViews;
	
	Property[] props = Controller.getProperties();
	//System.out.println(props.length);
	for(int i= 9;i>-1;i--){
		genericPropViews = new PropertyView(props[i]);		
		bottomPanel.add(genericPropViews.getPanel());	
		//System.out.println("Accessed "+ i);
		
		
	}
	
}
public JPanel getTopPanel(){
	return topPanel;
}
private void generateTopPanel(){
	topPanel = new JPanel();

	//topPanel.setLayout();
	PropertyView genericPropViews;
	
	Property[] props = Controller.getProperties();
	//System.out.println(props.length);
	for(int i= 18;i<28;i++){
		genericPropViews = new PropertyView(props[i]);		
		topPanel.add(genericPropViews.getPanel());	
		//System.out.println("Accessed "+ i);
		
		
	}
	
}
public JPanel getLeftPanel(){
	return leftPanel;
}
private void generateLeftPanel(){
	leftPanel = new JPanel();
	leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
	PropertyView genericPropViews;
	
	Property[] props = Controller.getProperties();
	//System.out.println(props.length);
	for(int i= 17;i>9;i--){
		genericPropViews = new PropertyView(props[i]);		
		leftPanel.add(genericPropViews.getPanel());	
		//System.out.println("Accessed "+ i);
		
		
	}
	
}
public JPanel getRightPanel(){
	return rightPanel;
}
private void generateRightPanel(){
	rightPanel = new JPanel();
	rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
	PropertyView genericPropViews;
	
	Property[] props = Controller.getProperties();
	//System.out.println(props.length);
	for(int i= 28;i<props.length;i++){
		genericPropViews = new PropertyView(props[i]);		
		rightPanel.add(genericPropViews.getPanel());	
		//System.out.println("Accessed "+ i);
		
		
	}
	
	
}





@Override
public void update(Observable arg0, Object arg1) {
	// TODO Auto-generated method stub
	
}
}
package views;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controllers.PlayerController;
import models.Players;



public class PlayersView implements iPlayersView 
{

	public JPanel Playerboard;
	JLabel propertyName2 = new JLabel();
	PlayerController playercontroller;
	Players player;
	
	public PlayersView(PlayerController controller)
	{
		Playerboard = new JPanel();
		this.playercontroller = controller;
		
	}
	
	public JPanel translateJframes(Players player)
	//output JPanels to the Playerboard Panel
	{
		this.player = player;
		JPanel tempframe = new JPanel();
		tempframe.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JTextArea propertyName = new JTextArea(player.getName(),10,5);
		propertyName2.setText(player.getLocationOccupied());
		propertyName.append(String.valueOf("\n" + "$" + player.getCash()));
		propertyName.setEditable(false);
		tempframe.add(propertyName);
		tempframe.add(propertyName2);
		Playerboard.add(tempframe);
				
		return Playerboard;
	
	}
	

	
	
	@Override
	public void update(Observable o, Object arg) 
	{
		this.propertyName2.setText(player.getLocationOccupied());
		
	}


		
		
}


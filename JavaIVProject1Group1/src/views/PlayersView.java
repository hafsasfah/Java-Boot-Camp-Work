package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
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
	JLabel playerCash = new JLabel();
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
		JTextArea propertyName = new JTextArea(player.getName(),5,7);
		playerCash.setText(String.valueOf("\n" + "$" + player.getCash()));
		propertyName2.setText(player.getLocationOccupied());
		tempframe.add(propertyName);
		tempframe.add(propertyName2);
		tempframe.add(playerCash);
		tempframe.setLayout(new GridLayout(3,1));
		Playerboard.add(tempframe);
				
		return Playerboard;
	
	}
	

	
	
	@Override
	public void update(Observable o, Object arg) 
	{
		this.propertyName2.setText(player.getLocationOccupied());
		this.playerCash.setText(String.valueOf("\n" + "$" + player.getCash()));
		
	}


		
		
}


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

import models.Players;



public class PlayersView implements iPlayersView 
{
	public JPanel Playerboard;
	ArrayList<Players> listofplayers;
	public PlayersView()
	{
		Playerboard = new JPanel();
		listofplayers = new ArrayList<Players>();
	}
	
	public void getPlayers()
	{
		int amountOfPlayers = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of players."));
		for(int i = 0; i < amountOfPlayers; i++)
		{
			Players player = new Players(JOptionPane.showInputDialog(null, "Enter the name of player " + String.valueOf(i + 1)),10,10,i);
			listofplayers.add(player);
		}
			
	}
	
	
	public JPanel translateJframes()
	//output JPanels to the Playerboard Panel
	{
		for(int i = 0; i < listofplayers.size(); i++)
		{
	
			JPanel tempframe = new JPanel();
			tempframe.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			JTextArea propertyName = new JTextArea(listofplayers.get(i).getName(),10,5);
			//propertyName.append(listofplayers.get(i).getName());
			propertyName.append(String.valueOf("\n" + "$" + listofplayers.get(i).getCash()));
			propertyName.append(String.valueOf("\n" + "(" + listofplayers.get(i).coord.getRow())+ ","
													+ String.valueOf(listofplayers.get(i).coord.getColumn()) + ")");
			propertyName.setEditable(false);
			tempframe.add(propertyName);
			Playerboard.add(tempframe);	
					
		}
		
		return Playerboard;
	
	}
	
	
	
	public PlayersView(Players players) {
		players.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JPanel getPlayerPanel() {
		// TODO Auto-generated method stub
		return null;
	}
		
		
}

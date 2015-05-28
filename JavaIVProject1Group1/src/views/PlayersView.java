package views;

import java.util.ArrayList;
import java.util.Observable;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import models.Players;



public class PlayersView implements iPlayersView 
{
	ArrayList<Players> listofplayers = new ArrayList<Players>();
	
	public void getPlayers()
	{
		int amountOfPlayers = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of players."));
		for(int i = 0; i < amountOfPlayers; i++)
		{
			Players player = new Players(JOptionPane.showInputDialog(null, "Enter the number of players."),0,0,i);
			listofplayers.add(player);
		}
		
		
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

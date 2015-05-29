package controllers;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import models.FakeDatabase;
import models.Players;
import views.PlayersView;
import views.iPlayersView;

public class PlayerController 
{
	
	int turn = 0;
	public ArrayList<Players> listofplayers;
	
	FakeDatabase database = new FakeDatabase();
	public PlayersView playerview;
	private Random random;
	
	public PlayerController()
	{
		listofplayers = new ArrayList<Players>();
		random = new Random();
	}
	
	public void nextTurn()
	{
		int templocation = listofplayers.get(turn).getLocation();
		int rollResult = (random.nextInt(6) + random.nextInt(6) + 2);
		if(templocation + rollResult > 40)
		{
			 templocation = templocation + rollResult - 40;
			 listofplayers.get(turn).setLocationOccupied(database.testdatabase.get(templocation).getName());
			 listofplayers.get(turn).setLocation(templocation);
			 listofplayers.get(turn).takeTurn();
		}
		else
		{
			listofplayers.get(turn).setLocationOccupied(database.testdatabase.get(templocation + rollResult).getName());
			listofplayers.get(turn).setLocation(templocation + rollResult);
			listofplayers.get(turn).takeTurn();
		}
		if(turn + 1 == listofplayers.size())
		{
			turn = 0;
		}
		else
			turn++;
		
	}
	
	public void getPlayers()
	{
		int amountOfPlayers = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of players."));
		for(int i = 0; i < amountOfPlayers; i++)
		{
			playerview = new PlayersView(this);
			Players player = new Players(JOptionPane.showInputDialog(null, "Enter the name of player " + String.valueOf(i + 1)),10,10,i,playerview);
			listofplayers.add(player);
			player.addObserver(playerview);
		}
			
	}
}

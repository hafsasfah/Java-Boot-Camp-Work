package controllers;

import java.util.Random;

import views.PlayersView;
import views.iPlayersView;

public class PlayerController 
{
	public iPlayersView playerview;
	private Random random;
	
	public PlayerController()
	{
		playerview = new PlayersView();
		playerview.getPlayers();
		random = new Random();
	}
	
	public void  nextPlayerRolls()
	{
		playerview.nextTurn(random.nextInt(6) + random.nextInt(6) + 2);
	}
	
	
}

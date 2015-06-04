import static org.junit.Assert.*;
import models.Players;

import org.junit.Before;
import org.junit.Test;

import views.PlayersView;
import controllers.PlayerController;
import controllers.PropertyController;


public class PlayerControllerTest 
{

	int turn;
	PlayerController controller;
	Players player1;
	Players player2;
	public PlayersView playerview;
	
	@Before
	public void setup()
	{
		controller = new PlayerController();
		playerview = new PlayersView(controller);
		player1 = new Players("Tester",0,0,0,playerview);
		player2 = new Players("Tester2",1,1,1,playerview);
		turn = 0;
		
		controller.listofplayers.add(player1);
		controller.listofplayers.add(player2);
	}

	@Test
	public void testControllerInsides() 
	{
		assertTrue((controller.listofplayers.isEmpty() == false));
	}
	@Test
	public void testTurn() 
	{
		controller.handleTurn();
		assertTrue(controller.turn > 0);
	}
	
	
}

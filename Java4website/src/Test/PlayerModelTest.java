package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PlayerModel.PlayerModel;

public class PlayerModelTest {

List<PlayerModel> list;
	
	PlayerModel player;
	
	@Before
	public void before()
	{
		player = new PlayerModel("Robert", 100);
		list = new ArrayList<PlayerModel>();
	}
	
	
	@Test
	public void testPlayer() 
	{
		assertNotNull(list);
	}

	@Test
	public void testIsEmpty() 
	{
		assertTrue(list.isEmpty());
	}

	@Test
	public void testAddToFront() 
	{
		list.add(player);
		assertFalse(list.isEmpty());
	}
	

}

package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PlayerModel.PlayerModel;
import PlayerRepo.PlayerRepo;

public class PlayerRepoTest {


	
	PlayerRepo playerRepository; 
	PlayerModel player;
	List<PlayerModel> list;
	List<PlayerRepo> list2;
	
	@Before
	public void before()
	{
		player = new PlayerModel("NewOne", 55);
		list = new ArrayList<PlayerModel>();
	}
	

	@Test
	public void testPlayerRepo() 
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

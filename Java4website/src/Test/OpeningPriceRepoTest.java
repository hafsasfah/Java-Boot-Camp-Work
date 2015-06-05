package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PlayerModel.PlayerModel;
import Stockrepo.OpeningPriceRepo;

public class OpeningPriceRepoTest {

	List<OpeningPriceRepo> list;
	
	OpeningPriceRepo openingPrice;
	
	
	@Before
	public void before()
	{
		openingPrice = new OpeningPriceRepo();
		list = new ArrayList<OpeningPriceRepo>();
	}
	
	
	@Test
	public void testOpeningPriceRepo() 
	{
		list.add(openingPrice);
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
		list.add(openingPrice);
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void testSize()
	{
		assertEquals(0, list.size());
		
		assertEquals(1, list.size());
	}
}

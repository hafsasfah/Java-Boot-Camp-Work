package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PlayerModel.PlayerModel;
import StockModel.OwnedStock;

public class OwnedStockTest {

	List<OwnedStock> list;
	
	OwnedStock stocksOwned;
	
	@Before
	public void before()
	{
		stocksOwned = new OwnedStock("Andrew", "MMM", 15);
		list = new ArrayList<OwnedStock>();
	}
	
	
	@Test
	public void testOwnedStock() 
	{
		list.add(stocksOwned);
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
		list.add(stocksOwned);
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void testSize()
	{
		assertEquals(0, list.size());
		
		assertEquals(1, list.size());
	}

}

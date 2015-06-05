package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PlayerModel.PlayerModel;
import StockModel.StockModel;

public class StockModelTest {

List<StockModel> list;
	
	StockModel stocks; 
	
	@Before
	public void before()
	{
		stocks = new StockModel(23.0, "Kody", "06/05/2015" );
		list = new ArrayList<StockModel>();
	}
	
	
	@Test
	public void testStockModel() 
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
		list.add(stocks);
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void testSize()
	{
		assertEquals(0, list.size());
		
		assertEquals(1, list.size());
	}

}

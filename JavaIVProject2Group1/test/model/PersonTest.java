package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testGetName() 
	{
		Person test = new Person("Mario", 0);
		
		assertEquals(test.getName(),"Mario");
		
		
	}

	@Test
	public void testGetStocks() 
	{
		Person test = new Person("Mario", 0);
		test.addStock(new Stock("Apple","APPL"),20);
		assertNotNull(test.getStocks());
	//"Apple","APPL", 5
	}

	@Test
	public void testGetPurse() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testBuyStock() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSellStock() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetTicker() 
	{
		fail("Not yet implemented");
	}


}

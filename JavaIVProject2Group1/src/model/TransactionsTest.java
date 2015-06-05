package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransactionsTest 
{

	@Test
	public void testGetBuyer()
	{
		
		Transactions test = new Transactions("Mario", 0);		
		assertEquals(test.getName(),"Mario");
	}

	@Test
	public void testGetStockPrice() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetDate() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetAmountBought() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetStock() 
	{
		fail("Not yet implemented");
	}
}

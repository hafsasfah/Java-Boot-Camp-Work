package model;

import static org.junit.Assert.*;
import model.Person;

import org.junit.Test;

public class PersonTest 
{

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
	}

	@Test
	public void testGetPurse() 
	{
		
		Person test = new Person("Mario", 100);		
		assertEquals(test.getPurse(),100,0);
	}
}

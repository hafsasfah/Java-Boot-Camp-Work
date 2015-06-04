import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;


public class PropertyFactoryTest 
{
	
	
	
	protected ArrayList<PropertyFactory>list;

	@Before
	public void before()
	{
		list = new ArrayList<PropertyFactory>();
	}
	
	
	@Test
	public void testArrayList() 
	{
		assertNotNull(list);
		assertEquals(0, list.size() );
	}
	
	
	@Test
	public void testIsFor() 
	{
		
		assertEquals(0, list.size());
		assertEquals(1, list.size());
	}
	

	@Test
	public void testGet()
	{
		String testString = "Test";
		//list.addToFront( testString );
		assertEquals( testString, list.get(0) );
	}
	
	@Test
	public void testAnotherGet()
	{
		String testString = "Test123";
		//list.addToFront( testString );
		assertEquals( testString, list.get(0) );
	}
	
	@Test
	public void testIterator()
	{
		String firstTestString = "firstString";
		String secondTestString ="secondString";
		//list.addToFront( firstTestString );
		//list.addToFront( secondTestString );
		Iterator<PropertyFactory> it = list.iterator();
		assertEquals( secondTestString, it.next() );	
		assertEquals( firstTestString, it.next() );	
	}

	
	
	
}

import static org.junit.Assert.*;


import java.util.Iterator;

import org.junit.*;

public class SinglyLinkedListTest 
{
	protected SinglyLinkedList<String> list;
	
	@Before
	public void before()
	{
		list = new SinglyLinkedList<String>();
	}
	
	@Test
	public void testSinglyLinkedList() 
	{
		assertNotNull(list);
		assertEquals(0, list.size() );
	}

	@Test
	public void testIsEmpty() 
	{
		assertTrue(list.isEmpty());
	}
	@Test
	public void testIterator(){
	String testString = "test";
	list.addToFront(testString);
	list.addToFront("Hola");
	Iterator<String> it = list.iterator();
	assertEquals(testString,it.next());
	assertEquals("Hola",it.next());
	
	}
	@Test
	public void testAddToFront() 
	{
		list.addToFront("Test");
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void testSize()
	{
		assertEquals(0, list.size());
		list.addToFront("test");
		assertEquals(1, list.size());
	}
	
	@Test
	public void testGet()
	{
		String testString = "Test";
		list.addToFront( testString );
		assertEquals( testString, list.get(0) );
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testEmptyIndexOutOfBoundsException()
	{
		list.get(0);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testNegativeIndexOutOfBoundsException()
	{
		list.get(-1);
	}
}

import static org.junit.Assert.*;
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
	public void testIndexOutOfBoundsException()
	{
		list.get(0);
	}
}

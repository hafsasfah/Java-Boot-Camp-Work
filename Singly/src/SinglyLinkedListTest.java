import static org.junit.Assert.*;
import org.junit.Test;



public class SinglyLinkedListTest {

	protected SinglyLinkedList<String> list;
	
	@Before
	public void before()
	{
		list = SinglyLinkedList<String>();
	}
	
	@Test
	public void testSinglyLinkedList() {
		assertNotNull(list);
		assertEquals(0, list.size());
	}

	@Test
	public void testIsEmpty() {
		assertTrue(list.isEmpty());
	}

	@Test
	public void testAddToFront() {
		list.addToFront("Test");
		assertEquals(list.isEmpty());
	}

	@Test
	public void testSize() {
		assertEquals(0, list.size());
		list.addToFront("test");
		assertEquals(1, list.size());
	}
	
	@Test
	public void testGet()
	{
		String testString = "Test";
		list.addToFront(testString);
		assertEquals(testString, list.get(0));
	}
	@Test
	public void testIterator()
	{
		String testString = "Test";
		String secondString = "secondTestString";
		list.addToFront(TestString);
		list.addToFront(secondTestString);
		Iterator<String> it = list.iterator();
		assertEquals(secondTestString, it.next());
		assertEquals(testString, it.next());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testEmptyIndexOutOfBoundsException()
	{
		list.get(0);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void texintNegativeIndexOutOfBoundsException()
	{
		list.get(-1);
	}

}

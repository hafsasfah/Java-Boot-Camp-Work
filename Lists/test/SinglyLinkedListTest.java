import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.*;

public class SinglyLinkedListTest {

	protected SinglyLinkedList<String> list;
	
	@Before
	public void runBeforeEachTest()
	{
		list = new SinglyLinkedList<String>();
	}

	@Test
	public void testIsEmtpy() {
		assertEquals( 0, list.size() );
	}

	@Test
	public void testAddToFront() {
		list.addToFront("Test");
		assertEquals( 1, list.size() );
		Iterator<String> iterator = list.iterator();
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

}

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class RoomTest {

	private Room room;
	private IParty mockIParty;
	private String name = "TestRoomName";
	int gold = 10;
	
	@Before
	public void setUp() throws Exception {
		mockIParty = mock(IParty.class);
		room = new Room(name, mockIParty, gold);
	}

	@Test
	public void testRoom() {
		assertNotNull( room );
	}

	@Test
	public void testGetName() {
		assertEquals( name, room.getName());
	}

	@Test
	public void testGetNPCParty() {
		assertEquals( mockIParty, room.getNPCParty() );
	}

	@Test
	public void testGetPanel() {
		assertNotNull( room.getPanel() );
	}
	
	@Test
	public void testGetGold()
	{
		assertEquals(gold, room.getGold());
	}
}

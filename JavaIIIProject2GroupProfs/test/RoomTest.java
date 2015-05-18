import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class RoomTest {

	private Room room;
	private iParty mockIParty;
	private String name = "TestRoomName";
	
	@Before
	public void setUp() throws Exception {
		mockIParty = mock(iParty.class);
		room = new Room(name, mockIParty);
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

}

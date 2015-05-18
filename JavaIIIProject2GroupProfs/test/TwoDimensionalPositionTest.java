import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TwoDimensionalPositionTest {

	private TwoDimensionalPosition position;
	private iRoom mockIRoom;
	
	@Before
	public void setUp() throws Exception {
		
		mockIRoom = mock(iRoom.class);
		position = new TwoDimensionalPosition(mockIRoom, 1, 1 );
	}
	
	@Test
	public void testTwoDimensionalPositionNullRoomConstructor()
	{
		assertNull( new TwoDimensionalPosition(1,1).getRoom() );
	}

	@Test
	public void testTwoDimensionalPositon() {
		assertNotNull( position );
	}

	@Test
	public void testGetRoom() {
		assertEquals( mockIRoom, position.getRoom() );
	}

	@Test
	public void testGetX() {
		assertEquals( 1, position.getX() );
	}

	@Test
	public void testGetY() {
		assertEquals( 1, position.getY() );
	}
	
	@Test
	public void testEquals() {
		assertEquals( new TwoDimensionalPosition(1,1), position);
	}

}

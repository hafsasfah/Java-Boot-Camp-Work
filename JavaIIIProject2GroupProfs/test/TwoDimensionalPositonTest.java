import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TwoDimensionalPositonTest {

	private TwoDimensionalPositon position;
	private iRoom mockIRoom;
	
	@Before
	public void setUp() throws Exception {
		
		mockIRoom = mock(iRoom.class);
		position = new TwoDimensionalPositon(mockIRoom, 1, 1 );
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

}

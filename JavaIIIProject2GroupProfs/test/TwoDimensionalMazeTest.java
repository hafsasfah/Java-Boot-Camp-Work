import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;


public class TwoDimensionalMazeTest {

	private TwoDimensionalMaze maze;
	private iRoomFactory mockRoomFactory;
	private iRoom mockRoom;
	
	@Before
	public void setUp() throws Exception {
		File mazeFile = new File("test/maze.txt");
		mockRoomFactory = mock(iRoomFactory.class);
		mockRoom = mock(iRoom.class);
		when(mockRoomFactory.createRoom()).thenReturn(mockRoom);
		maze = new TwoDimensionalMaze(mazeFile, mockRoomFactory);
	}
	
	@Test
	public void testTwoDimensionalMaze() {
		assertNotNull( maze );
	}

	@Test
	public void testGetStartingPosition() {
		assertEquals( maze.getStartingPosition(), new TwoDimensionalPosition(0,0) );
	}

	@Test
	public void testIterator() {
		Iterator<iPosition> iterator = maze.iterator(maze.getStartingPosition());
		assertFalse( maze.isValidPosition( iterator.next() ) );
		assertTrue( maze.isValidPosition( iterator.next() ) );
		assertTrue( maze.isValidPosition( iterator.next() ) );
		assertFalse( maze.isValidPosition( iterator.next() ) );
		assertNull( iterator.next() );
	}

	@Test
	public void testIsEndPosition() {
		assertTrue( maze.isEndPosition( new TwoDimensionalPosition(9,9) ) );
	}

	@Test
	public void testIsValidPosition() {
		iPosition mockPosition = mock(iPosition.class);
		assertFalse(maze.isValidPosition( mockPosition) );
	}

	@Test
	public void testGetPanel() {
		assertNotNull( maze.getPanel() );
	}
}

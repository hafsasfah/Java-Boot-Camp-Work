import static org.junit.Assert.*;

import java.util.Iterator;


import org.junit.*;


public class MazeTest {
	protected Maze maze ;
	@Before
	public void before()
	{
		 maze = new Maze();
	}
	
	
	@Test
	public void testExistsUp() {
		 
		int[] location = {5,5};
		assertEquals(true,maze.canGoNorth(location));
		location[1] = 0;
		assertEquals(false,maze.canGoNorth(location));
	}

	@Test
	public void testExistsDown() {
		
		
		 int[] location = {5,5};
		assertEquals(true,maze.canGoSouth(location));
		location[1] = 9;
		assertEquals(false,maze.canGoSouth(location));
	}

	@Test
	public void testExistsLeft() {
		
		int[] location = {5,5};
		assertEquals(true,maze.canGoLeft(location));
		location[0] = 0;
		assertEquals(false,maze.canGoLeft(location));
	}

	@Test
	public void testExistsRight() {
		
		int[] location = {5,5};
		assertEquals(true,maze.canGoRight(location));
		location[0] = 9;;
		assertEquals(false,maze.canGoRight(location));
	}

	@Test
	public void testGetRoom() {
		
		int[] location = {5,5};
		assertNotNull(maze.getRoom(location));
	}

}

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
		assertEquals(true,maze.existsUp(location));
		location[1] = 0;
		assertEquals(false,maze.existsUp(location));
	}

	@Test
	public void testExistsDown() {
		
		
		 int[] location = {5,5};
		assertEquals(true,maze.existsDown(location));
		location[1] = 9;
		assertEquals(false,maze.existsDown(location));
	}

	@Test
	public void testExistsLeft() {
		
		int[] location = {5,5};
		assertEquals(true,maze.existsLeft(location));
		location[0] = 0;
		assertEquals(false,maze.existsLeft(location));
	}

	@Test
	public void testExistsRight() {
		
		int[] location = {5,5};
		assertEquals(true,maze.existsRight(location));
		location[0] = 9;;
		assertEquals(false,maze.existsRight(location));
	}

	@Test
	public void testGetRoom() {
		
		int[] location = {5,5};
		assertNotNull(maze.getRoom(location));
	}

}

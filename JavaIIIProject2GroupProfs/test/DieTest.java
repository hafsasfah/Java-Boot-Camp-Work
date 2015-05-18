import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DieTest {
	
	private Die die;
	private int sides = 6;
	
	@Before
	public void setUp() throws Exception {
		die = new Die(sides);
	}
	
	@Test
	public void testDie() {
		assertNotNull( die );
	}

	@Test
	public void testGetValue() {
		int roll = die.roll();
		assertTrue( roll > 0 && roll < sides );
	}

}

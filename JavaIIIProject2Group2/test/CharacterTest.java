

import static org.junit.Assert.*;

import org.junit.Test;


public class CharacterTest {

	iCharacter testchar;
	
	@Test
	public void testStats()
	{
		assertNotNull(testchar.getHealth());
		assertNotNull(testchar.getDexterity());
		assertNotNull(testchar.getMana());
		assertNotNull(testchar.getStrength());
	}
	
	@Test
	public void testInventory()
	{
		assertEquals(testchar.getInventory(), testchar.Inventory.toString());
	}
	
	
	
	
}

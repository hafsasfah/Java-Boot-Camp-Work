

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CharacterTest {

	Player testchar;
	Player mockPlayer;
			
	@Before
	public void setup()
	{
		 testchar = new Player(30,30,30,30);
		 mockPlayer = new Player(3,3,3,100);
	}
	
	@Test
	public void testStats()
	{
		assertNotNull(testchar.getHitPoints());
		//assertNotNull(testchar.getDexterity());
		//assertNotNull(testchar.getIntelligence());
		//assertNotNull(testchar.getStrength());
	}
	
	@Test
	public void testInventory()
	{
		assertEquals(testchar.getInventory(), testchar.Inventory.toString());
	}
	
	@Test
	public void getAttack()
	{
	
		 int startingvalue = testchar.getHitPoints();
		 testchar.attack(mockPlayer);
		 assertTrue(testchar.getHitPoints() < startingvalue);
		 
		 
	
	}
	
	
	
}

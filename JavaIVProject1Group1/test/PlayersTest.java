import static org.junit.Assert.*;
import models.Players;
import models.Property;

import org.junit.BeforeClass;
import org.junit.Test;


public class PlayersTest {

	Players player = new Players("Hafsa");

	@Test
	public void getTest() {
		assertEquals(1500, player.getCash());
		assertEquals("Hafsa", player.getName());
	}

}

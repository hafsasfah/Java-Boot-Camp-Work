import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controllers.PropertyController;
import data.Coordinates;


public class PropertyControllerTest
{

	PropertyController controller;
	
	@Before
	public void setup()
	{
		controller = new PropertyController();

	}

	@Test
	public void testPanelInsides() 
	{
		assertTrue(!(controller.Gameboard.getComponents() == null));
	}
	@Test
	public void testDBInsides() 
	{
		assertTrue(!(controller.database.testdatabase.isEmpty() == true));
	}
	
	
	
}

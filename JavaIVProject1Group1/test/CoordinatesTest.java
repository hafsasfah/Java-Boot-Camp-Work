import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CoordinatesTest 
{

	Coordinates testcoords;
	Coordinates testcoords2;
			
	@Before
	public void setup()
	{
		testcoords = new Coordinates(2,2);
		testcoords2 = new Coordinates();
	}
	
	@Test
	public void testSetters()
	{
		testcoords2.setRow(2);
		assertEquals(testcoords.getRow(),testcoords2.getRow());
		
		
	}
	
}

import static org.junit.Assert.*;
import interfaces.iProperty;

import org.junit.Before;
import org.junit.Test;

import data.PanelGenerator;


public class PanelGeneratorTest 
{

	
	iProperty testproperty;
	PanelGenerator panelgenerator;
			
	@Before
	public void setup()
	{
		panelgenerator = new PanelGenerator();
	}
	
	@Test
	public void testReturnPanel()
	{
		assertNotNull(panelgenerator.CreateAPanel(testproperty));
	}
	
	
}

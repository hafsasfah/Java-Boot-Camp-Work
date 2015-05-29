import static org.junit.Assert.*;

import models.Property;

import org.junit.Before;
import org.junit.Test;

import views.PropertyView;


public class PanelGeneratorTest 
{

	
	Property testproperty;
	PropertyView panelgenerator;
			
	@Before
	public void setup()
	{
		panelgenerator = new PropertyView();
	}
	
	@Test
	public void testReturnPanel()
	{
		assertNotNull(panelgenerator.CreateAPanel(testproperty));
	}
	
	
}

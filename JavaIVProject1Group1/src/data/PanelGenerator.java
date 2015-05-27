package data;
import interfaces.iProperty;

import javax.swing.*;


public class PanelGenerator 
{
	
	public PanelGenerator(){}

	public JPanel CreateAPanel(iProperty property)
	{
		JPanel propertyPanel = new JPanel();
		JLabel propertyName = new JLabel("Test");
		propertyName.setText(property.getName());
		propertyPanel.add(propertyName);
		
		return propertyPanel;
		
		/* Take in property from database
		 * 
		 * Create a panel 
		 * 
		 * Format based on retrieved info for each property
		 * 
		 * 
		 * Send it to the GUI
		 */
	}
	
	
}

package data;


import javax.swing.*;

import models.Property;


public class PanelGenerator 
{
	
	public PanelGenerator(){}

	public JPanel CreateAPanel(Property property)
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

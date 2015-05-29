package views;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.*;

import models.FakeDatabase;
import models.Property;


public class PropertyView implements iPropertyView
{
	


	Property property;
	
	public PropertyView(){}

	public PropertyView(Property property)
	{
		

		this.property = property;
	}

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
	

	@Override
	public void update(Observable arg0, Object arg1)
	{
		
		// TODO Auto-generated method stub
		
	}
	
	
	
}

package controllers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import models.FakeDatabase;
import views.PropertyView;

public class PropertyController
{

	public JPanel Gameboard;
	public FakeDatabase database;
	public JPanel[][] propertytiles;
	
	public PropertyView propertyview;
	
	public PropertyController()
	{
		database = new FakeDatabase();
		propertytiles = new JPanel[11][11];
		Gameboard = new JPanel();
		Gameboard.setLayout(new GridLayout(11,11));
		buildBoard();
	}
	

	
	public void buildBoard() 
	/* read each property from database
	 * 
	 * create a panel for the property
	 * 
	 * add property to gameboard JFrame based on the coordinates from the database
	 * 
	 * 
	 */
	{
		PropertyView generator = new PropertyView();
		//add specified panels
		for(int x = 0; x <= database.testdatabase.size() - 1 ; x++)
		{
			JPanel tempframe = generator.CreateAPanel(database.testdatabase.get(x));
			tempframe.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			tempframe.setPreferredSize(new Dimension(640, 480));
			propertytiles[(database.testdatabase.get(x).coord.getRow())][(database.testdatabase.get(x).coord.getColumn())] = tempframe;
				
		}

	}

	
	public JPanel translateJframes()
	//output JPanels to the Gameboard Panel
	{
	for(int i = 0; i < propertytiles.length; i++)
		{
			for(int k = 0; k < propertytiles[0].length; k++)
			{
				if(!(propertytiles[i][k] == null))
				{
				propertytiles[i][k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				Gameboard.add(propertytiles[i][k]);
				}
				else
				{
					JPanel tempframe = new JPanel();
					tempframe.setPreferredSize(new Dimension(640, 480));
					Gameboard.add(tempframe);
				}
			}
				
		}
	
	return Gameboard;
			
	}
}

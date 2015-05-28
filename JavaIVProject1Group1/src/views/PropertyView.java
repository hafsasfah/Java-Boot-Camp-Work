package views;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import models.Property;


public class PropertyView 
{
	
	public JPanel[][] propertytiles;
	public JPanel Gameboard;
	
	public ArrayList<Property> testdatabase;
	
	
	public PropertyView()
	{
		propertytiles = new JPanel[11][11];
		Gameboard = new JPanel();
		Gameboard.setLayout(new GridLayout(11,11));
		fillDatabase();

		

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
		//add specified panels
		for(int x = 0; x <= testdatabase.size() - 1 ; x++)
		{
			JPanel tempframe = this.CreateAPanel(testdatabase.get(x));
			tempframe.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			tempframe.setPreferredSize(new Dimension(640, 480));
			propertytiles[(testdatabase.get(x).coord.getRow())][(testdatabase.get(x).coord.getColumn())] = tempframe;
				
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
	
	public void fillDatabase()
	{
		
		testdatabase = new ArrayList<Property>();
		
		Property GO = new Property("GO",1, 30, 60, 10, 10);
		Property MedAv = new Property("Med. Avenue",2, 30, 60, 10, 9);
		Property CommChest1 = new Property("Comm. Chest",3, 0, 0, 10, 8);
		Property BaltAve = new Property("Bal. Avenue",4, 30, 60, 10, 7);
		Property Incometax1 = new Property("Income Tax",5, 0, 0, 10, 6);
		Property ReadRail1 = new Property("RD. Railroad",6, 0, 0, 10, 5);
		Property OrAve = new Property("Or. Avenue",7, 50, 100, 10, 4);
		Property Chance1 = new Property("Chance",8, 0, 0, 10, 3);
		Property VermAve = new Property("Ver. Avenue",9, 50, 100, 10, 2);
		Property ConnAve = new Property("Conn. Avenue",10, 60, 120, 10, 1);
		Property Jail = new Property("Jail",11, 0, 0, 10, 0);
		Property CharPlace = new Property("ST. Charles",12, 75, 100, 9, 0);
		Property ElecCompany = new Property("Elec. Company",13, 0, 0, 8, 0);
		Property Statesave = new Property("St. Avenue",14, 70, 140, 7, 0);
		Property VirgAve = new Property("Virg. Avenue",15, 80, 160, 6, 0);
		Property PenRail1 = new Property("Pen. Railroad",16, 0, 0, 5, 0);
		Property JamesPlace = new Property("ST. James",17, 90, 180, 4, 0);
		Property CommChest2 = new Property("Comm. Chest",18, 0, 0, 3, 0);
		Property TenAve = new Property("Ten. Avenue",19, 90, 180, 2, 0);
		Property NYAve = new Property("NY Avenue",20, 100, 200, 1, 0);
		Property Freeparking = new Property("Free Parking",21, 0, 0, 0, 0);
		Property KenAve = new Property("Kent. Avenue",22, 110, 220, 0, 1);
		Property chance2 = new Property("Chance",23, 0, 0, 0, 2);
		Property IndAve = new Property("Ind. Avenue",24, 110, 220, 0, 3);
		Property IllAve = new Property("Ill. Avenue",25, 120, 240, 0, 4);
		Property BORail1 = new Property("B & O Rails",26, 0, 0, 0, 5);
		Property AtlAve = new Property("Atl. Avenue",27, 130, 260, 0, 6);
		Property VentorAve = new Property("Vent. Avenue",28, 130, 260, 0, 7);
		Property WaterWorks = new Property("Water Works",29, 75, 150, 0, 8);
		Property MarvinGard = new Property("Mar. Gardens",30, 140, 280, 0, 9);
		Property goJail = new Property("Go to Jail",31, 0, 0, 0, 10);
		Property PacAve = new Property("Pac. Avenue",32, 0, 0, 1, 10);
		Property NCAve = new Property("NC Avenue",33, 150, 300, 2, 10);
		Property CommChest3 = new Property("Comm. Chest",34, 0, 0, 3, 10);
		Property Pennave = new Property("Pen. Avenue",35, 110, 220, 4, 10);
		Property shortline = new Property("Short Line",36, 100, 200, 5, 10);
		Property chance3 = new Property("Chance",37, 0, 0, 6, 10);
		Property ParkPlace = new Property("Park Place", 38, 175, 300, 7, 10);
		Property LuxTax = new Property("Lux. Tax",39, 100, 0, 8, 10);
		Property BroadWalk = new Property("BroadWalk",40, 200, 400, 9, 10);

		testdatabase.add(GO);
		testdatabase.add(MedAv);
		testdatabase.add(CommChest1);
		testdatabase.add(BaltAve);
		testdatabase.add(Incometax1);
		testdatabase.add(ReadRail1);
		testdatabase.add(OrAve);
		testdatabase.add(Chance1);
		testdatabase.add(VermAve);
		testdatabase.add(ConnAve);
		testdatabase.add(Jail);
		testdatabase.add(CharPlace);
		testdatabase.add(ElecCompany);
		testdatabase.add(Statesave);
		testdatabase.add(VirgAve);
		testdatabase.add(PenRail1);
		testdatabase.add(JamesPlace);
		testdatabase.add(CommChest2);
		testdatabase.add(TenAve);
		testdatabase.add(NYAve);
		testdatabase.add(Freeparking);
		testdatabase.add(KenAve);
		testdatabase.add(chance2);
		testdatabase.add(IndAve);
		testdatabase.add(IllAve);
		testdatabase.add(BORail1);
		testdatabase.add(AtlAve);
		testdatabase.add(VentorAve);
		testdatabase.add(WaterWorks);
		testdatabase.add(MarvinGard);
		testdatabase.add(goJail);
		testdatabase.add(PacAve);
		testdatabase.add(NCAve);
		testdatabase.add(CommChest3);
		testdatabase.add(Pennave);
		testdatabase.add(shortline);
		testdatabase.add(chance3);
		testdatabase.add(ParkPlace);
		testdatabase.add(LuxTax);
		testdatabase.add(BroadWalk);	
	}
	
	
	
}

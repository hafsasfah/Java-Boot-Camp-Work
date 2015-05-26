package game;


import interfaces.iProperty;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import models.Property;
import data.PanelGenerator;



public class GUI extends JFrame
{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public byte monopolyBoard[][] = {{1,1,1,1},
			 						 {1,0,0,1},
			 						 {1,0,0,1},
			 						 {1,1,1,1}};
	
	public JPanel GameScreen;
	public JPanel Gameboard;
	
	public JPanel[][] propertytiles;
	
	public ArrayList<Property> testdatabase = new ArrayList<Property>(); //serve as a substitute for table of properties from database

	
	
	public GUI()
	{
		Property test1 = new Property(0,0,"Test1");
		Property test2 = new Property(3,0,"Test2");
		Property test3 = new Property(3,3,"Test3");
		testdatabase.add(test1);
		testdatabase.add(test2);
		testdatabase.add(test3);
		
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		GameScreen = new JPanel();
		Gameboard = new JPanel();
		GameScreen.setLayout(new GridLayout(2,1));
		Gameboard.setLayout(new GridLayout(4,4));
		buildBoard(monopolyBoard,testdatabase);
		translateJframes(propertytiles);
		
		GameScreen.add(Gameboard);
		this.add(GameScreen);
		setVisible(true);
	}
	
	public void buildBoard(byte gameboard[][],ArrayList<Property> database) 
	/* read each property from database
	 * 
	 * create a panel for the property
	 * 
	 * add property to gameboard JFrame based on the coordinates from the database
	 * 
	 * 
	 */
	{
		PanelGenerator panelgenerator = new PanelGenerator();
		propertytiles = new JPanel[4][4];
		for(int x = 0; x <= database.size() - 1 ; x++)
		{
			JPanel tempframe = panelgenerator.CreateAPanel(database.get(x));
			propertytiles[(database.get(x).coord.getRow())][(database.get(x).coord.getColumn())] = tempframe;
				
		}
		
		for(int i = 0; i < propertytiles.length; i++)
			{
			for(int k = 0; k < propertytiles[0].length; k++)
			{
				if(propertytiles[i][k] == null)
				{
					propertytiles[i][k] = new JPanel();
				}
					
			}
				
		}
			
	}
	
	public void translateJframes(JPanel[][] propertytiles)
	{
	for(int i = 0; i < propertytiles.length; i++)
		{
			for(int k = 0; k < propertytiles[0].length; k++)
			{
				Gameboard.add(propertytiles[i][k]);
					
			}
				
		}	
			
	}
	
	
	public static void main(String[] args)
	{
		
		new GUI();
		
	}
	
	
}

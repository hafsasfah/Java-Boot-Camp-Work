


import java.awt.GridLayout;

import javax.swing.*;



public class GUI extends JFrame
{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	
	public JPanel Gameboard;
	

	public iProperty testdatabase[]; //serve as a substitute for table of properties from database
	
	public GUI()
	{
		Gameboard = new JPanel();
		Gameboard.setLayout(new GridLayout(4,4));
		buildBoard(testdatabase);
	
		this.add(Gameboard);
		
	}
	
	public void buildBoard(iProperty database[]) 
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
		for(int x = 0; x <= database.length - 1 ; x++)
		{
			Gameboard.add(panelgenerator.CreateAPanel(database[x]), database[x].coord.getRow(),database[x].coord.getColumn());
				
		}
		
	}
	
	public static void main(String[] args)
	{
		
		GUI Monopoly = new GUI();
		
	}
	
	
}

import java.awt.GridLayout;

import javax.swing.*;



public class GUI extends JFrame
{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	
	public JPanel Gameboard;
	
	public byte monopolyBoard[][] = {{1,1,1,1},
									 {1,0,0,1},
									 {1,0,0,1},
									 {1,1,1,1}};
		
	
	public iProperty testdatabase[];
	
	public GUI()
	{
		Gameboard = new JPanel();
		Gameboard.setLayout(new GridLayout(4,4));
		buildBoard(monopolyBoard,testdatabase);
	
		this.add(Gameboard);
		
		
	}
	
	public void buildBoard(byte gameboard[][],iProperty database[])
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

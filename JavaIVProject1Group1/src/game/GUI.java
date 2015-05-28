package game;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;






import views.PropertyView;
import models.Property;
import data.PanelGenerator;



public class GUI extends JFrame
{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public JPanel GameScreen;
	public JPanel Monopoly;

	
	public JPanel[][] propertytiles;
	
	public ArrayList<Property> testdatabase = new ArrayList<Property>(); //serve as a substitute for table of properties from database

	
	
	public GUI()
	{


		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setResizable(false);
		GameScreen = new JPanel();
		Monopoly = new JPanel();
		GameScreen.setLayout(new GridLayout(2,1));
		
		PropertyView panelgenerator = new PropertyView();
		panelgenerator.buildBoard();
		Monopoly = panelgenerator.translateJframes();
		
		
		GameScreen.add(Monopoly);
		this.add(GameScreen);
		setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		
		new GUI();
		
	}
	
	
}

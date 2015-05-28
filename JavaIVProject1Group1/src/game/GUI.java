package game;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;











import controllers.PlayerController;
import views.PlayersView;
import views.PropertyView;
import models.Property;



public class GUI extends JFrame
{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public JPanel GameScreen;
	public JPanel Monopoly;
	public JPanel PlayerPanel;
	public JButton taketurn;
	PlayerController playercontrol= new PlayerController();
	
	public JPanel[][] propertytiles;
	
	public ArrayList<Property> testdatabase = new ArrayList<Property>(); //serve as a substitute for table of properties from database

	
	
	public GUI()
	{

		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setResizable(false);
		GameScreen = new JPanel();
		Monopoly = new JPanel();
		PlayerPanel = new JPanel();

		GameScreen.setLayout(new GridLayout(2,1));
		
		//PlayerController playercontrol = new PlayerController();
		PropertyView panelgenerator = new PropertyView();
		panelgenerator.buildBoard();
		Monopoly = panelgenerator.translateJframes();
		
		playercontrol.getPlayers();
		taketurn = new JButton("Take Turn");
		taketurn.addActionListener(new MovementButtonListener());
		GameScreen.add(Monopoly);
		for(int i = 0;  i <= playercontrol.listofplayers.size() - 1; i++)
		{
			PlayerPanel.add(playercontrol.listofplayers.get(i).playerview.translateJframes(playercontrol.listofplayers.get(i)));
		}
		PlayerPanel.add(taketurn);
		GameScreen.add(PlayerPanel);
		this.add(GameScreen);
		
		setVisible(true);
	}
	
	private class MovementButtonListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent E)
		{
			playercontrol.nextTurn();
			//JOptionPane.showMessageDialog(null, "I work!");
		}
		
	}
	public static void main(String[] args)
	{
		
		new GUI();
		
	}
	
	
}

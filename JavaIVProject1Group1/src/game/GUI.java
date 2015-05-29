package game;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import models.Property;
import controllers.PlayerController;
import controllers.PropertyController;
import data.GameRepository;
import data.PlayerRepository;
import data.PropertyRepository;

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
	public JButton endturn;
	public JButton buybutton;
	PlayerController playercontrol= new PlayerController();
	
	public JPanel[][] propertytiles;
	
	//public ArrayList<Property> testdatabase = new ArrayList<Property>(); //serve as a substitute for table of properties from database

	
	
	public GUI()
	{
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setResizable(false);
		GameScreen = new JPanel();
		Monopoly = new JPanel();
		PlayerPanel = new JPanel();

		GameScreen.setLayout(new GridLayout(2,1));
		
		PropertyController boardgenerator = new PropertyController();
		Monopoly = boardgenerator.translateJframes();
		
		playercontrol.getPlayers();
		taketurn = new JButton("Move");
		endturn = new JButton("End Turn");
		buybutton = new JButton("Buy");
		taketurn.addActionListener(new MovementButtonListener());
		endturn.addActionListener(new TurnButtonListener());
		buybutton.addActionListener(new BuyButtonListener());
		GameScreen.add(Monopoly);
		for(int i = 0;  i <= playercontrol.listofplayers.size() - 1; i++)
		{
			PlayerPanel.add(playercontrol.listofplayers.get(i).playerview.translateJframes(playercontrol.listofplayers.get(i)));
		}
		buybutton.setEnabled(false);
		PlayerPanel.add(taketurn);
		PlayerPanel.add(endturn);
		PlayerPanel.add(buybutton);
		GameScreen.add(PlayerPanel);
		this.add(GameScreen);
		
		setVisible(true);
	}
	
	private class MovementButtonListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent E)
		{
			playercontrol.nextTurn();
			taketurn.setEnabled(false);
			buybutton.setEnabled(true);
		}
		
		
	}
	
	private class TurnButtonListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent E)
		{
			playercontrol.handleTurn();
			taketurn.setEnabled(true);
			buybutton.setEnabled(false);
		}
		
		
	}
	
	private class BuyButtonListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent E)
		{
			playercontrol.buyProperty();
			buybutton.setEnabled(false);
			
		}
		
		
	}
	public static void main(String[] args)
	{
		
		Property place = new Property("MY HOUSE");
		
		PropertyRepository propertyRepo = new PropertyRepository();
		propertyRepo.buildPropertyTable();
		
		PlayerRepository playerRepo = new PlayerRepository();
		playerRepo.buildPlayerTable();
		
		GameRepository gameRepo = new GameRepository();
		gameRepo.buildGameTable();
		
		propertyRepo.create(place);
		propertyRepo.create(new Property("COFFEEHOUSE"));
		
		new GUI();
		
		
		
	}
	
	
}

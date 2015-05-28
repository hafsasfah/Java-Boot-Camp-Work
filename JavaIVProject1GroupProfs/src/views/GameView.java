package views;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

import controllers.*;
import models.*;

public class GameView implements IGameView {

	private AbstractGame game;
	private IGameController gameController;
	
	private JPanel gamePanel;
	
	private JPanel currentPlayerPanel;
	private JLabel titleLabel;
	private JLabel currentPlayerLabel;
	private JButton rollButton;
	
	private JPanel allPlayersPanel;
	
	private JPanel propertyPanel;
	
	public GameView( AbstractGame game, IGameController gameController )
	{
		this.game = game;
		this.gameController = gameController;
		
		game.addObserver(this);
		
		gamePanel = new JPanel();
		gamePanel.setLayout( new BorderLayout() );
		
		currentPlayerPanel = new JPanel();
		titleLabel = new JLabel( game.getName() );
		currentPlayerLabel = new JLabel( game.getCurrentPlayer().getName() );
		rollButton = new JButton("Roll");
		rollButton.addActionListener( new RollButtonListener() );
		currentPlayerPanel.add( titleLabel );
		currentPlayerPanel.add( currentPlayerLabel );
		currentPlayerPanel.add( rollButton );
		
		gamePanel.add( currentPlayerPanel, BorderLayout.NORTH );
		
		allPlayersPanel = new JPanel();
		allPlayersPanel.setLayout( new GridLayout( game.getPlayers().size(), 1));
		for ( AbstractPlayer player : game.getPlayers() )
		{
			allPlayersPanel.add( new PlayerView( player ).getPlayerPanel() );
		}
		
		gamePanel.add( allPlayersPanel, BorderLayout.WEST );
		
		propertyPanel = new JPanel();
		int corners = 4;
		int sides = 4;
		int totalProperties = game.getProperties().size();
		int length = ( totalProperties + corners ) / sides;
		propertyPanel.setLayout( new GridLayout( length, length ) );
		
		AbstractProperty[] sortedProperties = new AbstractProperty[ totalProperties ];
		game.getProperties().toArray(sortedProperties);
		
		Arrays.sort( sortedProperties );
				
		for ( int row = 0; row < length; row++ )
		{
			for ( int column = 0; column < length; column++ )
			{
				if ( row == 0 )
				{
					propertyPanel.add( new PropertyView( sortedProperties[column] ).getPropertyView() );
					continue;
				}
				if ( column == 0 )
				{
					propertyPanel.add( new PropertyView( sortedProperties[ totalProperties - row ] ).getPropertyView() );
					continue;
				}
				if ( row == totalProperties / sides )
				{
					propertyPanel.add( new PropertyView( sortedProperties[ totalProperties - row - column ] ).getPropertyView() );
					continue;
				}
				if ( column == totalProperties / sides )
				{
					propertyPanel.add( new PropertyView( sortedProperties[column + row] ).getPropertyView() );
					continue;
				}
				propertyPanel.add( new JPanel() );
			}
		}
		
		gamePanel.add( propertyPanel, BorderLayout.CENTER );
	}
	
	@Override
	public JPanel getGameView() {
		return gamePanel;
	}

	@Override
	public void update(Observable o, Object args) {
		titleLabel.setText( game.getID() + " " + game.getName() );
		currentPlayerLabel.setText( game.getCurrentPlayer().getName() );
	}
	
	private class RollButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			gameController.nextPlayerRolls();
		}
	}
}

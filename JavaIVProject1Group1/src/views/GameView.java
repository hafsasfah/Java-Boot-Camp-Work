package views;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import controllers.*;
import models.*;

public class GameView implements iGameView 
{

	private aGame game;
	private iGameController gameController;
	
	private JPanel gamePanel;
	
	private JPanel currentPlayerPanel;
	private JLabel titleLabel;
	private JLabel currentPlayerLabel;
	private JButton rollButton;
	
	private JPanel allPlayersPanel;
	
	public GameView( aGame game, GameController gameController )
	{
		this.game = game;
		this.gameController = gameController;
		
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
		for ( Object player : game.getPlayers().toArray( ) )
		{
			allPlayersPanel.add( new PlayerView( (aPlayer) player ).getPlayerPanel() );
		}
		
		gamePanel.add( allPlayersPanel, BorderLayout.WEST );
		
	}
	
	@Override
	public JPanel getGameView() 
	{
		return gamePanel;
	}

	@Override
	public void update(Observable arg0, Object arg1) 
	{
		currentPlayerLabel.setText( game.getCurrentPlayer().getName() );
	}
	
	private class RollButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			gameController.nextPlayerRolls();
		}
	}
}
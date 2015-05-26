package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

import controllers.IGameController;
import models.*;

public class GameView implements IGameView {

	private AbstractGame game;
	private IGameController gameController;
	
	private JPanel panel;
	private JLabel titleLabel;
	private JLabel currentPlayerLabel;
	private JButton rollButton;
	
	public GameView( AbstractGame game, IGameController gameController )
	{
		this.game = game;
		this.gameController = gameController;
		panel = new JPanel();
		titleLabel = new JLabel( game.getName() );
		currentPlayerLabel = new JLabel( game.getCurrentPlayer().getName() );
		rollButton = new JButton("Roll");
		rollButton.addActionListener( new RollButtonListener() );
		panel.add( titleLabel );
		panel.add( currentPlayerLabel );
		panel.add( rollButton );
	}
	
	@Override
	public JPanel getGameView() {
		return panel;
	}

	@Override
	public void update(Observable o, Object args) {
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

package views;

import java.util.Observable;

import javax.swing.JPanel;

import models.Players;



public class PlayersView implements iPlayersView {
	
	public PlayersView(Players players) {
		players.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JPanel getPlayerPanel() {
		// TODO Auto-generated method stub
		return null;
	}
		
		
}

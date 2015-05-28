package controllers;

import java.util.List;

import views.IGameView;

public interface IGameController {
	IGameView startNewGame( String[] playerNames );
	IGameView loadGame( int gameID );
	boolean saveGame();
	void currentPlayerRolls();
}

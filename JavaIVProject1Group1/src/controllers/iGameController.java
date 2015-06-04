package controllers;

import java.util.List;

import views.iGameView;

//import //Game view needed

public interface iGameController {
	//Game view needed startNewGame( String[] playerNames );
	//Game view needed loadGame( int gameID );
	boolean saveGame();
	void nextPlayerRolls();
	iGameView loadGame(int gameID);
	iGameView startNewGame(String[] playerNames);
}
package models;

import views.iGameView;

import java.util.*;

import copying.aPlayer;
import copying.aProperty;


public abstract class aGame extends Observable 
{
	public abstract int getID();
	public abstract void setID( int id );
	
	public abstract String getName();
	public abstract HashSet<aProperty> getProperties();
	public abstract Queue<aPlayer> getPlayers();
	
	public abstract boolean hasWinner();
	
	public abstract aPlayer getCurrentPlayer();
	public abstract void nextPlayersTurn(int roll);

/*	public void addObserver(iGameView gameView) {
		// TODO Auto-generated method stub
		
	}

	public void nextPlayersTurn(int i) {
		// TODO Auto-generated method stub
		
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	}*/
}

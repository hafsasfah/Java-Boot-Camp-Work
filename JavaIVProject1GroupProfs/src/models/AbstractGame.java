package models;

import java.util.*;

public abstract class AbstractGame extends Observable {
	public abstract int getID();
	public abstract void setID( int id );
	public abstract String getName();
	public abstract ArrayList<AbstractProperty> getProperties();
	public abstract Queue<AbstractPlayer> getPlayers();
	public abstract boolean hasWinner();
	public abstract AbstractPlayer getCurrentPlayer();
	public abstract void setCurrentPlayer( AbstractPlayer player );
	public abstract void nextPlayersTurn( );
}
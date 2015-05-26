package models;

import java.util.*;

public abstract class AbstractGame extends Observable {
	public abstract int getID();
	public abstract String getName();
	public abstract HashSet<AbstractProperty> getProperties();
	public abstract Queue<AbstractPlayer> getPlayers();
	public abstract boolean hasWinner();
	public abstract AbstractPlayer getCurrentPlayer();
	public abstract void nextPlayersTurn(int roll);
}
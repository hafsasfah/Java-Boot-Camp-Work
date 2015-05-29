package models;

import java.util.LinkedList;

public class Property extends AbstractProperty {

	private int id;
	private int sequenceNumber;
	private int gameID;
	private String name;
	private int purchasePrice;
	private int rentalPrice;
	private AbstractPlayer owner;
	private LinkedList<AbstractPlayer> parkedPlayers;
	

	public Property( int id, int sequenceNumber, String name, int purchasePrice, int rentalPrice, AbstractPlayer owner, LinkedList<AbstractPlayer> parkedPlayers, int gameID )
	{
		this.id = id;
		this.sequenceNumber = sequenceNumber;
		this.gameID = gameID;
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.rentalPrice = rentalPrice;
		this.owner = owner;
		this.parkedPlayers = parkedPlayers;
	}
	
	public Property(int sequenceNumber, String name, int purchasePrice, int rentalPrice, AbstractPlayer owner, int gameID ) 
	{
		this.sequenceNumber = sequenceNumber;
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.rentalPrice = rentalPrice;
		this.owner = owner;
		this.gameID = gameID;
		this.parkedPlayers = new LinkedList<AbstractPlayer>();
	}

	@Override
	public int getID() {
		return id;
	}

	@Override
	public void setID(int id) {
		this.id = id;	
	}
	
	@Override
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	@Override
	public int getGameID() {
		return gameID;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPurchasePrice() {
		return purchasePrice;
	}

	@Override
	public int getRentalPrice() {
		return rentalPrice;
	}

	@Override
	public AbstractPlayer getOwner() {
		return owner;
	}

	@Override
	public LinkedList<AbstractPlayer> getParkedPlayers() {
		return parkedPlayers;
	}

	@Override
	public int compareTo( AbstractProperty otherProperty ) {
		return sequenceNumber - otherProperty.getSequenceNumber();
	}

	@Override
	public void setOwner(AbstractPlayer owner) {
		this.owner = owner;
		setChanged();
		notifyObservers();
	}

	@Override
	public boolean addParkedPlayer(AbstractPlayer player) {
		boolean changed = parkedPlayers.add( player );
		setChanged();
		notifyObservers();
		return changed;
	}

	@Override
	public boolean removeParkedPlayer(AbstractPlayer player) {
		boolean changed = parkedPlayers.remove( player );
		setChanged();
		notifyObservers();
		return changed;
	}
}

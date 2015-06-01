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
	private AbstractPropertyGroup propertyGroup;

	public Property( int id, int sequenceNumber, AbstractPropertyGroup propertyGroup, String name, int purchasePrice, int rentalPrice, AbstractPlayer owner, LinkedList<AbstractPlayer> parkedPlayers, int gameID )
	{
		this.id = id;
		this.sequenceNumber = sequenceNumber;
		this.propertyGroup = propertyGroup;
		this.gameID = gameID;
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.rentalPrice = rentalPrice;
		this.owner = owner;
		this.parkedPlayers = parkedPlayers;
	}
	
	public Property(int sequenceNumber, AbstractPropertyGroup propertyGroup, String name, int purchasePrice, int rentalPrice, AbstractPlayer owner, int gameID ) 
	{
		this.sequenceNumber = sequenceNumber;
		this.propertyGroup = propertyGroup;
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
	public AbstractPropertyGroup getPropertyGroup() {
		return propertyGroup;
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
		return propertyGroup.getModifiedRent(owner, rentalPrice);
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
		for ( AbstractProperty property : propertyGroup.getProperties() )
		{
			property.forceUpdate();
		}
	}

	@Override
	public boolean addParkedPlayer(AbstractPlayer player) {
		boolean changed = parkedPlayers.add( player );
		forceUpdate();
		return changed;
	}

	@Override
	public boolean removeParkedPlayer(AbstractPlayer player) {
		boolean changed = parkedPlayers.remove( player );
		forceUpdate();
		return changed;
	}

	@Override
	public void forceUpdate() {
		setChanged();
		notifyObservers();
	}
}

package factory;

import java.util.*;

import models.*;

public class ClassicMonopolyPropertyFactory implements IPropertyFactory {

	private ArrayList<AbstractProperty> properties;
	
	public ClassicMonopolyPropertyFactory( )
	{
		properties = new ArrayList<AbstractProperty>();
	}
	
	@Override
	public ArrayList<AbstractProperty> createProperties( int gameID ) {
		
		Player bank = new Player( "Bank", 0, gameID, null );
		
		AbstractPropertyGroup bankGroup = new PropertyGroup(0);
		AbstractPropertyGroup purpleGroup = new PropertyGroup(2);
		AbstractPropertyGroup lightBlueGroup = new PropertyGroup(2);
		AbstractPropertyGroup pinkGroup = new PropertyGroup(2);
		AbstractPropertyGroup orangeGroup = new PropertyGroup(2);
		AbstractPropertyGroup redGroup = new PropertyGroup(2);
		AbstractPropertyGroup yellowGroup = new PropertyGroup(2);
		AbstractPropertyGroup greenGroup = new PropertyGroup(2);
		AbstractPropertyGroup darkBlueGroup = new PropertyGroup(2);
		AbstractPropertyGroup utilityGroup = new UtilityPropertyGroup(4, 10);
		AbstractPropertyGroup railroadGroup = new RailroadPropertyGroup();
		
		createProperty( gameID, 0, bankGroup, "GO", 0, 0, bank );
		createProperty( gameID, 1, purpleGroup, "Mediteranian Ave", 60, 2 );
		createProperty( gameID, 2, bankGroup, "Community Chest", 0, 0, bank );
		createProperty( gameID, 3, purpleGroup, "Baltic Ave", 60, 4 );		
		createProperty( gameID, 4, bankGroup, "Income Tax", 0, 200, bank );
		createProperty( gameID, 5, railroadGroup, "Reading Railroad", 200, 25 );
		createProperty( gameID, 6, lightBlueGroup, "Oriental Ave", 100, 6 );
		createProperty( gameID, 7, bankGroup, "Chance", 0, 0, bank );
		createProperty( gameID, 8, lightBlueGroup, "Vermont", 100, 6 );
		createProperty( gameID, 9, lightBlueGroup, "Connecticut Ave", 120, 8 );
		createProperty( gameID, 10, bankGroup, "Jail", 0, 0, bank );
		createProperty( gameID, 11, pinkGroup, "St. Charles Place", 140, 10 );
		createProperty( gameID, 12, utilityGroup, "Electric Co", 150, 0 );
		createProperty( gameID, 13, pinkGroup, "States Ave", 140, 10 );
		createProperty( gameID, 14, pinkGroup, "Virginia Ave", 160, 12 );
		createProperty( gameID, 15, railroadGroup, "Pennsylvania Railroad", 200, 25 );
		createProperty( gameID, 16, orangeGroup, "St. James Place", 180, 14 );
		createProperty( gameID, 17, bankGroup, "Community Chest", 0, 0, bank );
		createProperty( gameID, 18, orangeGroup, "Tenesse Ave", 180, 14 );
		createProperty( gameID, 19, orangeGroup, "New York Ave", 200, 16 );
		createProperty( gameID, 20, bankGroup, "Free Parking", 0, 0, bank );
		createProperty( gameID, 21, redGroup, "Kentucky Ave", 220, 18 );
		createProperty( gameID, 22, bankGroup, "Chance", 0, 0, bank );
		createProperty( gameID, 23, redGroup, "Indiana Ave", 220, 18 );
		createProperty( gameID, 24, redGroup, "Ilinois Ave", 240, 20 );
		createProperty( gameID, 25, railroadGroup, "B&O Railroad", 200, 25 );
		createProperty( gameID, 26, yellowGroup, "Atlantic Ave", 260, 22 );
		createProperty( gameID, 27, yellowGroup, "Ventnor Ave", 260, 22 );
		createProperty( gameID, 28, utilityGroup, "Water Works", 150, 0 );
		createProperty( gameID, 29, yellowGroup, "Marvin Gardens", 280, 24 );
		createProperty( gameID, 30, bankGroup, "Go to Jail", 0, 0, bank );
		createProperty( gameID, 31, greenGroup, "Pacific Ave", 300, 26 );
		createProperty( gameID, 32, greenGroup, "North Carolina Ave", 300, 26 );
		createProperty( gameID, 33, bankGroup, "Community Chest", 0, 0, bank );
		createProperty( gameID, 34, greenGroup, "Pennsylvania Ave", 320, 28 );
		createProperty( gameID, 35, railroadGroup, "Shortline Railroad", 200, 25 );		
		createProperty( gameID, 36, bankGroup, "Chance", 0, 0, bank );
		createProperty( gameID, 37, darkBlueGroup, "Park Place", 350, 35 );
		createProperty( gameID, 38, bankGroup, "Luxury Tax", 0, 75, bank );
		createProperty( gameID, 39, darkBlueGroup, "Boardwalk", 400, 50 );

		return properties;
	}
	
	private void createProperty( int gameID, int sequenceID, AbstractPropertyGroup group, String name, int purchasePrice, int rent )
	{
		createProperty( gameID, sequenceID, group, name, purchasePrice, rent, null );
	}
	
	private void createProperty( int gameID, int sequenceID, AbstractPropertyGroup group, String name, int purchasePrice, int rent, AbstractPlayer owner )
	{
		Property balticAve = new Property( sequenceID, group, name, purchasePrice, rent, owner, gameID );
		properties.add( balticAve );
		group.addProperty( balticAve );
	}
}

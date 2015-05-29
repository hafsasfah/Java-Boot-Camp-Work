package factory;

import java.util.*;

import models.*;

public class ClassicMonopolyPropertyFactory implements IPropertyFactory {

	@Override
	public ArrayList<AbstractProperty> createProperties( int gameID ) {
		ArrayList<AbstractProperty> properties = new ArrayList<AbstractProperty>();
		
		AbstractPlayer bank = new Player( "Bank", 0, gameID, null );
		
		properties.add( new Property( 0, "GO", 0, 0, bank, gameID ) );
		properties.add( new Property( 1, "Mediteranian Ave", 60, 2, null, gameID ) );
		properties.add( new Property( 2, "Community Chest", 0, 0, bank, gameID ) );
		properties.add( new Property( 3, "Baltic Ave", 60, 4, null, gameID ) );
		properties.add( new Property( 4, "Income Tax", 0, 200, bank, gameID ) );
		properties.add( new Property( 5, "Reading Railroad", 200, 25, null, gameID ) );
		properties.add( new Property( 6, "Oriental Ave", 100, 6, null, gameID ) );
		properties.add( new Property( 7, "Chance", 0, 0, bank, gameID ) );
		properties.add( new Property( 8, "Vermont", 100, 6, null, gameID ) );
		properties.add( new Property( 9, "Connecticut Ave", 120, 8, null, gameID ) );
		properties.add( new Property( 10, "Jail", 0, 0, bank, gameID ) );
		properties.add( new Property( 11, "St. Charles Place", 140, 10, null, gameID ) );
		properties.add( new Property( 12, "Electric Co", 0, 0, bank, gameID ) );
		properties.add( new Property( 13, "States Ave", 140, 10, null, gameID ) );
		properties.add( new Property( 14, "Virginia Ave", 160, 12, null, gameID ) );
		properties.add( new Property( 15, "Pennsylvania Railroad", 200, 25, null, gameID ) );
		properties.add( new Property( 16, "St. James Place", 180, 14, null, gameID ) );
		properties.add( new Property( 17, "Community Chest", 0, 0, bank, gameID ) );
		properties.add( new Property( 18, "Tenesse Ave", 180, 14, null, gameID ) );
		properties.add( new Property( 19, "New York Ave", 200, 16, null, gameID ) );
		properties.add( new Property( 20, "Free Parking", 0, 0, bank, gameID ) );
		properties.add( new Property( 21, "Kentucky Ave", 220, 18, null, gameID ) );
		properties.add( new Property( 22, "Chance", 0, 0, bank, gameID ) );
		properties.add( new Property( 23, "Indiana Ave", 220, 18, null, gameID ) );
		properties.add( new Property( 24, "Ilinois Ave", 240, 20, null, gameID ) );
		properties.add( new Property( 25, "B&O Railroad", 200, 25, null, gameID ) );
		properties.add( new Property( 26, "Atlantic Ave", 260, 22, null, gameID ) );
		properties.add( new Property( 27, "Ventnor Ave", 260, 22, null, gameID ) );
		properties.add( new Property( 28, "Water Works", 0, 0, bank, gameID ) );
		properties.add( new Property( 29, "Marvin Gardens", 280, 24, null, gameID ) );
		properties.add( new Property( 30, "Go to Jail", 0, 0, bank, gameID ) );
		properties.add( new Property( 31, "Pacific Ave", 300, 26, null, gameID ) );
		properties.add( new Property( 32, "North Carolina Ave", 300, 26, null, gameID ) );
		properties.add( new Property( 33, "Community Chest", 0, 0, bank, gameID ) );
		properties.add( new Property( 34, "Pennsylvania Ave", 320, 28, null, gameID ) );
		properties.add( new Property( 35, "Shortline Railroad", 200, 25, null, gameID ) );		
		properties.add( new Property( 36, "Chance", 0, 0, bank, gameID ) );
		properties.add( new Property( 37, "Park Place", 350, 35, null, gameID ) );
		properties.add( new Property( 38, "Luxury Tax", 0, 75, bank, gameID ) );
		properties.add( new Property( 39, "Boardwalk", 400, 50, null, gameID ) );

		return properties;
	}

}

package models;

public class RailroadPropertyGroup extends AbstractPropertyGroup {

	@Override
	public int getModifiedRent(AbstractPlayer owner, int baseRent ) {
		int numberOfPropertiesOwned = 0;
		int dontDoubleBaseRentForFirstPropertyInGroup = 1;
		for ( AbstractProperty propertyInGroup : properties )
		{
			if ( owner.getOwnedProperties().contains( propertyInGroup ) )
			{
				numberOfPropertiesOwned++;
				if ( numberOfPropertiesOwned > dontDoubleBaseRentForFirstPropertyInGroup )
				{
					baseRent *= 2;
				}
			}
		}
		
		return baseRent;
	}
}

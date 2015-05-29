package models;

public class UtilityPropertyGroup extends AbstractPropertyGroup {

	private int paritalMonopolyModifier;
	private int fullMonopolyModifier;
	public UtilityPropertyGroup( int paritalMonopolyModifier, int fullMonopolyModifier )
	{
		this.paritalMonopolyModifier = paritalMonopolyModifier;
		this.fullMonopolyModifier = fullMonopolyModifier;
	}
	
	@Override
	public int getModifiedRent(AbstractPlayer owner, int baseRent ) {
		if ( owner.getOwnedProperties().containsAll( properties ) )
		{
			return fullMonopolyModifier;
		}
		else
		{
			return paritalMonopolyModifier;
		}
	}

}

package models;

public class PropertyGroup extends AbstractPropertyGroup {

	private int modifier;

	public PropertyGroup( int modifier )
	{
		this.modifier = modifier;
	}

	@Override
	public int getModifiedRent( AbstractPlayer owner, int baseRent ) 
	{
		if ( owner.getOwnedProperties().containsAll( properties ) )
		{
			return baseRent * modifier;
		}
		
		return baseRent;
	}
}

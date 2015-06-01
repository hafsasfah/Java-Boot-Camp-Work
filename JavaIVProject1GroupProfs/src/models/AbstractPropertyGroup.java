package models;

import java.util.HashSet;

public abstract class AbstractPropertyGroup {
	
	protected HashSet<AbstractProperty> properties;
	
	public AbstractPropertyGroup()
	{
		properties = new HashSet<AbstractProperty>();
	}
	
	public HashSet<AbstractProperty> getProperties()
	{
		return properties;
	}
	
	public boolean addProperty( AbstractProperty property )
	{
		return properties.add( property );
	}
	
	public abstract int getModifiedRent(AbstractPlayer owner, int baseRent );
}

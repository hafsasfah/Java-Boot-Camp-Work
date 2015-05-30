package data;

import java.util.*;

import models.AbstractProperty;

public interface IPropertyRepository {
	boolean create( AbstractProperty property );
	AbstractProperty get( int propertyID );
	int getPropertyID( String name, int gameID );
	boolean update( AbstractProperty property );
	ArrayList<AbstractProperty> getAllPropertiesInGame( int gameID );
}

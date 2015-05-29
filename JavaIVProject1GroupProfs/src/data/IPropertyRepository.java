package data;

import java.util.*;

import models.AbstractProperty;

public interface IPropertyRepository {
	boolean create( AbstractProperty property );
	AbstractProperty get( int propertyID );
	boolean update( AbstractProperty property );
	ArrayList<AbstractProperty> getAllPropertiesInGame( int gameID );
}

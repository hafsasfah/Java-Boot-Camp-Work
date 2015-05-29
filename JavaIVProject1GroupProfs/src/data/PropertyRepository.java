package data;

import java.sql.Connection;
import java.util.*;

import models.AbstractProperty;

public class PropertyRepository implements IPropertyRepository {

	private Connection connection;

	public PropertyRepository(Connection connection)
	{
		this.connection = connection;
	}
	
	@Override
	public boolean create(AbstractProperty property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AbstractProperty get(int propertyID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(AbstractProperty property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<AbstractProperty> getAllPropertiesInGame(int gameID) {
		// TODO Auto-generated method stub
		return null;
	}
}

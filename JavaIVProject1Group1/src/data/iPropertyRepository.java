package data;

import models.aProperty;

public interface iPropertyRepository {
	boolean create(aProperty property);
	aProperty get(int propertyID);
	boolean update(aProperty property);
	boolean delete(aProperty property);
}

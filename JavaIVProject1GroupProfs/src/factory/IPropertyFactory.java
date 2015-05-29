package factory;

import java.util.ArrayList;

import models.AbstractProperty;

public interface IPropertyFactory {
	ArrayList<AbstractProperty> createProperties(int gameID); 
}

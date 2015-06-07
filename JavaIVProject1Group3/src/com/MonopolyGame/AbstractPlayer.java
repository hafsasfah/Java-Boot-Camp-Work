package com.MonopolyGame;

public interface AbstractPlayer {

public abstract String getplayerName();
public abstract int getplayerID();
public abstract int getplayerCash();
public abstract void purchaseProperty(AbstractProperty propertyLandedOn);
public abstract void currentLocation();
public abstract Object getCurrentLocation();
public abstract void setCurrentLocation(AbstractProperty propertyLandedOn);
public abstract void spendMoney(int rent);


}

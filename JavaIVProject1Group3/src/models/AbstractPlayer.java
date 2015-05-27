package models;

public interface AbstractPlayer {

public abstract String getplayerName();
public abstract int getplayerId();
public abstract int getplayerCash();
public abstract void purchaseProperty();
public abstract void currentLocation();
}

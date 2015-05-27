package model;
import java.util.ArrayList;


public interface iPlayer {


	int getLocation();
    void setLocation(int location);
	int getCash();
    void setCash(int amountSpent);
   // ArrayList<Integer> getPlayerOwnedProperties();
    void addProperty(int indexOfProperty);



}

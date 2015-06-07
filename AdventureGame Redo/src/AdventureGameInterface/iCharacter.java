package AdventureGameInterface;

import java.awt.Component;
import java.util.*;

public interface iCharacter
{
	ArrayList<IWeaponFactory> Inventory = new ArrayList<IWeaponFactory>();
	int getHitPoints();
	int getMana();
	int getStrength();
	int getDexterity();
	int getWisdom();
	
	String getInventory();
	Component getPanel();
	String attack(iCharacter monster);
	void setHitPoints(int damageTaken);
	boolean deathCheck();
	boolean getAlive();
}
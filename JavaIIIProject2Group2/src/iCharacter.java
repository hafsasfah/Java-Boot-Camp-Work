
import java.util.*;

public interface iCharacter
{
	ArrayList<iItems> Inventory = new ArrayList<iItems>();
	
	//****Get Stats****\\
	int getHitPoints();
	int getStrength();
	int getDexterity();
	int getIntelligence();
	
	//****Check Inventory****\\
	String getInventory();
	
	
	//****Procedure on Death****
	boolean deathCheck();
	
	//**Combat Procedure**\\
	void attack(iCharacter monster);
	
	void runAway(iCharacter player);
	void runAway(Player player);
	void setHitPoints(int damageTaken);
	boolean getAlive();
	
}

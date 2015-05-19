
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
	void deathCheck();
	
	//**Combat Procedure**\\
	void attack(Player monster);
	
	void runAway(Player player);
	
	
}

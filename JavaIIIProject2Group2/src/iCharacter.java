

import java.util.*;

public interface iCharacter
{
	ArrayList<iItems> Inventory = new ArrayList<iItems>();
	
	//****Get Stats****\\
	int getHealth();
	int getStrength();
	int getDexterity();
	int getMana();
	
	//****Check Inventory****\\
	String getInventory();
	
	
	//****Procedure on Death****\\
	void deathCheck();
	
	//**Combat Procedure**\\
	void attack();
}

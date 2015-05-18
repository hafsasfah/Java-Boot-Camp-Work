

import java.util.*;

public interface iRoom
{
	
	boolean isOK();
	boolean markOK();
	boolean isGoal();
	boolean markDeadEnd();
	
	
	//**Fill the room**\\
	void generateMonsters();
	void generateItems();
	
	//**Output room layout in text**\\
	void roomDescription();

}

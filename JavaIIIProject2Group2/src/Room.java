

import java.util.Iterator;

public class Room implements iRoom
{

	int x;
	int y;
	Coordinates cord;
	
	
	public Room()
	{
		
	}
	public void enterRoom()
	{
		
	}
	
	@Override
	public void generateMonsters() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateItems() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roomDescription() 
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString()
	{
		return "9";
	}

	
	
	
	
	
	
	@Override
	public boolean isOK() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean markOK() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGoal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean markDeadEnd() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Coordinates> iterator(Coordinates cord) {
		// TODO Auto-generated method stub
		return null;
	}


}

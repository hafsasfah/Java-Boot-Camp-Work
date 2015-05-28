import java.util.ArrayList;
import java.util.LinkedList;

import views.PropertyView;


public class GameController
{
		
		LinkedList<Player> object = new LinkedList<Player>();
		ArrayList<Property> property = new ArrayList<Property>();	
		
		
		
		
		public GameController(LinkedList<Player> playerObject, ArrayList<Property> propertyObject)
		{
			this.object = playerObject;
			this.property = propertyObject;	
		}
		
		
		
		
		public Player getPlayer()
		{
			
			
		}
		
		
		public void update()
		{
			
			for(int i = 0; i < object.size(); i++)
			{
				Player tempObject = object.get(i);
				
				tempObject.tick();
			}
			
			
		}
		

	

		public void addObject(Player object)
		{
			this.object.add(object);	
		}
		
		
		public void removeObject(Player object)
		{
			this.object.remove(object);	
		}
	
		
	}

	
	
	
	
	
	
	
	


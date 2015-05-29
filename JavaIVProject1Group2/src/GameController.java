
import java.util.ArrayList;
import java.util.LinkedList;

import logic.DiceRoll;
import views.PropertyView;


public class GameController 
{
	private DiceRoll dice;
	private IPlayer aPlayer;
	private IProperty aProperty;
	private boolean pass = false;
	private boolean buy = false;
	
		
		LinkedList<Player> object = new LinkedList<Player>();
		ArrayList<Property> property = new ArrayList<Property>();	
		
		
		public GameController(LinkedList<Player> playerObject, ArrayList<Property> propertyObject, DiceRoll dice)
		{
			this.object = playerObject;
			this.property = propertyObject;	
		}
	
	
		public void update()
		{
			
			for(int i = 0; i < object.size(); i++)
			{
				Player tempObject = object.get(i);
				
				tempObject.getID();
			}
			
			for(int i = 0; i < property.size(); i++)
			{
				
				
				
			}
			
			
		}
		
		
		
		public void getPlayerMovement()
		{
			
			
				if(DiceRoll.getRoll() == aProperty.getID())
				{
					
		
						
									
				}
			
		}
		
		
		public boolean passOnTurnRatherThanBuy()
		{
			
			
			
			return pass;
			
		}
		
		
		public boolean playerPurchaseProperty()
		{
			return buy;
			
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

	
	
	
	
	
	
	
	


import java.awt.Graphics;
import java.util.LinkedList;


public class GameController
{

	
		
		
		
		
		//<---------------------------We need to create a list of all of our game objects by making a linked list------------------------>// 
		
		LinkedList<Player> object = new LinkedList<Player>();
		
		
		//<---------------------------We need to create a list of all of our game objects by making a linked list------------------------>// 
		
		
		
		public void tick()
		{
			//<---------------------------this will loop through every single game object to tick/updates------------------------>//  
			for(int i = 0; i < object.size(); i++)
			{
				Player tempObject = object.get(i);
				
				tempObject.tick();
			}
			
			//<---------------------------this will loop through every single game object to tick/updates------------------------>// 
		}
		
		
		
		
		

		public void render(Graphics g)
		{
			//<---------------------------this will loop through every single game object to render image------------------------>//
			for(int i = 0; i < object.size(); i++)
			{
				Player tempObject = object.get(i);
				
				
				tempObject.render(g);
			}
			
			//<---------------------------this will loop through every single game object to render image------------------------>//
		}
		
		
		
		
		//<---------------------------This method function is to add Objects to the list------------------------>//
		
		public void addObject(Player object)
		{
			this.object.add(object);	
		}
		
		//<---------------------------This method function is to add Objects to the list------------------------>//
		
	
		
		//<---------------------------This method function is to remove Objects to the list------------------------>//
		public void removeObject(Player object)
		{
			this.object.remove(object);	
		}
		
		//<---------------------------This method function is to remove Objects to the list------------------------>//
		
	}

	
	
	
	
	
	
	
	


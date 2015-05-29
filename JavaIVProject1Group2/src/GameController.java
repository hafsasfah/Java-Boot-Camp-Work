
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import logic.DiceRoll;
import views.PropertyView;


public class GameController 
{
	private DiceRoll dice;
	private Player[] aPlayer;
	private PropertyFactory aProperty;
	private int totalPlayers = 0;
	private int i = 0;
	private boolean pass = false;
	private boolean buy = false;
	
		
		LinkedList<Player> object = new LinkedList<Player>();
		ArrayList<PropertyFactory> property = new ArrayList<PropertyFactory>();	
		
		
		public GameController(LinkedList<Player> playerObject, ArrayList<PropertyFactory> propertyObject, 
				DiceRoll dice, Player[] aPlayer, int totalPlayers)
		{
			this.object = playerObject;
			this.property = propertyObject;	
			this.dice = dice;
			this.aPlayer = aPlayer;
			this.totalPlayers = totalPlayers;
		
			
			
			
			
		}
	
	
		
		
		
		public GameController() 
		{
			int totalPlayers = 0; 
			this.totalPlayers = totalPlayers;
			
			aPlayer = new Player[totalPlayers];
			for(int i = 0; i < aPlayer.length; i++)
			{
				
				aPlayer[i] = new Player(i, "Player " + (i +1), i, i, i);
				
			}
			
			
		}





		public void getMultiplePlayers()
		{
			

			
			
			
			
		}
		
		public int getPlayerPurchaseAction()
		{
			
			if(DiceRoll.getRoll() == aProperty.getID())
			{
				if(aPlayer[i].getCurrentPosition() == aProperty.getID())
				{
					JOptionPane.showMessageDialog(null,"Player: " + aPlayer[i] + " is located at: " + aProperty.getID());
				}if(aProperty.getPropertyCost() < aPlayer[i].getMoney())
				{
					aPlayer[i].setMoney(aPlayer[i].getMoney() - aProperty.getPropertyCost());
					JOptionPane.showMessageDialog(null, aPlayer[i] + " has bought something!" 
					+" Your remaining money: " + aPlayer[i].getMoney());
				
				}if(aProperty.getPropertyCost() > aPlayer[i].getMoney())
				{
					JOptionPane.showMessageDialog(null, "You do not have enough money for buy that!");
				}
				
			}else if(aPlayer[i].getMoney() < 0)
			{
				JOptionPane.showMessageDialog(null, "Sorry you are out of money!");
			}
			return aPlayer[i].getMoney();
		
		}
		
		
		public void setPlayerPurchaseAction(int i)
		{
			this.i = i;
			
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





		public void addActionListener(ActionListener actionListener) {
			
			
		}
	
		
	}

	
	
	
	
	
	
	
	


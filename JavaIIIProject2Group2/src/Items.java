
public class Items implements iItems 
{

	private int hitpointPotion;
	private int dexterityPotion;
	private int strengthPotion;
	private int intelligencePotion;
	
	private Player player;
	
	//Set amount of potion effects
	private int hitpointPotionAmount = 5;
	private int strengthPotionAmount = 5;
	private int dexterityPotionAmount = 5;
	private int intelligencePotionAmount = 5;
	
	
	
	
	public Items()
	{
		this.hitpointPotion = 0;
		this.dexterityPotion = 0;
		this.strengthPotion = 0;
		this.intelligencePotion = 0;
		
	}
	
	
	public Items(int hitpointPotion, int dexterityPotion, int strengthPotion, int intelligencePotion)
	{
		this.hitpointPotion = hitpointPotion;
		this.dexterityPotion = dexterityPotion;
		this.strengthPotion = strengthPotion;
		this.intelligencePotion = intelligencePotion;	
		
	}
	
	
	@Override
	public void activateItem() 
	{
		
		if(hitpointPotion > 0)
		{
			player.hitPoints += hitpointPotionAmount;
			hitpointPotion--;
			System.out.println("You drink Hit Point potion!");
			
		}else if(hitpointPotion == 0)
		{
			
			System.out.println("You have " + hitpointPotion + " Hit Point potion left.");
			
		}
		
		if(strengthPotion > 0)
		{
			player.strength += strengthPotionAmount;
			strengthPotion--;
			System.out.println("You drink Strength potion!");
			
		}else if( strengthPotion == 0)
		{
			
			System.out.println("You have " + strengthPotion + " Strength potion left.");
			
		}
		
		if(dexterityPotion > 0)
		{
			player.dexterity += dexterityPotionAmount;
			dexterityPotion--;
			System.out.println("You drink dexterity potion!");
			
		}else if( dexterityPotion == 0)
		{
			
			System.out.println("You have " + dexterityPotion + " dexterity potion left.");
			
		}
		
		
		if(intelligencePotion > 0)
		{
			player.intelligence += intelligencePotionAmount;
			intelligencePotion--;
			System.out.println("You drink intelligence potion!");
			
		}else if( dexterityPotion == 0)
		{
			
			System.out.println("You have " + dexterityPotion + " dexterity potion left.");
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

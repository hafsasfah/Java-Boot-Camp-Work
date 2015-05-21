
public class Items implements iItems 
{

	private int hitpointPotion;
	private int dexterityPotion;
	private int strengthPotion;
	private int intelligencePotion;
	private Player potion;
	
	
	
	
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
	public int getUses() 
	{
		
		
		
		
		return 0;
	}

	@Override
	public void activateItem() 
	{
		
		if(hitpointPotion > 0)
		{
			hitpointPotion--;
		}
		
		if(strengthPotion > 0)
		{
			strengthPotion--;
		}
		
		if(dexterityPotion > 0)
		{
			dexterityPotion--;
		}
		
		if(intelligencePotion > 0)
		{
			intelligencePotion--;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

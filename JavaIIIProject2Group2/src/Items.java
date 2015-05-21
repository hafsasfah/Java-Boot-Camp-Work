
public class Items implements iItems 
{

	private int amountOfHitPointPotion;
	private int amountOfDexterityPotion;
	private int amountOfStrengthPotion;
	private int amountOfIntelligencePotion;
	
	private Player player;
	
	//Set amount of Increase effects of each potion
	private int IncreaseYourHitpoint = 5;
	private int IncreaseYourStrength = 5;
	private int IncreaseYourDexterity = 5;
	private int IncreaseYourIntelligence = 5;
	
	
	
	
	public Items()
	{
		this.amountOfHitPointPotion = 0;
		this.amountOfDexterityPotion = 0;
		this.amountOfStrengthPotion = 0;
		this.amountOfIntelligencePotion = 0;
		
	}
	
	
	public Items(int hitpointPotion, int dexterityPotion, int strengthPotion, int intelligencePotion, Player player)
	{
		this.amountOfHitPointPotion = hitpointPotion;
		this.amountOfDexterityPotion = dexterityPotion;
		this.amountOfStrengthPotion = strengthPotion;
		this.amountOfIntelligencePotion = intelligencePotion;	
		this.player = player; 
		
	}
	
	
	@Override
	public void activateItem() 
	{
			
		if(amountOfHitPointPotion > 0)
		{
			player.setHitPoints(player.getHitPoints() + this.IncreaseYourHitpoint) ;
			amountOfHitPointPotion--;
			System.out.println("You drink Hit Point potion!");
			
		}else if(amountOfHitPointPotion == 0)
		{
			
			System.out.println("You have " + amountOfHitPointPotion + " Hit Point potion left.");
			
		}
		
		if(amountOfStrengthPotion > 0)
		{
			player.setStrength(player.getStrength() + this.IncreaseYourStrength  );
			amountOfStrengthPotion--;
			System.out.println("You drink Strength potion!");
			
		}else if( amountOfStrengthPotion == 0)
		{
			
			System.out.println("You have " + amountOfStrengthPotion + " Strength potion left.");
			
		}
		
		if(amountOfDexterityPotion > 0)
		{
			player.setDexterity(player.getDexterity() + this.IncreaseYourDexterity);
			amountOfDexterityPotion--;
			System.out.println("You drink dexterity potion!");
			
		}else if( amountOfDexterityPotion == 0)
		{
			
			System.out.println("You have " + amountOfDexterityPotion + " dexterity potion left.");
			
		}
		
		
		if(amountOfIntelligencePotion > 0)
		{
			player.setIntelligence(player.getIntelligence() + this.IncreaseYourIntelligence);
			amountOfIntelligencePotion--;
			System.out.println("You drink intelligence potion!");
			
		}else if( amountOfDexterityPotion == 0)
		{
			
			System.out.println("You have " + amountOfDexterityPotion + " dexterity potion left.");
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

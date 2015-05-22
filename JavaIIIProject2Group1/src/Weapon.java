import javax.swing.JPanel;

public class Weapon implements Item 

{
	
	private String name;
	private int durability;
	private int baseDamage;
	
	public Weapon (String name, int durability, int baseDamage)
	{
		
		this.name = name;
		this.durability = durability;
		this.baseDamage = baseDamage;
	}
		
	@Override
	public String getName()
	{
		
		return null;
	}

	@Override
	public int getDurability() 
	{
		
		return baseDamage;
	}

	@Override
	public boolean isBroken() 
	{
		
		return false;
	}


	public double getBaseDamage()
	{	
		return 0;
	}
	
	@Override
	public JPanel getPanel() 
	{
		
		return null;
	}
	
}


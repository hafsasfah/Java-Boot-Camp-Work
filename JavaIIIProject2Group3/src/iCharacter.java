
public interface iCharacter {
	
	public void pickUpItem(String item);
	public void drinkPotion(double potion);
	public void addArmor(double armor);
	
	public int[] getCharLocation();
	
	// Movement methods
	public void generateMvmtUp();
	public void generateMvmtDown();
	public void generateMvmtLeft();
	public void generateMvmtRight();
	public String getCharLocationString();
	
}


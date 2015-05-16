
public interface iCharacter {
	
	public void pickUpItem(String item);
	public void drinkPotion(double potion);
	public void addArmor(double armor);
	//public int[][] generateMvmt(int[][] i);
	public void generateMvmtUp();
	public void generateMvmtDown();
	public void generateMvmtLeft();
	public void generateMvmtRight();
}


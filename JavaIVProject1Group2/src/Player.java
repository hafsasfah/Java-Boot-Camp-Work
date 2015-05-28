import java.awt.Graphics;
import java.util.HashSet;





public class Player {
	private int id;
	private String name;
	private int money;
	private int playerLocationX;
	private int playerLocationY;
	
	
	public Player( int id, String name, int money )
	{
		this.id = id;
		this.name = name;
		this.money = money;
		
	}
	
	public int getID() {
		return id;
	}


	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name)
	{
		this.name = name;
		
		
	}


	public int getMoney() {
		return money;
	}
	
	
	public void setMoney(int money)
	{
		
		this.money = money;
		
	}


	public void spendMoney(int money) {
		this.money -= money;
		setChanged();
		notifyObservers();
	}


	private void notifyObservers() {
		
		
	}

	private void setChanged() {
		
		
	}

	public boolean hasLostGame() {
		return money <= 0;
	}
	
	public void setHasLostMoney(int money)
	{
		
		this.money = money;
	}
	
	
	public int getXPositionOfPlayer()
	{
		
		return this.playerLocationX;	
	}
	
	public int getYPositionOfPlayer()
	{
		
		
		return this.playerLocationY;
	}
	
	
	public void setPosition(int playerLocationX, int playerLocationY)
	{
		
		this.playerLocationX = playerLocationX;
		this.playerLocationY = playerLocationY;
	
	}
	
	//Shows the image of player
	public void render(Graphics g) {
		
		
	}

	
	
	//Updates 
	public void tick() {
		// TODO Auto-generated method stub
		
	}



}

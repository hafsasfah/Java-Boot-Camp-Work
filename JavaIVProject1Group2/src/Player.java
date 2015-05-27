import java.awt.Graphics;
import java.util.HashSet;





public class Player {
	private int id;
	private String name;
	private int money;

	
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


	public int getMoney() {
		return money;
	}


	public void spendMoney(int money) {
		this.money -= money;
		setChanged();
		notifyObservers();
	}


	private void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

	private void setChanged() {
		// TODO Auto-generated method stub
		
	}

	public boolean hasLostGame() {
		return money <= 0;
	}

	
	//Shows the image of player
	public void render(Graphics g) {
		
		
	}

	
	
	//Updates 
	public void tick() {
		// TODO Auto-generated method stub
		
	}



}

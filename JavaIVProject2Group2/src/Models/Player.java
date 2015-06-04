package Models;

public class Player
{

	private String name;
	private double money;

	public Player( String name, double money )
	
	{
	this.setName(name);
	this.setMoney(money);
	}

	public String getName() {
	
		return name;
	}

	public void setName(String name) {
	
		this.name = name;
	}

	public double getMoney() {
	
		return money;
	}

	public void setMoney(double money) {
	
		this.money = money;
	}
}
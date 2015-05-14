import java.awt.GridLayout;
import javax.swing.*;

public class Player implements iPlayer{
	private String name;
	private int cash;
	private iVehicle car;
	
	Player(String name, int cash, iVehicle car){
		this.name = name;
		this.cash = cash;
		this.car = car;
	}
	
	Player() {}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getCash() {
		return cash;
	}
	
	@Override
	public void addCash(int cash) {
		this.cash += cash;
		
	}
	@Override
	public void setVehicle(iVehicle car) {
		this.car = car;
	}
	@Override
	public iVehicle getVehicle() {
		return car;
	}
	
		
		
	}


package AdventureGameClass;
import java.awt.Component; 
import java.util.ArrayList; 
import java.util.Random;
import java.util.Scanner;

import AdventureGameInterface.IWeaponFactory;
import AdventureGameInterface.iCharacter;


public class character implements iCharacter
{

	private int strength;
	private int dexterity;
	private int Wisdom;
	private int Mana;
	private int hitPoints;
	CharacterFactory player;
	MonsterFactory enemy;
	String name;
	Position location = new Position();
	ArrayList<IWeaponFactory> Inventory = new ArrayList<IWeaponFactory>();
	Die dice;
	boolean alive = true;
	
	Random rand = new Random();
	public String[] monsters;
	
	
	public character()
	{
		dice= new Die();
		this.strength = dice.TwelveSideRollDie();
		this.dexterity = dice.FourSideRollDie() * 3;
		this.Wisdom = dice.TwoSideRollDie() * 6;
		this.Mana = dice.SixSideRollDie() * 2;
		this.hitPoints = dice.TwelveSideRollDie() * 5;
		
	}
	
	public character(int strength, int dexterity, int Wisdom,int Mana, int hitPoints)
	{
		this.strength = strength;
		this.dexterity = dexterity;
		this.Wisdom = Wisdom;
		this.Mana = Mana;
		this.hitPoints = hitPoints; 
		
	}	
	
	public int getHitPoints() {
	
		return hitPoints;
	}

	public void setHitPoints(int hitPoints)
	{
		
		this.hitPoints = hitPoints;
		
		
	}
	
	@Override
	public int getStrength() {
		
		return this.strength;
	}
	
	public void setStrength(int strength)
	{
		
		this.strength = strength;
		
	}
	
	

	public int getDexterity() {
		
		return this.dexterity;
	}
	
	
	public void setDexterity(int dexterity)
	{
		
		this.dexterity = dexterity;
		
	}

	public int getWisdom() {		
		return this.Wisdom;
	}
	
	
	public void setIntelligence(int intelligence, int Wisdom)
	{
		this.Wisdom = Wisdom;
		
	}
	public String getName() 
	{
		
		return this.name;
	}
	public boolean isAlive() 
	{
		return hitPoints > 0;
	}
	@Override
	public int getMana() {
		return this.Mana;
	}

	@Override
	public String getInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Component getPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	public character(iCharacter monster) 
	{	
		if(this.alive == true && monster.getAlive() == true)
		{
			if(this.getDexterity() > monster.getDexterity())
			{
				
				monster.setHitPoints(-this.getStrength());
				monster.deathCheck();
				if(monster.getAlive() == true)
				{
				this.hitPoints -= monster.getStrength();
				this.deathCheck();
				}
	
			}
			
			else if (this.getDexterity() <= monster.getDexterity())
			{
				
				this.setHitPoints(-monster.getStrength());
				this.deathCheck(); 
				if(this.getAlive() == true)
				{
				monster.setHitPoints(this.getHitPoints());
				monster.deathCheck();
				} 
				 	 
			}
			
		}
		this.deathCheck();
	}

	public boolean getAlive()
	{
		return this.alive;
	}
	
	@Override
	public boolean deathCheck() 
	{
		if( this.hitPoints < 1)
		{
			this.alive = false;
			return true;
		}
		return false;
	}

	@Override
	public String attack(iCharacter monster) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String nameholder) {
		
	}
	
	
}
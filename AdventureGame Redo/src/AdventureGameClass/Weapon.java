package AdventureGameClass;
import java.util.Random;

import javax.swing.JPanel;

public class Weapon implements Item 
{
private double Sword;
private double Wand;
private double DoubleDagger;
private double RedPotion;
private double BluePotion;
Random r;

public Weapon()
{
	r = new Random();
	int addvalue=2;
	Sword=1;
	Wand=1;
	DoubleDagger=1;
	RedPotion=2;
	BluePotion=2;
		int random = r.nextInt(5);
	switch (random){
	case 0:
	{
		this.Sword=+addvalue;
	}
	case 1:
	{
		this.Wand=+addvalue;
	}
	case 2:
	{
		this.DoubleDagger=+addvalue;
	}
	case 3:
	{
		this.RedPotion=+addvalue;
	}
	case 4:
	{
		this.BluePotion=+addvalue;
	}
	}
}
	
	public double getPotionStrength() {
	return Sword;
}

public double getPotionIntelligence() {
	return Wand;
}

public double getPotionDexterity() {
	return DoubleDagger;
}

public double getPotionHitPoints() {
	return RedPotion;
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return getName();
}

@Override
public int getDurability() {
	// TODO Auto-generated method stub
	return 5;
}

@Override
public boolean isBroken() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public JPanel getPanel() {
	// TODO Auto-generated method stub
	return null;
}
}

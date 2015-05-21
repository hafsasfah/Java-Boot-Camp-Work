import java.util.*;
public class Items implements iItems {
private double potionStrength;
private double potionIntelligence;
private double potionDexterity;
private double potionHitPoints;

Random r;


public  Items(){
	r = new Random();
	int addvaule=2;
	potionStrength=0;
	potionIntelligence=0;
	potionDexterity=0;
	potionHitPoints=0;
		int random = r.nextInt(4);
	switch (random){
	case 0:{
		this.potionStrength=+addvaule;
	}
	case 1:{
		this.potionIntelligence=+addvaule;
	}
	case 2:{
		this.potionDexterity=+addvaule;
	}
	case 3:{
		this.potionHitPoints=+addvaule;
	}

	}
}
	
	public double getPotionStrength() {
	return potionStrength;
}

public double getPotionIntelligence() {
	return potionIntelligence;
}

public double getPotionDexterity() {
	return potionDexterity;
}

public double getPotionHitPoints() {
	return potionHitPoints;
}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDurability() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBroken() {
		// TODO Auto-generated method stub
		return false;
	}
	

}

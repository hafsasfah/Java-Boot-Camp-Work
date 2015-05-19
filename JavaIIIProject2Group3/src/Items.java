import java.util.*;
public class Items implements iItem {
private double potionStrength;
private double potionIntelligence;
private double potionDexterity;
private double potionHitPoints;

Random r=new Random();


public  void Items(){
	potionStrength=0;
	potionIntelligence=0;
	potionDexterity=0;
	potionHitPoints=0;
	switch (random){
	case 0:{
		potionStrength=+2;
	}
	case 1:{
		potionIntelligence=+2;
	}
	case 2:{
		potionDexterity=+2;
	}
	case 3:{
		potionHitPoints=+2;
	}

	}
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


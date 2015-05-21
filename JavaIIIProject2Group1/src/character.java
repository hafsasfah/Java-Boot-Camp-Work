import java.util.Random;


public class character implements iCharacter{
	
	String name;
	int strength;
	int iQ;
	int dexterity;
	int hP;
	int item;
	

	
public  int getDie() {
	int totalDie= 0;
	for(int i=0; i<=3; i++)
	{
		Random r = new Random();
		int die = r.nextInt(6) +1;
		totalDie = totalDie + die;
	}
	return totalDie;	
}

	public String getName() {
		return this.name;
	}

	public int getStrength() {
		getDie();
		return this.strength;
	}
	
	public int getiQ() {
		getDie();
		return this.iQ;
	}
	
	
	public int getDexterity() {
		getDie();
		return this.dexterity;
	}
	

	public int gethP() {
		getDie();
		return this.hP;
	}
	

	public int getItem() {
		return this.item;
	}

}

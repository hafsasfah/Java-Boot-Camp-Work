import java.util.Random;


public class Die implements DiceRoll {
	
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
}
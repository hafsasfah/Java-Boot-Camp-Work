import java.util.Random;


public class Die implements iDie {
	
	private int sides;
	private int value;
	private Random random;
	
	public Die( int sides )
	{
		this.sides = sides;
		random = new Random();
	}
	@Override
	public int roll() {
		value = random.nextInt(sides) + 1;
		return value;
	}

	@Override
	public int getValue() {
		return value;
	}

}

import java.util.Random;


public class Die {
	private static Random random;
	
	public static int roll3D6(){ // For Player Stats: Str, Dex, Int
		random = new Random();
		int sides;
		int total = 0;
		int rolls = 3;
		for (int i = 0; i < rolls; i++){
			sides = random.nextInt(6) + 1; //3D6
			total += sides;
		}
		return total;
	}
	
	public static int roll1To6D3() { // For NPC Stats: Str, Dex, Int, HP
		random = new Random();
		int sides; 
		int total = 0;
		int rolls = random.nextInt(6) + 1;
		for (int i = 0; i < rolls; i++){
			sides = random.nextInt(3) + 1;
			total += sides;
		}
		return total;
	}
	
	public static int roll1D15() { // Some attacks.
		random = new Random();
		return (int) random.nextInt(15) + 1;
	}
	
	public static int roll1D20() { // Find gold. Some attacks.
		random = new Random();
		return (int) random.nextInt(20) + 1;
	}

}

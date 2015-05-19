
public class Dice {
	
	public static int dice3D6(){ // For Player Stats: Str, Dex, Int
		int sides;
		int total = 0;
		int rolls = (int) Math.floor(Math.random()*3) + 1;
		for (int i = 0; i < rolls; i++){
			sides = (int) Math.floor(Math.random()*4) + 3; //3D6
			total += sides;
		}
		return total;
	}
	
	public static int dice1To6D3() { // For NPC Stats: Str, Dex, Int, HP
		int sides; 
		int total = 0;
		int rolls = (int) Math.floor(Math.random()*6) + 1;
		for (int i = 0; i < rolls; i++){
			sides = (int) Math.floor(Math.random()*3) + 1;
			total += sides;
		}
		return total;
	}
	
	public static int dice1D15() { // Some attacks.
		return (int) Math.floor(Math.random()*15) + 1;
	}
	
	public static int dice1D20() { // Find gold. Some attacks.
		return (int) Math.floor(Math.random()*20) + 1;
	}

}

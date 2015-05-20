
public class Die {
	
	public static int roll3D6(){ // For Player Stats: Str, Dex, Int
		int sides;
		int total = 0;
		int rolls = 3;
		for (int i = 0; i < rolls; i++){
			sides = (int) Math.floor(Math.random()*6) + 1; //3D6
			total += sides;
		}
		return total;
	}
	
	public static int roll1To6D3() { // For NPC Stats: Str, Dex, Int, HP
		int sides; 
		int total = 0;
		int rolls = (int) Math.floor(Math.random()*6) + 1;
		for (int i = 0; i < rolls; i++){
			sides = (int) Math.floor(Math.random()*3) + 1;
			total += sides;
		}
		return total;
	}
	
	public static int roll1D15() { // Some attacks.
		return (int) Math.floor(Math.random()*15) + 1;
	}
	
	public static int roll1D20() { // Find gold. Some attacks.
		return (int) Math.floor(Math.random()*20) + 1;
	}

}

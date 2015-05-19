import java.util.Random;


public class DiceRoll {
	static Random r =  new Random();
	static Random r2 = new Random();
	static Random r3 = new Random();
	static Random r4 = new Random();
	
	static int roll1 = r.nextInt(6)+1;
	static int roll2  = r2.nextInt(6)+1; 
	static int roll3  = r3.nextInt(6)+1;
	static int roll4   = r4.nextInt(6)+1;
	
	
	
	
	 switch (roll1) {
     case 1:  "2 Orcs and 1 Dragon are in this room"
    	 			break;
     case 2:   "1 Orcs,2 Dragons and 5 wolves are in this room"
	 				break;
     case 3:   "1 Orc and 6 Dragons are in this room"
	 				break;
     case 4:  "9 Orcs and 2 Dragons are in this room"
	 				break;
     case 5:   "5 Orcs and 1 wolf are in this room"
	 				break;
     case 6:  "3 Orcs, 2 wolves and 3 Dragons are in this room"
	 				break;
	 }
	
}



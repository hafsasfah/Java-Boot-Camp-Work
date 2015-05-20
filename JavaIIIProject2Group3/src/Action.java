public class Action {

	public static void attack(Party players, Party NPC) {	
		Character[] pc = players.getCharacter();
		Character[] npc = NPC.getCharacter();
		
		int pcTotalAttack = 0; 
		int npcTotalAttack = 0;
		int pcSize = pc.length;
		int npcSize = npc.length;
		
		for (Character c : pc) {
			pcTotalAttack += c.getStrength();
		}
		
		pcTotalAttack /= npcSize;
		
		for (Character nc : npc) {
			npcTotalAttack+= nc.getStrength();
		}
		
		npcTotalAttack /= pcSize;
		
		players.setCharacter(pc);
		NPC.setCharacter(npc);
		
	}
	
	public static int sleep(int playerHitPoints) {
		playerHitPoints += 1;
		return playerHitPoints;
	}
	
	public static int run(int playerHitPoints) {
		// TEMP: update certain buttons to be disabled later
		playerHitPoints -= 1; // damage is 1 upon being a coward
		return playerHitPoints;
	}
	
	public static int haraKiri() {
		return 0;
	}
}
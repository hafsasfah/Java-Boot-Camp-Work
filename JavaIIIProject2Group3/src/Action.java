public class Action {

	public static void attack(Party players, Party NPC) {	
		iCharacter[] pc = players.getCharacter();
		iCharacter[] npc = NPC.getCharacter();
		
		int pcTotalAttack = 0; 
		int npcTotalAttack = 0;
		int pcSize = 0;
		int npcSize = 0;
		
		for (iCharacter c : pc) {
			if (c.isAlive()){
				pcSize += 1;
				pcTotalAttack += c.getStrength();
			}
		}
		
		for (iCharacter nc : npc) {
			if (nc.isAlive()){
				npcSize += 1;
				npcTotalAttack+= nc.getStrength();
			}
		}
		
		pcTotalAttack = npcSize>0 ? pcTotalAttack/npcSize:1;
		npcTotalAttack /= pcSize;
		
		
		
		for (iCharacter c : pc) {
			c.setHitPoints(c.getHitPoints()-npcTotalAttack);
		}
		
		for (iCharacter nc : npc) {
			nc.setHitPoints(nc.getHitPoints()-pcTotalAttack);
		}
		
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
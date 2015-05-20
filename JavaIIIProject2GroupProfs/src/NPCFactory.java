public class NPCFactory implements ICharacterFactory {

	private String[] types = { "Goblin", "Orc", "Minotaur", "Centaur", "Golem", "Dragon" };
	
	@Override
	public ICharacter createCharacter() {
		Die sixSidedDie = new Die(6);
		Die npcTypeDie = new Die( types.length );
		int npcTypeRoll = npcTypeDie.roll();
		ICharacter npc = new Character( types[ npcTypeRoll - 1], 
			sixSidedDie.sumOfXRolls(npcTypeRoll), sixSidedDie.sumOfXRolls(npcTypeRoll), 
			sixSidedDie.sumOfXRolls(npcTypeRoll), sixSidedDie.sumOfXRolls(npcTypeRoll));
		
		return npc;
	}
}

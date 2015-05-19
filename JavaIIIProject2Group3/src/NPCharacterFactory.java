
public class NPCharacterFactory implements iCharacterFactory {
// fight run sleep
		
	public NPCharacterFactory() {}

	@Override
	public iCharacter createCharacter() {
				
		int strength = Die.roll1To6D3(); 
		int dexterity = Die.roll1To6D3();
		int hitPoints = Die.roll1To6D3();
		int intelligence = Die.roll1To6D3();	
		
		return new Character("NPC 1", "Dragon", strength, dexterity, hitPoints, intelligence);
	}
	
	

}

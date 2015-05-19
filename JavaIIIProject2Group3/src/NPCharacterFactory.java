public class NPCharacterFactory implements iCharacterFactory {

	@Override
	public iCharacter createCharacter() {
		// TEMP: need to add a random name and type generator later
		
		int strength = Die.roll1To6D3(); 
		int dexterity = Die.roll1To6D3();
		int hitPoints = Die.roll1To6D3();
		int intelligence = Die.roll1To6D3();
		
		return new Character("Monster", "Mexican Cartel", strength, dexterity, hitPoints, intelligence);
	}

	@Override
	public iCharacter createCharacter(String name, String type) {
		return null;
	}	
}
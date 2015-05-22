public class PlayerCharacterFactory implements iCharacterFactory {

	@Override
	public iCharacter createCharacter(String name, String type) {
		
		int strength = Die.roll3D6(); 
		int dexterity = Die.roll3D6();
		int hitPoints = 20;
		int intelligence = Die.roll3D6();
		
		return new Character(name, type, strength, dexterity, hitPoints, intelligence);
	}

	@Override
	public iCharacter createCharacter() {
		return null;
	}
}

public class PlayerCharacterFactory implements iCharacterFactory {
// fight run sleep

	
	public PlayerCharacterFactory() {}

	@Override
	public iCharacter createCharacter() {
		int strength = Die.roll3D6(); 
		int dexterity = Die.roll3D6();
		int hitPoints = 20;
		int intelligence = Die.roll3D6();
		
		return new Character("Player 1", "Warrior", strength, dexterity, hitPoints, intelligence);
	}
}

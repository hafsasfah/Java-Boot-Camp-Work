
public class NpcCharacterFactory implements iCharacterFactory{

	@Override
	public iCharacter getCharacter() {
		
		
		
		return new Player();
	}

}

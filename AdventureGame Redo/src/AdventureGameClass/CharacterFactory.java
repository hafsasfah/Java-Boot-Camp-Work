package AdventureGameClass;

import AdventureGameInterface.iCharacter;
import AdventureGameInterface.iCharacterFactory;

public class CharacterFactory implements iCharacterFactory {

		
		
		
		@Override
		public iCharacter getCharacter() {
		return new character();
		}

		@Override
		public iCharacter createcharacter() {
			return new character();
		}

		public iCharacter createCharacter(String string, String string2) {
			// TODO Auto-generated method stub
			return new character();
		}

		
}

package AdventureGameInterface;
import javax.swing.JPanel;


public interface iParty {
		iCharacter[] getCharacters();
		boolean isAnyCharacterInPartyAlive();
		iCharacter getRandomAliveCharacter();
		String attack( iCharacter target );
		JPanel getPanel();
	}


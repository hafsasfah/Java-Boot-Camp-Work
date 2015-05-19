import javax.swing.JPanel;


public interface IParty {
	ICharacter[] getCharacters();
	boolean isAnyCharacterInPartyAlive();
	ICharacter getRandomAliveCharacter();
	String attack( ICharacter target );
	JPanel getPanel();
}

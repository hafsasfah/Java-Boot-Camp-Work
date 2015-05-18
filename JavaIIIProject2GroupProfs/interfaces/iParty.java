import javax.swing.JPanel;


public interface IParty {
	ICharacter[] getCharacters();
	boolean isAnyCharacterInPartyAlive();
	String attack( ICharacter target );
	JPanel getPanel();
}

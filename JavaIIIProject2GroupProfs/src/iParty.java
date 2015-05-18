import javax.swing.JPanel;


public interface iParty {
	iCharacter[] getCharacters();
	boolean isAnyCharacterInPartyAlive();
	String attack( iCharacter target );
	JPanel getPanel();
}

import javax.swing.*;

public class Party implements iParty {

	private iCharacter[] characters;
	private JPanel panel;
	
	public Party( iCharacter[] characters )
	{
		this.characters = characters;
		panel = new JPanel();
		panel.add ( new JLabel("Party"));
	}
	
	@Override
	public iCharacter[] getCharacters() {
		return characters;
	}

	@Override
	public boolean isAnyCharacterInPartyAlive() {
		for ( iCharacter character : characters )
		{
			if ( character.isAlive() )
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public String attack(iCharacter target) {
		String result = "";
		for ( iCharacter character : characters )
		{
			if ( character.isAlive() && target.isAlive() )
			{
				result += character.attack( target ) + "\n";
			}
		}
		return result;
	}

	@Override
	public JPanel getPanel() {
		return panel;
	}

}

import javax.swing.*;

public class Party implements IParty {

	private ICharacter[] characters;
	private JPanel panel;
	
	public Party( ICharacter[] characters )
	{
		this.characters = characters;
		panel = new JPanel();
		panel.add ( new JLabel("Party"));
	}
	
	@Override
	public ICharacter[] getCharacters() {
		return characters;
	}

	@Override
	public boolean isAnyCharacterInPartyAlive() {
		for ( ICharacter character : characters )
		{
			if ( character.isAlive() )
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public String attack(ICharacter target) {
		String result = "";
		for ( ICharacter character : characters )
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

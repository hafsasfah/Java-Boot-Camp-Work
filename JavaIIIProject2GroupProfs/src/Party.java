import java.awt.GridLayout;
import java.util.Random;

import javax.swing.*;

public class Party implements IParty {

	private ICharacter[] characters;
	private JPanel panel;
	
	public Party( ICharacter[] characters )
	{
		this.characters = characters;
		panel = new JPanel();
		panel.setLayout( new GridLayout( characters.length, 1) );
		for ( ICharacter character : characters )
		{
			panel.add( character.getPanel() );
		}
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

	@Override
	public ICharacter getRandomAliveCharacter() {
		if ( !isAnyCharacterInPartyAlive() )
		{
			return null;
		}
		
		Random random = new Random();
		ICharacter randomAlivePlayer;
		
		do
		{
			randomAlivePlayer = characters[ random.nextInt( characters.length ) ];
		} while (!randomAlivePlayer.isAlive());
		
		return randomAlivePlayer;	
	}

}

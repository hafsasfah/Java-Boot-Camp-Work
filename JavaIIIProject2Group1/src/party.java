
import java.awt.GridLayout;
	import java.util.Random;

	import javax.swing.*;

	public class party implements iParty {

		private iCharacter[] characters;
		private JPanel panel;
		
		public party( iCharacter[] characters )
		{
			this.characters = characters;
			panel = new JPanel();
			panel.setLayout( new GridLayout( characters.length, 1) );
			for ( iCharacter character : characters )
			{
				panel.add( character.getPanel() );
			}
		}
		
		
		public iCharacter[] getCharacters() {
			return characters;
		}

		
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

		
		public JPanel getPanel() {
			return panel;
		}

	
		public iCharacter getRandomAliveCharacter() {
			if ( !isAnyCharacterInPartyAlive() )
			{
				return null;
			}
			
			Random random = new Random();
			iCharacter randomAlivePlayer;
			
			do
			{
				randomAlivePlayer = characters[ random.nextInt( characters.length ) ];
			} while (!randomAlivePlayer.isAlive());
			
			return randomAlivePlayer;	
		}

	}
}

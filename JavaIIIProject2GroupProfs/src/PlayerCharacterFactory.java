
public class PlayerCharacterFactory implements ICharacterFactory {

	private String playerName;

	public PlayerCharacterFactory( String playerName )
	{
		this.playerName = playerName;
	}
	
	@Override
	public ICharacter createCharacter() {
		Die sixSidedDie = new Die(6);
		
		return new Character(playerName, 20, sixSidedDie.sumOfXRolls(3), sixSidedDie.sumOfXRolls(3), sixSidedDie.sumOfXRolls(3) );
	}

}

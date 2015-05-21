import java.util.Random;

public class RandomRoomFactory implements IRoomFactory {

	private String[] names = { "Hallway", "Celler", "Cave", "Library", "Bedroom", "Kitchen" };
	private ICharacterFactory npcFactory;
	private final int MAX_GOLD = 20;
	private final int MAX_NPCS_IN_ROOM = 6;
	
	public RandomRoomFactory( ICharacterFactory npcFactory )
	{
		this.npcFactory = npcFactory;
	}
	
	@Override
	public IRoom createRoom() {
		Random random = new Random();
		
		int numberOfNpcs = random.nextInt(MAX_NPCS_IN_ROOM);
		
		ICharacter[] npcs = new ICharacter[ numberOfNpcs ];
		
		for ( int index = 0; index < npcs.length; index++ )
		{
			npcs[index] = npcFactory.createCharacter();
		}
		
		IRoom room = new Room( names[ random.nextInt( names.length ) ], new Party( npcs ), random.nextInt(MAX_GOLD + 1) );
		
		return room;
	}

}

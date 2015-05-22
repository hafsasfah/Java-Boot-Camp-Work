	import java.util.Random;

	public class RandomRoom implements NewRoom
	{

		private String[] names = {};
		private iCharacterFactory npcFactory;
		private final int MAX_NPCS_IN_ROOM = 6;
		
		public RandomRoom( iCharacterFactory npcFactory )
		{
			this.npcFactory = npcFactory;
		}
		
		public iRoom createRoom() {
			Random random = new Random();
			
			int numberOfNpcs = random.nextInt(MAX_NPCS_IN_ROOM);
			
			iCharacter[] npcs = new iCharacter[ numberOfNpcs ];
			
			for ( int index = 0; index < npcs.length; index++ )
			{
				npcs[index] = npcFactory.createcharacter();
			}
			
			iRoom room = new oom( names[ random.nextInt( names.length ) ], new party( npcs ) );
			
			return room;
		}

	}


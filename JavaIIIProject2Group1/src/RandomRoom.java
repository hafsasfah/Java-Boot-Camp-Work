	import java.util.Random;

	public class RandomRoom implements iRoomFactory {

		private String[] names = { "Hallway", "Celler", "Cave", "Library", "Bedroom", "Kitchen" };
		private iCharacterFactory npcFactory;
		private final int MAX_GOLD = 20;
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
				npcs[index] = npcFactory.createCharacter();
			}
			
			IRoom room = new Room( names[ random.nextInt( names.length ) ], new Party( npcs ) );
			
			return room;
		}

	}


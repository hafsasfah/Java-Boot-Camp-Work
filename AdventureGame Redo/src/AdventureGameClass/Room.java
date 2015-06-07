package AdventureGameClass;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import AdventureGameInterface.iParty;
import AdventureGameInterface.iRoom;


	public class Room implements iRoom
	{
		String story = ("Test Room");
		String monsters = "";
		Position Pos = new Position();
		ArrayList<character> container;
		ArrayList<character> Monstercontainer;
		public void describeRoom(String story)
		{
				this.story = story;
		}
		
		@Override
		public String roomDescription() 
		{
			return this.story + monsters;
		}
		public Room(int x, int y)
		{
			this.Pos.setRow(x);
			this.Pos.setColumn(y);
			container = new ArrayList<character>();
			Monstercontainer = new ArrayList<character>();
			generateMonsters();
		}
		public void enterRoom()
		{
			String MonsterHolder = "";
			if(!(this.Monstercontainer.isEmpty()))
			{
				for(int x = 0; x <= this.Monstercontainer.size() - 1; x++)
				{
					MonsterHolder += this.Monstercontainer.get(x).name + " ";
				}
				this.monsters = "\nThe monsters in this room are: " + MonsterHolder + ".";
			}
			else
				this.monsters = "";
		}
		public void generateMonsters() 
		{
			Die dice = new Die();
			int genMon = dice.monsterDie();
			int pickname = dice.rollDieAmountOfTimes(1);
			if(genMon > 4)
			{
				String nameholder = "";
				character monster = new character(6,dice.monsterDie(),dice.monsterDie(),dice.monsterDie(), pickname);
				nameholder = monster.monsters[pickname + 1];
				monster.setName(nameholder); 
				this.Monstercontainer.add(monster);
			}
			
		}
	@Override
	public String getName() {
		
		
		return getName();
	}

	@Override
	public iParty getNPCParty() {
		
		return getNPCParty();
	}

	@Override
	public JPanel getPanel() {
		
		
		return getPanel();
	}

/*public abstract class Room implements iRoom
{
	
	String name;
	iParty NPCParty;
	JPanel Panel;
	
	public Room( String name, iParty npcParty)
	{
		this.name = name;
		this.NPCParty = NPCParty;
		Panel = new JPanel();
		Panel.add( new JLabel("Room"));
		Panel.add( new JLabel(name));
		
	}*/

}
	

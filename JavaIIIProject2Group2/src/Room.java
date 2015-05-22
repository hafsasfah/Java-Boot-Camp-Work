import java.util.ArrayList;


public class Room implements iRoom
{
	String story = ("A plain dungeon room.");
	String monsters = "";
	Coordinates cord = new Coordinates();
	ArrayList<Player> container;
	ArrayList<Player> Monstercontainer;

	
	public Room(int i, int k)
	{
		this.cord.setRow(i);
		this.cord.setColumn(k);
		container = new ArrayList<Player>();
		Monstercontainer = new ArrayList<Player>();
		generateMonsters();
	}
	public void enterRoom()
	{
		String MonsterHolder = "";
		if(!(this.Monstercontainer.isEmpty()))
		{
			for(int i = 0; i <= this.Monstercontainer.size() - 1; i++)
			{
				MonsterHolder += this.Monstercontainer.get(i).name + " ";
			}
			this.monsters = "\nThe monsters in this room are: " + MonsterHolder + ".";
		}
		else
			this.monsters = "";
	}
	
	@Override
	public void generateMonsters() 
	{
		Dice dice = new Dice();
		int genMon = dice.monsterDie();
		int pickname = dice.rollDieAmountOfTimes(1);
		if(genMon > 4)
		{
			String nameholder = "";
			Player critter = new Player(6,dice.monsterDie(),dice.monsterDie(),dice.monsterDie());
			nameholder = critter.monsters[pickname - 1];
			critter.setName(nameholder); 
			this.Monstercontainer.add(critter);
		}
		
	}

	@Override
	public void generateItems() 
	{
		// TODO Auto-generated method stub
		
	}

	public void describeRoom(String story)
	{
			this.story = story;
	}
	
	@Override
	public String roomDescription() 
	{
		return this.story + monsters;
	}
	
	@Override
	public String toString()
	{
		return "9";
	}

}

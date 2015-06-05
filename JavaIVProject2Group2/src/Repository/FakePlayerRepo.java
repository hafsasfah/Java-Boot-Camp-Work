package Repository;

import java.util.LinkedList;
import java.util.List;

import Models.Player;

public class FakePlayerRepo {
	
public static List<Player> get() {

		List<Player> players = new LinkedList<Player>();
		players.add(new Player("Player1",100));
		players.add(new Player("Player2",100));
		players.add(new Player("Player3",100));
		return players;
		
	}

public boolean create(Player player) {
	// TODO Auto-generated method stub
	return false;
}

	
	}



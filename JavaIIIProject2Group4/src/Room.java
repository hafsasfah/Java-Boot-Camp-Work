import java.util.Random;
import java.util.Scanner;
public class Room extends DiceRoll{

	public Room(String string) {
	
	}
	public static void main(String[] args) {
		
	}
	Scanner in = new Scanner(System.in);

	public static final Room NORTH = new Room("North");
	public static final Room EAST  = new Room("East");
	public static final Room SOUTH = new Room("South");
	public static final Room WEST  = new Room("West");


	public static int getNorth() {
		return dice3t1;
	}
	public static Room getEast() {
		return EAST;
	}
	public static Room getSouth() {
		return SOUTH;
	}
	public static Room getWest() {
		return WEST;
	}
	
	

	}



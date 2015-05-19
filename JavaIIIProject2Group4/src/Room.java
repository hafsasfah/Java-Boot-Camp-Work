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
		return roll1*3;
	}
	public static int getEast() {
		return roll2*3;
	}
	public static int getSouth() {
		return roll3*3;
	}
	public static int getWest() {
		return roll4*3;
	}
	
	

	}



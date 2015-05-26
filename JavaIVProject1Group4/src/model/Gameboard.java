package model;


import javax.swing.JOptionPane;

public class Gameboard implements iGameboard{
	Player[] players;
	Property[] properties;
	final int NUM_OF_PROPS = 36;
	//Dice die;
	public static void main(String [] args){
		Gameboard board = new Gameboard();
		for(Player x : board.getPlayers()){
			System.out.println(x.getName());
		}
		for(Property prop: board.getProperties()){
			System.out.println(prop.getTitle());
		}
	}
	
	public Gameboard(){//Update to read data from repo
		int numberOfPlayers = Integer.parseInt(JOptionPane.showInputDialog("Enter number of players"));
		players = new Player[numberOfPlayers];
		properties = new Property[NUM_OF_PROPS];
		//die = new DICE();
		buildPlayerArray(numberOfPlayers);
		buildProperties();
	}
	private void buildProperties(){
		for(int i=0;i<NUM_OF_PROPS ;i++){
			properties[i]= new Property("Property "+i);
		}
	}
	
	private void buildPlayerArray(int numberOfPlayers){
		
		for (int i = 0;i<numberOfPlayers;i++){
			players[i]=new Player(JOptionPane.showInputDialog("Enter Player "+(i+1)+" name." ));
		}
	}
	
	@Override
	public Player[] getPlayers() {
		
		return players;
	}

	@Override
	public Property[] getProperties() {
		return properties;
	}

	@Override
	public Property getProperty(int index) {
		return properties[index];
	}

	@Override
	public Player getPlayer(int index) {
		
		return players[index];
	}

}

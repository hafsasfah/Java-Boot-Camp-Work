package views;

import java.util.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

import models.Player;

public class PlayerView implements IPlayerView{

private Player player;

private JLabel playerCash;
private JLabel currentLocation;
private JLabel purchaseProperty;
	
	public PlayerView(Player player){
		this.player= player;
		playerCash = new JLabel();
		currentLocation= new JLabel();
		purchaseProperty= new JLabel();
		update(null,null);
}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JPanel getPlayerPanel() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}


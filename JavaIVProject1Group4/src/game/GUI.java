package game;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import view.GameboardView;
import view.PlayerView;
import view.PropertyView;

public class GUI extends JFrame{
	PlayerView playerView;
	PropertyView propView;
	GameboardView gameboardView;
	
	
	public GUI(){
		super("Brandon's Slumlord Adventure");
		
		playerView = new PlayerView();
		propView = new PropertyView();
		gameboardView = new GameboardView();
		
		this.setLayout(new BorderLayout());
		add(playerView.getPanel(),BorderLayout.EAST);
		add(propView.getPanel(),BorderLayout.WEST);
		add(gameboardView.getPanel());
		
	}
	
	

}

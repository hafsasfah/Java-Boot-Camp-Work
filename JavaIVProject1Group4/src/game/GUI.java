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
	
	
	public GUI(	PlayerView playerView,PropertyView propView,GameboardView gameboardView){
		super("Brandon's Slumlord Adventure");
		
		this.playerView =  playerView;
		this.propView = propView;
		this.gameboardView = gameboardView;
		
		this.setLayout(new BorderLayout());
		add(playerView.getPanel(),BorderLayout.EAST);
		add(propView.getPanel(),BorderLayout.WEST);
		add(gameboardView.getPanel());
		
	}
	
	

}

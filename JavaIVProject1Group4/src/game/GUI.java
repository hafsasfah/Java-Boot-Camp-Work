package game;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import view.PlayerView;
import view.PropertyView;

public class GUI extends JFrame{
	PlayerView playerView;
	PropertyView propView;
	
	
	public GUI(){
		super("Brandon's Slumlord Adventure");
		
		playerView = new PlayerView();
		propView = new PropertyView();
		
		this.setLayout(new BorderLayout());
		add(playerView.getPanel(),BorderLayout.EAST);
		add(propView.getPanel(),BorderLayout.WEST);
		
	}
	
	

}

package views;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import models.Players;

public interface iPlayersView extends Observer {
	
	JPanel translateJframes(Players player);

	void update(Observable o, Object arg);
}
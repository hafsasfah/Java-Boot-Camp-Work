package views;

import java.util.Observer;

import javax.swing.JPanel;

public interface IGameView extends Observer {
	JPanel getGameView();
}

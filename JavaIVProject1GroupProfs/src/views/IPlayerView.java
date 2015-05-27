package views;

import java.util.Observer;

import javax.swing.JPanel;

public interface IPlayerView extends Observer {
	JPanel getPlayerPanel();
}

package views;
import java.util.Observer;
import javax.swing.JPanel;

public interface iPlayersView extends Observer {
	
	JPanel getPlayerPanel();
}
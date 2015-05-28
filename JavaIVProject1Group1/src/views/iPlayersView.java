package views;
import java.util.Observer;
import javax.swing.JPanel;

public interface iPlayersView extends Observer {
	
	JPanel translateJframes();
	void getPlayers();
	void nextTurn(int x);
}
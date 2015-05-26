package views;
import java.util.Observer;
import javax.swing.JPanel;

public interface iPlayerView extends Observer {
	JPanel getPlayerPanel();
}
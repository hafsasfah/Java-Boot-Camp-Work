package views;
import java.util.Observer;
import javax.swing.JPanel;

public interface IView extends  Observer {

	JPanel getGameView();
}

package views;
import java.util.Observer;
import javax.swing.JPanel;


public interface iPropertyView extends Observer 
{
	JPanel getPlayerPanel();
}

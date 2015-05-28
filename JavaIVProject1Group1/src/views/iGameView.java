package views;

import java.util.Observer;
import javax.swing.JPanel;

public interface iGameView extends Observer 
{
	JPanel getGameView();
}
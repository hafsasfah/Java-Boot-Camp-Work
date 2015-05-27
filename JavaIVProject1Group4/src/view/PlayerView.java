package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import model.Player;

public class PlayerView implements Observer{
	JPanel panel ;
	JLabel label;
	Player player;
	
	public PlayerView(){
		player = Controller.getCurrentPlayer();
		
		panel = new JPanel();
		label = new JLabel();
		label.setText("<html>"+player.getName()+"<br>" +player.getCash() + "</html>");
		panel.add(label);
				
	}
	public JPanel getPanel(){
		return panel;
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}

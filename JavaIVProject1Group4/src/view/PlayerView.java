package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Player;

public class PlayerView {
	JPanel panel ;
	JLabel label;
	
	public PlayerView(Player player){
		panel = new JPanel();
		label = new JLabel();
		label.setText("<html>"+player.getName()+"<br>" +player.getCash() + "</html>");
		panel.add(label);
				
	}
	public JPanel getPanel(){
		return panel;
	}

}

package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import model.Player;
import model.Property;

public class PlayerView implements Observer{
	JPanel panel ;
	JLabel label;
	Player player;
	
	public PlayerView(){
	
		panel = new JPanel();
		label = new JLabel();
		buildLabel();
		panel.add(label);
				
	}
	public JPanel getPanel(){
		return panel;
	}
	private void buildLabel(){
		player = Controller.getCurrentPlayer();
		String labelString = "";
		for(Property prop:player.getPlayerOwnedProperties()){
			labelString += "<br>" +prop.getTitle() + "<br>Rent: $"+ prop.getRent();
			
		}
		label.setText("<html>"+player.getName()+"<br>" +player.getCash() +labelString +"</html>");
		
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		buildLabel();
		
	}

}

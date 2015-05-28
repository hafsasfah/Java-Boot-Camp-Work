package views;

import java.awt.GridLayout;
import java.util.Observable;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.IGameController;
import models.AbstractPlayer;
import models.AbstractProperty;

public class PlayerView implements IPlayerView {

	private AbstractPlayer player;
	
	private JPanel panel;
	
	private JLabel nameLabel;
	private JLabel moneyLabel;
	private JLabel currentLocationLabel;
	private JLabel propertyLabel;
	
	public PlayerView( AbstractPlayer player )
	{
		this.player = player;
		
		panel = new JPanel();
		panel.setLayout( new GridLayout( 3, 1 ));
		nameLabel = new JLabel( player.getName() );
		moneyLabel = new JLabel();
		currentLocationLabel = new JLabel();
		propertyLabel = new JLabel();
		
		
		panel.add(nameLabel);
		panel.add(moneyLabel);
		panel.add(propertyLabel);
		
		update(null,null);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		moneyLabel.setText("Money: " + player.getMoney() );
		currentLocationLabel.setText( "Parked: " + player.getCurrentLocation().getName() );
		propertyLabel.setText( createPropertyLabelString() );
	}

	@Override
	public JPanel getPlayerPanel() {
		return panel;
	}
	
	private String createPropertyLabelString()
	{
		String properties = "";
		for ( AbstractProperty property : player.getOwnedProperties() )
		{
			properties += property.getName() + "</br>";
		}
		return properties;
	}

}

package views;

import java.awt.*;
import java.util.Observable;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import models.*;

public class PlayerView implements IPlayerView {

	private AbstractPlayer player;
	
	private JPanel panel;
	private JLabel moneyLabel;
	private JLabel currentLocationLabel;
	private JLabel propertyLabel;
	
	public PlayerView( AbstractPlayer player )
	{
		this.player = player;
		player.addObserver(this);
		
		panel = new JPanel();
		panel.setLayout( new BorderLayout() );
		panel.setBorder( BorderFactory.createTitledBorder( player.getName() ));
		moneyLabel = new JLabel();
		currentLocationLabel = new JLabel();
		propertyLabel = new JLabel();
		propertyLabel.setVerticalAlignment(SwingConstants.TOP);
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout( new GridLayout( 2, 1 ) );
		
		northPanel.add( moneyLabel );
		northPanel.add( currentLocationLabel );
		
		panel.add(northPanel, BorderLayout.NORTH );
		panel.add(propertyLabel, BorderLayout.WEST );
		
		update(null,null);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if ( player.hasLostGame() )
		{
			panel.setBorder(BorderFactory.createTitledBorder(null, player.getName(), TitledBorder.LEFT, TitledBorder.TOP, BorderFactory.createTitledBorder("").getTitleFont(), Color.RED));
			currentLocationLabel.setText("");
			propertyLabel.setText("");
			moneyLabel.setForeground( Color.RED );
		}
		else
		{
			currentLocationLabel.setText( "On: " + player.getCurrentLocation().getName() );
			propertyLabel.setText( createPropertyLabelString() );
		}
		
		moneyLabel.setText("Money: " + player.getMoney() );
	}

	@Override
	public JPanel getPlayerPanel() {
		return panel;
	}
	
	private String createPropertyLabelString()
	{
		String properties = "<html>Owns:<br>";
		for ( AbstractProperty property : player.getOwnedProperties() )
		{
			properties += property.getName() + "<br>";
		}
		
		properties += "</html>";
		
		return properties;
	}

}

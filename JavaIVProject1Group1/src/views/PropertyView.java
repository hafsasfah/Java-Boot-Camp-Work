package views;

import java.util.Observable;

import javax.swing.JPanel;

import models.Property;

public class PropertyView implements iPropertyView {
	
	public PropertyView(Property property) {
		property.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		
		//moneyLabel.setText("Money: " + player.getMoney() );
		//propertyLabel.setText( player.getOwnedProperties().toArray().toString() );
	}

	@Override
	public JPanel getPropertyPanel() {
		// TODO Auto-generated method stub
		return null;
	}

}

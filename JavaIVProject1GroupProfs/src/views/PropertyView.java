package views;

import java.util.Observable;

import javax.swing.JLabel;
import javax.swing.JPanel;

import models.AbstractPlayer;
import models.AbstractProperty;

public class PropertyView implements IPropertyView {

	private AbstractProperty property;
	private JPanel panel;
	private JLabel nameLabel;
	private JLabel ownerLabel;
	private JLabel purchasePriceLabel;
	private JLabel rentalPriceLabel;
	private JLabel parkedPlayersLabel;
	
	public PropertyView( AbstractProperty property )
	{
		this.property = property;
		panel = new JPanel();
		nameLabel = new JLabel( property.getName() );
		ownerLabel = new JLabel();
		purchasePriceLabel = new JLabel();
		rentalPriceLabel = new JLabel();
		parkedPlayersLabel = new JLabel();
		
		panel.add( nameLabel );
		panel.add( ownerLabel );
		panel.add( purchasePriceLabel );
		panel.add( rentalPriceLabel );
		panel.add( parkedPlayersLabel );
		
		update(null,null);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		ownerLabel.setText( "Owner:" + property.getOwner().getName() );
		purchasePriceLabel.setText( "Purchase Price: " + property.getPurchasePrice() );
		rentalPriceLabel.setText( "Rental Price: " + property.getRentalPrice() );
		parkedPlayersLabel.setText( createParkedPlayersLabelString() );
	}
	
	@Override
	public JPanel getPropertyView() {
		return panel;
	}
	
	private String createParkedPlayersLabelString()
	{
		String result = "";
		
		for ( AbstractPlayer player : property.getParkedPlayers() )
		{
			result += ( player.getName() + "</br>" );
		}
		
		return result;
	}
}

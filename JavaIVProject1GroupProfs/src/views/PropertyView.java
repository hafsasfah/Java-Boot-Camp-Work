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
	private JLabel purchasePriceLabel;
	private JLabel rentalPriceLabel;
	private JLabel parkedPlayersLabel;

	public PropertyView( AbstractProperty property )
	{
		this.property = property;
		panel = new JPanel();
		nameLabel = new JLabel( property.getName() );
		purchasePriceLabel = new JLabel( Integer.toString(property.getPurchasePrice()) );
		rentalPriceLabel = new JLabel( Integer.toString(property.getRentalPrice() ) );
		parkedPlayersLabel = new JLabel(createParkedPlayersLabelString());
	}
	
	@Override
	public void update(Observable o, Object arg) {
		nameLabel.setText( property.getName() );
		purchasePriceLabel.setText( Integer.toString(property.getPurchasePrice()) );
		rentalPriceLabel.setText( Integer.toString(property.getRentalPrice() ) );
		parkedPlayersLabel.setText( createParkedPlayersLabelString());
		
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

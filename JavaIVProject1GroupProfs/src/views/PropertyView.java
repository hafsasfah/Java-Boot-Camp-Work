package views;

import java.util.Observable;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.AbstractPlayer;
import models.AbstractProperty;

public class PropertyView implements IPropertyView {

	private AbstractProperty property;
	private JPanel panel;
	private JLabel ownerLabel;
	private JLabel purchasePriceLabel;
	private JLabel rentalPriceLabel;
	private JLabel parkedPlayersLabel;
	
	public PropertyView( AbstractProperty property )
	{
		this.property = property;
		property.addObserver(this);
		
		panel = new JPanel();
		panel.setBorder( BorderFactory.createTitledBorder( property.getName() ));
		ownerLabel = new JLabel();
		purchasePriceLabel = new JLabel();
		rentalPriceLabel = new JLabel();
		parkedPlayersLabel = new JLabel();
		
		panel.add( ownerLabel );
		panel.add( purchasePriceLabel );
		panel.add( rentalPriceLabel );
		panel.add( parkedPlayersLabel );
		
		update(null,null);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if ( property.getOwner() == null )
		{
			ownerLabel.setText("");
			rentalPriceLabel.setText("");
			purchasePriceLabel.setText( "Purchase Price: " + property.getPurchasePrice() );
		}
		else
		{
			ownerLabel.setText( "Owner:" + property.getOwner().getName() );
			rentalPriceLabel.setText( "Rental Price: " + property.getRentalPrice() );
			purchasePriceLabel.setText("");
		}
		
		parkedPlayersLabel.setText( createParkedPlayersLabelString() );
	}
	
	@Override
	public JPanel getPropertyView() {
		return panel;
	}
	
	private String createParkedPlayersLabelString()
	{
		int panelWidth = panel.getWidth();
		int displayLength = 0;
		
		String result = "<html>";
		for ( AbstractPlayer player : property.getParkedPlayers() )
		{
			result += ( player.getName() + " ");
			displayLength += player.getName().length();
			
			if ( displayLength > panelWidth )
			{
				result += "<br>";
				displayLength = 0;
			}
		}
		
		result += "</html>";
		
		return result;
	}
}

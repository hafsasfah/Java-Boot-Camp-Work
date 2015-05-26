package view;
import javax.swing.*;
import model.Property;

public class PropertyView {

	JPanel panel;
	JLabel label;
	
	public PropertyView(Property property)
	{
		panel = new JPanel();
		label = new JLabel();
		if ( property.getOwner() == -1)
		{
			label.setText("<html>" + property.getTitle() + "<br>" + "</html>");
		}
	}
	
	
}

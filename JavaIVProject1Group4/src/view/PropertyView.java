package view;
import javax.swing.*;

import controller.Controller;
import model.Property;

public class PropertyView {

	JPanel panel;
	JLabel label;
	
	public PropertyView()
	{	
		Property property = Controller.getCurrentProp();
		panel = new JPanel();
		label = new JLabel();
		if ( property.getOwner() == -1)
		{
			label.setText("<html>" + property.getTitle() + "<br>" + property.getPurchasePrice() +"</html>");
		}
		else
		{
			label.setText("<html>" + property.getTitle() + "<br>" + property.getRent() +"</html>");
		}
		
	}
	
	
	
}

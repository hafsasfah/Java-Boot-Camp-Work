package view;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import controller.Controller;
import model.Property;

public class PropertyView implements Observer{

	JPanel panel;
	JLabel label;
	Property property;
	
	public PropertyView()
	{	
		
		property = Controller.getCurrentProp();
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
		
		panel.add(label);
		
	}
	public JPanel getPanel(){
		return panel;
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		property = Controller.getCurrentProp();
		
		label.setText("<html>" + property.getTitle() + "<br>" + property.getPurchasePrice() +"</html>");
		
	
		
		
	}
	
	
	
}

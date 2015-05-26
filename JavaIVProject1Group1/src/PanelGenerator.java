import javax.swing.*;


public class PanelGenerator 
{
	
	public PanelGenerator(){}

	public JFrame CreateAPanel(iProperty property)
	{
		JFrame propertyPanel = new JFrame();
		JLabel propertyName = new JLabel("Test");
		propertyName.setText(property.getName());
		propertyPanel.add(propertyName);
		
		return propertyPanel;
		
		/* Take in property from database
		 * 
		 * Create a panel 
		 * 
		 * Format based on retrieved info for each property
		 * 
		 * 
		 * Send it to the GUI
		 */
	}
	
	
}

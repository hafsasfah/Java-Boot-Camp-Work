import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Player implements iPlayer 
{
	private boolean isValid;
	private String name;
	private int cash;
	private iVehicle vehicle;
	private JLabel enterNameLabel;
	private JTextField nameTextField;
	private JButton createPlayerButton;
	private JPanel panel;
	private JLabel nameLabel;
	private JLabel cashLabel;
	
	public Player( int cash )
	{
		isValid = false;
		this.cash = cash;
		
		panel = new JPanel();
		panel.setLayout( new GridLayout(4,1));
		enterNameLabel = new JLabel("Enter the player's name");
		nameTextField = new JTextField(10);
		
		createPlayerButton = new JButton("Create Player");
		createPlayerButton.addActionListener( new PlayerSetupActionListener() );
		
		JPanel topPanel = new JPanel();
		topPanel.add(enterNameLabel);
		panel.add(topPanel);
		
		JPanel middlePanel = new JPanel();
		middlePanel.add(nameTextField);
		panel.add(middlePanel);
		
		vehicle = new Car();
		panel.add(vehicle.getPanel());
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.add(createPlayerButton);
		panel.add(bottomPanel);
		
		nameLabel = new JLabel();
		cashLabel = new JLabel();
	}

	public String getName() {
		return name;
	}

	public int getCash() {
		return cash;
	}

	public void addCash(int cash ) {
		this.cash += cash;
		updateCashLabel();
	}

	public void setVehicle(iVehicle vehicle) {
		this.vehicle = vehicle;
	}

	public iVehicle getVehicle() {
		return vehicle;
	}

	public JPanel getPanel()
	{
		return panel;
	}
	
	public boolean isReady()
	{
		return isValid;
	}
	
	private void updatePanel() 
	{
		panel.removeAll();
		nameLabel.setText(name);
		updateCashLabel();
		panel.add(nameLabel);
		panel.add(cashLabel);
		panel.add(vehicle.getPanel());
		panel.revalidate();
	}
	
	private void updateCashLabel()
	{
		cashLabel.setText("Cash: " + cash);
		panel.repaint();
	}
	
	private class PlayerSetupActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if ( vehicle.isReady() )
			{
				name = nameTextField.getText();
				
				updatePanel();
				
				isValid = true;
			}
			else
			{
				enterNameLabel.setText("Please enter a name and select a vehicle");
			}
			
		}
	}
}

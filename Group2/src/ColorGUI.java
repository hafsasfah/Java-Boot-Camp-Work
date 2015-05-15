import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class ColorGUI extends JPanel {
	public final String red = "Red          ";
	public final String white = "White";
	public final String black = "Black";
	public final String green = "Green";
	
	// Making selection Buttons
	private JRadioButton Red; 
	private JRadioButton White;
	private JRadioButton Black;
	private JRadioButton Green;
	private JRadioButton button;

	private class exitButtonListener implements ActionListener {
	      public void actionPerformed(ActionEvent e) {
	          System.exit(0);
	      }
	}
	
	private class confirmButtonListener implements ActionListener {
		Vehicle player = new Vehicle();
		public void actionPerformed(ActionEvent e) {
			if (Red.isSelected()) {
				player.setColor(red);
				//System.out.println("Red is selected");
			}
			
			else if (White.isSelected()) {
				player.setColor(white);
			}
			
			else if (Black.isSelected()) {
				player.setColor(black);
			}
			
			else if (Green.isSelected()) {
				player.setColor(green);
			}
	    }
	}
	
	public ColorGUI(){
		
		setLayout(new GridLayout(4,1));
		
		//Creating Radio buttons
		Red = new JRadioButton(red);
		White = new JRadioButton(white);
		Black = new JRadioButton(black);
		Green=new JRadioButton(green);
		
		
		// Group the radio buttons
		button=new JRadioButton();
		button.add(Red);
		button.add(White);
		button.add(Black);
		button.add(Green);
		
		JPanel buttonPanel = new JPanel();
		JButton exit = new JButton("Exit");
		JButton confirm = new JButton("Confirm");


      // Register the action listeners.
        confirm.addActionListener(new confirmButtonListener());
        exit.addActionListener(new exitButtonListener());
		
        buttonPanel.add(confirm);
        buttonPanel.add(exit);
		
		setBorder(BorderFactory.createTitledBorder("Choose a Color   "));
		
		//Add buttons to panel
		add(White);
		add(Red);
		add(Black);
		add(Green);
	
	}


}

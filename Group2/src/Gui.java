import java.awt.BorderLayout;

import javax.swing.*;

public class Gui extends JFrame {
	
	
		   private VehicleGui vehicle;   
		   private Player player1;
		   private Player player2;
		   private JPanel buttonPanel;
		   private BetGUI bet;
		   private ColorGUI color;
		   private JButton confirm;
		   private JButton exit;
		//   private Vehicle make=new Vehicle();
		//   private Player wager=new Player();

		 
		   public Gui()
		   {		   
			   setTitle("Racing Game");    
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setLayout(new BorderLayout());  	
		      
		      vehicle=new VehicleGui();
		      bet=new BetGUI();
		      color=new ColorGUI();
		      
		      buildButtonPanel();
		      
		      add(vehicle, BorderLayout.CENTER);
		      add(color,BorderLayout.EAST);
		     // add(bet,BorderLayout.EAST);
		      add(buttonPanel, BorderLayout.SOUTH);
		     

		     
		      pack();
		      setVisible(true);
		   }

	private void buildButtonPanel() {
		buttonPanel=new JPanel();
		confirm=new JButton();
		exit= new JButton();
		
		// confirm.addActionListener(new confirmButtonListener());
	     //   exit.addActionListener(new exitButtonListener());
			
	        buttonPanel.add(confirm);
	        buttonPanel.add(exit);
					
		}
	
	//private class nconfirmButtonListener implements ActionListener{
		
	//}

	public static void main(String[] agrs){
	
			new Gui();
		}


}

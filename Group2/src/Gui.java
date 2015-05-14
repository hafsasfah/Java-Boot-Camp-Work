import java.awt.BorderLayout;

import javax.swing.*;

public class Gui extends JFrame {
	
	
		   private VehicleGui vehicle;   
		   private Player player1;
		   private Player player2;
		   private JPanel buttonPanel;
		//   private Vehicle make=new Vehicle();
		//   private Player wager=new Player();

		 
		   public Gui()
		   { 
			   setTitle("Racing Game");    
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setLayout(new BorderLayout());   
		     
		      vehicle=new VehicleGui();
		      
		   
		     buildButtonPanel();
		     	      
		      
		      add(vehicle, BorderLayout.NORTH);
		      add(buttonPanel, BorderLayout.SOUTH);
		     

		     

		      setVisible(true);
		   }

	private void buildButtonPanel() {
		buttonPanel=new JPanel();
			
		}

	public static void main(String[] agrs){
	
			new Gui();
		}


}

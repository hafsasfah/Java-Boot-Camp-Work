import java.awt.BorderLayout;

import javax.swing.*;

public class Gui extends JFrame {
	
	
		   private final int WINDOW_WIDTH = 600;   
		   private final int WINDOW_HEIGHT = 500;   
		   private Player player1=new Player();
		   private Player player2=new Player();
		   private Vehicle make=new Vehicle();
		   private Player wager=new Player();

		 
		   public Gui()
		   { 
			 
			   
		   	
		      setTitle("Game");     
		      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);		     
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setLayout(new BorderLayout());   
		     
		      JButton button1 = new JButton("Player1");
		      JButton button2 = new JButton("Player2");
		      JButton button3 = new JButton("Make");
		      JButton button4 = new JButton("Model");
		      JButton button5 = new JButton("Wager");
		      
		   
		     
		      
		     	      
		      
		      add(button1, BorderLayout.NORTH);
		      add(button2, BorderLayout.SOUTH);
		      add(button3, BorderLayout.EAST);
		      add(button4, BorderLayout.WEST);
		      add(button5, BorderLayout.CENTER);

		     

		      setVisible(true);
		   }

	public static void main(String[] agrs){
	
			new Gui();
		}


}

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FlowGUI extends JFrame
{
   private final int WINDOW_WIDTH = 300;  // Window width
   private final int WINDOW_HEIGHT = 200; // Window height
   
   /**
      Constructor
   */

   public FlowGUI()
      {
	   Player p1=new Player();
	   Player p2=new Player();
      // Set the title bar text.
      setTitle("Flow Layout");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add a FlowLayout manager to the content pane.
      setLayout(new FlowLayout());

      // Create three buttons.
      JButton button1 = new JButton("Player1");
      JButton button2 = new JButton("Player2");
      JButton button3 = new JButton();

      // Add the three buttons to the content pane.
      add(button1);
      add(button2);
      add(button3);
      
      
      // Display the window.
      setVisible(true);
   }
   
   /**
      The main method creates an instance of the FlowWindow
      class, causing it to display its window.
   */
   
   public static void main(String[] args)
   {
      new FlowGUI();
   }
}
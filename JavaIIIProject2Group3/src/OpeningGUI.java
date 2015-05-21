
import javax.swing.*;


public class OpeningGUI extends JFrame {
	

	private JPanel panel;
	private JLabel messageLabel;
	private JTextField numberOfPlayers;
	private JButton createButton;
	
	public OpeningGUI()
	{
		setFrameSize(800, 600);
		// Specify what happen! when the close button i s clicked,
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Build the panel and add i t to the frame.
		buildPanel();
		
		// Add the panel to the frame's content pane.
		add(panel);
		
		// Display the window
		setVisible(true);
	}

	private void buildPanel()
	{

		messageLabel = new JLabel("How many players? ");
		
		// Create a text field 10 characters wide.
		numberOfPlayers = new JTextField(10);
		
		// Create a button with the caption "Calculate*
		createButton = new JButton("<html><button>Create</button></html>");
		
		// Create a JPanel object and let the panel
		// field reference i t.
		panel = new JPanel();
		
		// Add the label, text field, and button
		// component! to the panel.
		panel.add(messageLabel);
		panel.add(numberOfPlayers);
		panel.add(createButton);
	}
	
	public static void createCharacters()
	{
		iCharacter[] characters = new iCharacter[ numberOfPlayers ];
		
		for ( int index = 0; index < characters.length; index++ )
		{
			characters[index] = npcFactory.createCharacter();
		}
		
	}
	
	public static void main(String args[]) {
		new OpeningGUI();
    }
}
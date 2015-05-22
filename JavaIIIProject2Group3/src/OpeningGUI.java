import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

public class OpeningGUI extends JFrame {
	

	private JPanel panel;
	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JButton createButton;
	
	public OpeningGUI()
	{
		setSize(800,600);
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
		kiloTextField = new JTextField(10);
		
		// Create a button with the caption "Calculate*
		createButton = new JButton("<html><button>Calculate</button></html>");
		
		// Create a JPanel object and let the panel
		// field reference i t.
		panel = new JPanel();
		
		// Add the label, text field, and button
		// component! to the panel.
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(createButton);
	}
	
	public static void createCharacters()
	{
		PlayerCharacterFactory factory = new PlayerCharacterFactory();
		
		iCharacter[] charac = new Character[6];
		
		for(int i=0;i< charac.length ;i++){
		
			charac[i] = factory.createCharacter();
		}
		
	}
	
	public static void main(String args[]) {
		new OpeningGUI();
    }
}
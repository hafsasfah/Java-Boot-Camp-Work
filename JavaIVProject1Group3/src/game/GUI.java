package game;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;

public class GUI extends JFrame {
	
	private JPanel startPanel;
	private JLabel startLabel;
	private JTextField startField;
	private JButton startNewGameButton;
	
	public GUI()
	{
		setTitle("Monopoly");
		setSize( 1024, 1024 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLayout( new BorderLayout() );
		
		startPanel = new JPanel();
		startLabel = new JLabel("How many players?");
		startField = new JTextField(3);
		startNewGameButton = new JButton("Start Game!");
		
		startPanel.add( startLabel );
		startPanel.add( startField );
		startPanel.add( startNewGameButton );
		
		add(startPanel, BorderLayout.CENTER );
		
		setVisible(true);
	}
	
	private class startButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			
		}
	}
	public static void main(String[] args) {
		
		new GUI();

	}

}

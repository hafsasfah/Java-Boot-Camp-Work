package RacingGame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;


public class MainFrame extends JFrame {

	private DetailsPanel detailsPanel;
	
	public MainFrame(String title) 
	{
		super(title);
		
		//layout mananger
		setLayout(new BorderLayout());
		
		//swing componts
		JTextArea textArea = new JTextArea();
		
		
		detailsPanel = new DetailsPanel();
		
		//add content
		Container c = getContentPane(); 
		
		c.add(textArea, BorderLayout.CENTER);
		//c.add(button, BorderLayout.SOUTH);
		c.add(detailsPanel, BorderLayout.WEST);
		
		//add a behaivor
		
	}
}

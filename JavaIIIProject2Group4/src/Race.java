package AdventureGame;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Race extends JFrame // RACE CLASS?
{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JPanel panel;
	private AdventureGame ag;
	
	
	public Race(AdventureGame ag)
	{
		this.ag = ag;
		
		setTitle("PICK YOUR CLASS");
		
		setSize(910,315);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("MAGE");
		button1.setIcon(new ImageIcon (getClass().getResource("102.jpeg")));
		button2 = new JButton("WARRIOR");
		button2.setIcon(new ImageIcon (getClass().getResource("101.jpg")));
		button3 = new JButton("THIEF");
		button3.setIcon(new ImageIcon (getClass().getResource("100.jpeg")));
		
		button1.addActionListener(new Weapon(ag));
		button2.addActionListener(new Weapon(ag));
		button3.addActionListener(new Weapon(ag));
		
		panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		add(panel);
		
		setVisible(true);
		
	
		}
		
//public static void main(String[] args)
//	{
//	new testImage(ag);
//	new ButtonListener(ag);
//
//
//	}
	


	
}
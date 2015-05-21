package finalProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonListener extends JFrame implements ActionListener // WEAPONS CLASS?
{
	
	private JButton button1;
	private JButton button2;
	private JPanel panel;
			
	private AdventureGame ag;
	
	public ButtonListener(JFrame ag)
	{
		this.ag = (AdventureGame)ag;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand();
				
				if (actionCommand.equals("MAGE"))
				{
					
					
					setTitle("PICK YOUR WEAPON MAGE");
					setSize(330,330);
					
					button1 = new JButton("SCEPTOR");
					button1.setIcon(new ImageIcon (getClass().getResource("16.jpg")));
					 button2 = new JButton("MAGE SWORD");
					button2.setIcon(new ImageIcon (getClass().getResource("13.jpg")));
					button1.addActionListener(new ButtonListener(ag));
					button2.addActionListener(new ButtonListener(ag));
					panel = new JPanel();
					panel.add(button1);
					panel.add(button2);
					add(panel);
					setVisible(true);
					button1.addActionListener((ActionListener) new Stats(ag));
					button2.addActionListener((ActionListener) new Stats(ag));
					
					
				}
				else if (actionCommand.equals("WARRIOR"))
				{
					
					
					setTitle("PICK YOUR WEAPON WARRIOR");
					setSize(330,330);
					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					button1 = new JButton("BOW AND ARROW");
					button1.setIcon(new ImageIcon (getClass().getResource("12.jpg")));
					button2 = new JButton("LONG SWORD");
					button2.setIcon(new ImageIcon (getClass().getResource("15.jpg")));
					button1.addActionListener(new ButtonListener(ag));
					button2.addActionListener(new ButtonListener(ag));
					panel = new JPanel();
					panel.add(button1);
					panel.add(button2);
					add(panel);
					setVisible(true);
				}
				else if (actionCommand.equals("THIEF"))
				{
					//JOptionPane.showMessageDialog(null, "You clicked "+"the third button.");
					
					setTitle("PICK YOUR WEAPON THIEF");
					setSize(330,330);
					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					button1 = new JButton("PISTOL");
					button1.setIcon(new ImageIcon (getClass().getResource("17.jpg")));
					button2 = new JButton("DAGGERS");
					button2.setIcon(new ImageIcon (getClass().getResource("14.jpg")));
					button1.addActionListener(new ButtonListener(ag));
					button2.addActionListener(new ButtonListener(ag));
					panel = new JPanel();
					panel.add(button1);
					panel.add(button2);
					add(panel);
					setVisible(true);
				}
			
			
	}
//public static void main(String[] args)
//{
//	new ButtonListener();
//}

}

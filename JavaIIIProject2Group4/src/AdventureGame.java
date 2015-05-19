

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;


public class AdventureGame  extends JFrame // RENAME CLASS TO THE PLAYER CLASS?
{
	public static void main (String[] args)
	{
		
		new AdventureGame();
		
	}
	private JPanel contentPane;
	private String player1name;
	private String player2name;
	private String player3name;
	private String player4name;
	
	
	
public AdventureGame()
	{

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 806, 698);
	contentPane = new JPanel();
	contentPane.setBackground(Color.LIGHT_GRAY);
	//contentPane.setBorder(new EmptyBorder(null));
	contentPane.setLayout(null);
	setContentPane(contentPane);
	
	
	JFrame frame = new JFrame("Adventure Time!");
	setVisible(true);
	frame.setSize(1000, 700);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new GridLayout());
	frame.setLocationRelativeTo(null);
	setContentPane(contentPane);
		
	//Action Buttons
		JButton btnNewButton = new JButton("Fight!!!");
		btnNewButton.setBounds(10, 194, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(10, 228, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Run!!!");
		btnNewButton_2.setBounds(10, 262, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Rest");
		btnNewButton_3.setBounds(10, 296, 89, 23);
		contentPane.add(btnNewButton_3);
		
		//Directional Buttons
		JButton btnNewButton_4 = new JButton("â†‘");
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setBounds(680, 228, 50, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("â†�");
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setBounds(640, 262, 50, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("â†’");
		btnNewButton_6.setBackground(Color.ORANGE);
		btnNewButton_6.setBounds(718, 262, 50, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("â†“");
		btnNewButton_7.setBackground(Color.ORANGE);
		btnNewButton_7.setBounds(680, 296, 50, 23);
		contentPane.add(btnNewButton_7);
		
		/*this.player1name = JOptionPane.showInputDialog("Player 1 please enter your name.");
		this.player2name = JOptionPane.showInputDialog("Player 2 please enter your name.");
		this.player3name = JOptionPane.showInputDialog("Player 3 please enter your name.");
		this.player4name = JOptionPane.showInputDialog("Player 4 please enter your name.");*/
		
		
		//PLAYER LABELS
		JLabel lblPlayer = new JLabel("Player 1"); //Input code here to call player name
		lblPlayer.setBounds(222, 11, 46, 14);
		contentPane.add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("player 2");
		lblPlayer_1.setBounds(308, 11, 46, 14);
		contentPane.add(lblPlayer_1);
		
		JLabel lblPlayer_2 = new JLabel("player 3");
		lblPlayer_2.setBounds(401, 11, 46, 14);
		contentPane.add(lblPlayer_2);
		
		JLabel lblPlayer_3 = new JLabel("player 4");
		lblPlayer_3.setBounds(491, 11, 46, 14);
		contentPane.add(lblPlayer_3);
		
		
		//Player ICON BUTTONS
		JButton ply1 = new JButton();
		ply1.setIcon(new ImageIcon (getClass().getResource("142.jpg")));
		ply1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				new Race(AdventureGame.this);
				new Weapon(AdventureGame.this);
				new Stats(AdventureGame.this);
			}
		});
		ply1.setBounds(195, 36, 80, 78);
		contentPane.add(ply1);
		
		JButton ply2 = new JButton();
		ply2.setIcon(new ImageIcon (getClass().getResource("139.jpg")));
		ply2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				new Race(AdventureGame.this);
				new Weapon(AdventureGame.this);
				new Stats(AdventureGame.this);
			}
		});
		ply2.setBounds(288, 36, 80, 78);
		contentPane.add(ply2);
		
		JButton ply3 = new JButton();
		ply3.setIcon(new ImageIcon (getClass().getResource("138.jpeg")));
		ply3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				new Race(AdventureGame.this);
				new Weapon(AdventureGame.this);
				new Stats(AdventureGame.this);
			}
		});
		ply3.setBounds(382, 36, 80, 78);
		contentPane.add(ply3);
		
		JButton ply4 = new JButton();
		ply4.setIcon(new ImageIcon (getClass().getResource("140.jpeg")));
		ply4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				new Race(AdventureGame.this);
				new Weapon(AdventureGame.this);
				new Stats(AdventureGame.this);
			}
		});
		ply4.setBounds(475, 36, 80, 78);
		contentPane.add(ply4);
		
		List list = new List();
		list.setBounds(171, 238, 429, 264);
		contentPane.add(list);
		
		
		
		
		}
	}





package AdventureGame;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JLabel;

import java.awt.List;
import java.awt.Color;


public class test extends JFrame {
	
	private JPanel contentPane;

	
	public static void main (String[] args)
	{
		
	new test();
		
	}


	public test() 
	{	

		
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 598);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		//contentPane.setBorder(new EmptyBorder(null));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Fight!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setBounds(195, 125, 80, 92);
				contentPane.add(lblNewLabel);
			}
		});
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
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setBounds(680, 228, 50, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("â†�");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		
		//Health Bars
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBackground(Color.RED);
		progressBar_1.setBounds(171, 125, 70, 14);
		contentPane.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setBackground(Color.RED);
		progressBar_2.setBounds(254, 125, 70, 14);
		contentPane.add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setBackground(Color.RED);
		progressBar_3.setBounds(334, 125, 70, 14);
		contentPane.add(progressBar_3);
		
		
		//Player Names.... *Still working on this*
		JLabel lblPlayer = new JLabel("player 1"); //Input code here to call player name
		lblPlayer.setBounds(222, 11, 46, 14);
		contentPane.add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("player 2");
		lblPlayer_1.setBounds(312, 11, 46, 14);
		contentPane.add(lblPlayer_1);
		
		JLabel lblPlayer_2 = new JLabel("player 3");
		lblPlayer_2.setBounds(401, 11, 46, 14);
		contentPane.add(lblPlayer_2);
		
		List list = new List();
		list.setBounds(171, 238, 429, 264);
		contentPane.add(list);
		
		
		//Enemy Health Bars
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.RED);
		progressBar.setBounds(196, 456, 70, 14);
		contentPane.add(progressBar);
		
		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setBackground(Color.RED);
		progressBar_4.setBounds(386, 456, 70, 14);
		contentPane.add(progressBar_4);
		
		JProgressBar progressBar_5 = new JProgressBar();
		progressBar_5.setBackground(Color.RED);
		progressBar_5.setBounds(284, 456, 70, 14);
		contentPane.add(progressBar_5);
		
		
		
		JButton ply1 = new JButton();
		ply1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ply1.setIcon(new ImageIcon (getClass().getResource("142.jpg")));
		ply1.setBounds(195, 36, 80, 78);
		contentPane.add(ply1);
		
		JButton button = new JButton();
		button.setBounds(288, 36, 80, 78);
		contentPane.add(button);
		
		JButton button_1 = new JButton();
		button_1.setBounds(382, 36, 80, 78);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton();
		button_2.setBounds(475, 36, 80, 78);
		contentPane.add(button_2);
		
		JLabel label = new JLabel("player 3");
		label.setBounds(491, 11, 46, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(195, 125, 80, 92);
		contentPane.add(lblNewLabel);
		
	}
}

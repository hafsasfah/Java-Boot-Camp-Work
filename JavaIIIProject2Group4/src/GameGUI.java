
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JLabel;

import java.awt.List;
import java.awt.Color;


public class GameGUI extends JFrame {

	private JPanel contentPane;

	public GameGUI() 
	{		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		//contentPane.setBorder(new EmptyBorder(null));
		//JFrame f = new JFrame();
		//f.getContentPane().add(new JPanelWithBackground("sample.jpeg"));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Fight!!!");
		btnNewButton.setBounds(10, 96, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(10, 130, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Run!!!");
		btnNewButton_2.setBounds(10, 164, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Rest");
		btnNewButton_3.setBounds(10, 198, 89, 23);
		contentPane.add(btnNewButton_3);
		
		
		
		//Directional Buttons
		JButton btnNewButton_4 = new JButton("â†‘");
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setBounds(607, 116, 50, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("â†�");
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setBounds(556, 150, 50, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("â†’");
		btnNewButton_6.setBackground(Color.ORANGE);
		btnNewButton_6.setBounds(657, 150, 50, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("â†“");
		btnNewButton_7.setBackground(Color.ORANGE);
		btnNewButton_7.setBounds(607, 179, 50, 23);
		contentPane.add(btnNewButton_7);
		
		
		//Health Bars
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBackground(Color.RED);
		progressBar_1.setBounds(120, 67, 70, 14);
		contentPane.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setBackground(Color.RED);
		progressBar_2.setBounds(225, 36, 70, 14);
		contentPane.add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setBackground(Color.RED);
		progressBar_3.setBounds(326, 36, 70, 14);
		contentPane.add(progressBar_3);
		
		
		//Player Names.... *Still working on this*
		JLabel lblPlayer = new JLabel("Player 1"); //Input code here to call player name
		lblPlayer.setBounds(136, 11, 46, 14);
		contentPane.add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setBounds(237, 11, 46, 14);
		contentPane.add(lblPlayer_1);
		
		JLabel lblPlayer_2 = new JLabel("Player 3");
		lblPlayer_2.setBounds(337, 11, 46, 14);
		contentPane.add(lblPlayer_2);
		
		List list = new List();
		list.setBounds(105, 87, 429, 264);
		contentPane.add(list);
		
		
		//Enemy Health Bars
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.RED);
		progressBar.setBounds(120, 395, 70, 14);
		contentPane.add(progressBar);
		
		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setBackground(Color.RED);
		progressBar_4.setBounds(326, 395, 70, 14);
		contentPane.add(progressBar_4);
		
		JProgressBar progressBar_5 = new JProgressBar();
		progressBar_5.setBackground(Color.RED);
		progressBar_5.setBounds(225, 395, 70, 14);
		contentPane.add(progressBar_5);
		
		
		
		JButton ply1 = new JButton();
		ply1.setIcon(new ImageIcon (getClass().getResource("142.jpg")));
		ply1.setBounds(111, 33, 89, 23);
		contentPane.add(ply1);
		
	}
}

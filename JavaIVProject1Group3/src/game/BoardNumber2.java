package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BoardNumber2 extends JFrame {
	
	private JPanel TopTenSpace;
	private JPanel BottomTenSpace;
	private JPanel RightTenSpace;
	private JPanel LeftTenSpace;
	private JPanel CenterSpace;

public static void main(String[] args)
{
	new BoardNumber2();
	
	
}
	
public BoardNumber2()
	{
	
	setTitle("MONOPOLY!!");
	setVisible(true);
	setSize(1000, 700);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	
	TopTenSpace = new JPanel();
	BottomTenSpace = new JPanel();
	RightTenSpace = new JPanel();
	LeftTenSpace = new JPanel();
	CenterSpace = new JPanel();
	
	add(TopTenSpace, BorderLayout.NORTH);
	add(BottomTenSpace, BorderLayout.SOUTH);
	add(RightTenSpace, BorderLayout.EAST);
	add(LeftTenSpace, BorderLayout.WEST);
	add(CenterSpace, BorderLayout.CENTER);
	
	TopTenSpace.setLayout(new GridLayout(1,2));
	BottomTenSpace.setLayout(new GridLayout(1,2));
	RightTenSpace.setLayout(new GridLayout(0,1));
	LeftTenSpace.setLayout(new GridLayout(0,1));
	CenterSpace.setLayout(new GridLayout(0,1));
	
	JPanel TopProperty1 = new JPanel();
	TopProperty1.setBackground(Color.CYAN);
	JPanel TopProperty2 = new JPanel();
	TopProperty2.setBackground(Color.RED);
	JPanel TopProperty3 = new JPanel();
	JPanel TopProperty4 = new JPanel();
	TopProperty4.setBackground(Color.RED);
	JPanel TopProperty5 = new JPanel();
	TopProperty5.setBackground(Color.RED);
	JPanel TopProperty6 = new JPanel();
	TopProperty6.setBackground(Color.BLACK);
	JPanel TopProperty7 = new JPanel();
	TopProperty7.setBackground(Color.YELLOW);
	JPanel TopProperty8 = new JPanel();
	TopProperty8.setBackground(Color.YELLOW);
	JPanel TopProperty9 = new JPanel();
	TopProperty9.setBackground(Color.WHITE);
	JPanel TopProperty10 = new JPanel();
	TopProperty10.setBackground(Color.YELLOW);
	JPanel TopProperty11 = new JPanel();
	TopProperty11.setBackground(Color.CYAN);
	
	TopTenSpace.add(TopProperty1);
	TopTenSpace.add(TopProperty2);
	TopTenSpace.add(TopProperty3);
	TopTenSpace.add(TopProperty4);
	TopTenSpace.add(TopProperty5);
	TopTenSpace.add(TopProperty6);
	TopTenSpace.add(TopProperty7);
	TopTenSpace.add(TopProperty8);
	TopTenSpace.add(TopProperty9);
	TopTenSpace.add(TopProperty10);
	TopTenSpace.add(TopProperty11);
	
	JLabel TopProperty1Label = new JLabel("FREE PARKING");
	JLabel TopProperty2Label = new JLabel("RED");
	JLabel TopProperty3Label = new JLabel("CHANCE");
	JLabel TopProperty4Label = new JLabel("RED");
	JLabel TopProperty5Label = new JLabel("RED");
	JLabel TopProperty6Label = new JLabel("RAILROAD");
	JLabel TopProperty7Label = new JLabel("YELLOW");
	JLabel TopProperty8Label = new JLabel("YELLOW");
	JLabel TopProperty9Label = new JLabel("UTILIY");
	JLabel TopProperty10Label = new JLabel("YELLOW");
	JLabel TopProperty11Label = new JLabel("GO TO JAIL");
	
	TopProperty1.add(TopProperty1Label);
	TopProperty2.add(TopProperty2Label);
	TopProperty3.add(TopProperty3Label);
	TopProperty4.add(TopProperty4Label);
	TopProperty5.add(TopProperty5Label);
	TopProperty6.add(TopProperty6Label);
	TopProperty7.add(TopProperty7Label);
	TopProperty8.add(TopProperty8Label);
	TopProperty9.add(TopProperty9Label);
	TopProperty10.add(TopProperty10Label);
	TopProperty11.add(TopProperty11Label);
	
	JPanel BottomProperty1 = new JPanel();
	BottomProperty1.setBackground(Color.CYAN);
	JPanel BottomProperty2 = new JPanel();
	BottomProperty2.setBackground(Color.LIGHT_GRAY);
	JPanel BottomProperty3 = new JPanel();
	BottomProperty3.setBackground(Color.LIGHT_GRAY);
	JPanel BottomProperty4 = new JPanel();
	JPanel BottomProperty5 = new JPanel();
	BottomProperty5.setBackground(Color.LIGHT_GRAY);
	JPanel BottomProperty6 = new JPanel();
	BottomProperty6.setBackground(Color.BLACK);
	JPanel BottomProperty7 = new JPanel();
	JPanel BottomProperty8 = new JPanel();
	BottomProperty8.setBackground(Color.MAGENTA);
	JPanel BottomProperty9 = new JPanel();
	JPanel BottomProperty10 = new JPanel();
	BottomProperty10.setBackground(Color.MAGENTA);
	JPanel BottomProperty11 = new JPanel();
	BottomProperty11.setBackground(Color.CYAN);
	
	BottomTenSpace.add(BottomProperty1);
	BottomTenSpace.add(BottomProperty2);
	BottomTenSpace.add(BottomProperty3);
	BottomTenSpace.add(BottomProperty4);
	BottomTenSpace.add(BottomProperty5);
	BottomTenSpace.add(BottomProperty6);
	BottomTenSpace.add(BottomProperty7);
	BottomTenSpace.add(BottomProperty8);
	BottomTenSpace.add(BottomProperty9);
	BottomTenSpace.add(BottomProperty10);
	BottomTenSpace.add(BottomProperty11);
	
	JLabel BottomProperty1Label = new JLabel("JUST VISITING");
	JLabel BottomProperty2Label = new JLabel("LIGHT BLUE");
	JLabel BottomProperty3Label = new JLabel("LIGHT BLUE");
	JLabel BottomProperty4Label = new JLabel("CHANCE");
	JLabel BottomProperty5Label = new JLabel("LIGHT BLUE");
	JLabel BottomProperty6Label = new JLabel("RIALROAD");
	JLabel BottomProperty7Label = new JLabel("PAY INC TAX");
	JLabel BottomProperty8Label = new JLabel("PURPLE");
	JLabel BottomProperty9Label = new JLabel("COMMUNITY CHESS");
	JLabel BottomProperty10Label = new JLabel("PURPLE");
	JLabel BottomProperty11Label = new JLabel("GO");

	
	BottomProperty1.add(BottomProperty1Label);
	BottomProperty2.add(BottomProperty2Label);
	BottomProperty3.add(BottomProperty3Label);
	BottomProperty4.add(BottomProperty4Label);
	BottomProperty5.add(BottomProperty5Label);
	BottomProperty6.add(BottomProperty6Label);
	BottomProperty7.add(BottomProperty7Label);
	BottomProperty8.add(BottomProperty8Label);
	BottomProperty9.add(BottomProperty9Label);
	BottomProperty10.add(BottomProperty10Label);
	BottomProperty11.add(BottomProperty11Label);
	
	JPanel RightPropery1 = new JPanel();
	RightPropery1.setBackground(Color.GREEN);
	JPanel RightPropery2 = new JPanel();
	RightPropery2.setBackground(Color.GREEN);
	JPanel RightPropery3 = new JPanel();
	JPanel RightPropery4 = new JPanel();
	RightPropery4.setBackground(Color.GREEN);
	JPanel RightPropery5 = new JPanel();
	RightPropery5.setBackground(Color.BLACK);
	JPanel RightPropery6 = new JPanel();
	JPanel RightPropery7 = new JPanel();
	RightPropery7.setBackground(Color.BLUE);
	JPanel RightPropery8 = new JPanel();
	JPanel RightPropery9 = new JPanel();
	RightPropery9.setBackground(Color.BLUE);
	
	
	
	
	RightTenSpace.add(RightPropery1);
	RightTenSpace.add(RightPropery2);
	RightTenSpace.add(RightPropery3);
	RightTenSpace.add(RightPropery4);
	RightTenSpace.add(RightPropery5);
	RightTenSpace.add(RightPropery6);
	RightTenSpace.add(RightPropery7);
	RightTenSpace.add(RightPropery8);
	RightTenSpace.add(RightPropery9);
	
	
	JLabel RightProperty1Label = new JLabel("GREEN");
	JLabel RightProperty2Label = new JLabel("GREEN");
	JLabel RightProperty3Label = new JLabel("COMMUNITY CHESS");
	JLabel RightProperty4Label = new JLabel("GREEN");
	JLabel RightProperty5Label = new JLabel("RAILROAD");
	JLabel RightProperty6Label = new JLabel("CHANCE");
	JLabel RightProperty7Label = new JLabel("BLUE");
	JLabel RightProperty8Label = new JLabel("LUZ TAX");
	JLabel RightProperty9Label = new JLabel("BLUE");

	

	RightPropery1.add(RightProperty1Label);
	RightPropery2.add(RightProperty2Label);
	RightPropery3.add(RightProperty3Label);
	RightPropery4.add(RightProperty4Label);
	RightPropery5.add(RightProperty5Label);
	RightPropery6.add(RightProperty6Label);
	RightPropery7.add(RightProperty7Label);
	RightPropery8.add(RightProperty8Label);
	RightPropery9.add(RightProperty9Label);
	
	
	JPanel LeftPropery1 = new JPanel();
	LeftPropery1.setBackground(Color.ORANGE);
	JPanel LeftPropery2 = new JPanel();
	LeftPropery2.setBackground(Color.ORANGE);
	JPanel LeftPropery3 = new JPanel();
	JPanel LeftPropery4 = new JPanel();
	LeftPropery4.setBackground(Color.ORANGE);
	JPanel LeftPropery5 = new JPanel();
	LeftPropery5.setBackground(Color.BLACK);
	JPanel LeftPropery6 = new JPanel();
	LeftPropery6.setBackground(Color.PINK);
	JPanel LeftPropery7 = new JPanel();
	LeftPropery7.setBackground(Color.PINK);
	JPanel LeftPropery8 = new JPanel();
	LeftPropery8.setBackground(Color.WHITE);
	JPanel LeftPropery9 = new JPanel();
	LeftPropery9.setBackground(Color.PINK);
	
	
	LeftTenSpace.add(LeftPropery1);
	LeftTenSpace.add(LeftPropery2);
	LeftTenSpace.add(LeftPropery3);
	LeftTenSpace.add(LeftPropery4);
	LeftTenSpace.add(LeftPropery5);
	LeftTenSpace.add(LeftPropery6);
	LeftTenSpace.add(LeftPropery7);
	LeftTenSpace.add(LeftPropery8);
	LeftTenSpace.add(LeftPropery9);
	
	
	JLabel LeftProperty1Label = new JLabel("ORANGE");
	JLabel LeftProperty2Label = new JLabel("ORANGE");
	JLabel LeftProperty3Label = new JLabel("COMMUNITY CHESS");
	JLabel LeftProperty4Label = new JLabel("ORANGE");
	JLabel LeftProperty5Label = new JLabel("RAILROAD");
	JLabel LeftProperty6Label = new JLabel("PURPLE");
	JLabel LeftProperty7Label = new JLabel("PURPLE");
	JLabel LeftProperty8Label = new JLabel("UTILITY");
	JLabel LeftProperty9Label = new JLabel("PURPLE");

	
	LeftPropery1.add(LeftProperty1Label);
	LeftPropery2.add(LeftProperty2Label);
	LeftPropery3.add(LeftProperty3Label);
	LeftPropery4.add(LeftProperty4Label);
	LeftPropery5.add(LeftProperty5Label);
	LeftPropery6.add(LeftProperty6Label);
	LeftPropery7.add(LeftProperty7Label);
	LeftPropery8.add(LeftProperty8Label);
	LeftPropery9.add(LeftProperty9Label);
	
	JPanel CenterPanel = new JPanel();
	CenterSpace.add(CenterPanel);
	
	JButton roll = new JButton("ROLL");
	CenterPanel.add(roll);
	
	JTextArea textArea = new JTextArea(20,20);
	CenterPanel.add(textArea);
	CenterPanel.setLayout(new GridLayout(2,3));
	
	JPanel player1panel = new JPanel();
	CenterPanel.add(player1panel);
	JLabel ply1Label = new JLabel("Player 1 Label");
	player1panel.add(ply1Label);
	
	JPanel player2panel = new JPanel();
	CenterPanel.add(player2panel);
	JLabel ply2Label = new JLabel("Player 2 Label");
	player2panel.add(ply2Label);
	
	JPanel player3panel = new JPanel();
	CenterPanel.add(player3panel);
	JLabel ply3Label = new JLabel("Player 3 Label");
	player3panel.add(ply3Label);
	
	JPanel player4panel = new JPanel();
	CenterPanel.add(player4panel);
	JLabel ply4Label = new JLabel("Player 4 Label");
	player4panel.add(ply4Label);
	
	revalidate();
	
	
	
	
	}
	
	}
import java.awt.Color;

import javax.swing.*;
public class Game {
	
	JFrame f = new JFrame("Racing Game");
	JPanel p = new JPanel();

	
	public Game() {
		JButton confirm = new JButton("Confirm");
		
		
		f.setVisible(true);
		f.setSize(500, 300);	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setBackground(Color.blue);
		
		f.add(p);
		
	}	
	
	public static void main(String[] args) {
		new Game();
	}
}

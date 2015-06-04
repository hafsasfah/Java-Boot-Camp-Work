package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JPanel;

import logic.DiceRoll;

public class DiceView<GUI> implements IView
{
	
	DiceRoll dice; 
	
	/*
	private GUI getRollLogic()
	{
			JButton play = new JButton("Dice Roll");
			play.addActionListener(new ActionListener()
			{
				public  void actionPerformed(ActionEvent e) 
				{
					DiceView<GUI> player = new DiceView<GUI>();
					javax.swing.JOptionPane.showMessageDialog (null," rolled "+ DiceRoll.getRoll());
					
					
				}
			
				
			});
		
	}
		**/	
	
	
	
	
	
	

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JPanel getGameView() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	

}

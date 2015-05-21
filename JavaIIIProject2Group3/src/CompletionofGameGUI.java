import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;
public class CompletionofGameGUI 
{	
	
{			ImageIcon icon = null;
				try 
				{
					icon = new ImageIcon(new URL("http://cdn.visualnews.com/wp-content/uploads/2013/03/Thumbs-and-Ammo-15.jpg"));
				} 
				catch (MalformedURLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        JOptionPane.showMessageDialog(null,"" , "WINNER WINNER CHICKEN DINNER!", 
		        			JOptionPane.INFORMATION_MESSAGE, icon);
}
}	


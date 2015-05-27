

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class CornerPlatform extends PropertyManager
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7178952912306323609L;
	private String type;
	
	
	
	public CornerPlatform(){}
	
	public CornerPlatform(int n, int x, int y, String a, String t)
	{
		super(n, x, y, a);
		setBounds(x, y, 1160, 1160);
		type = t;
		
		
	}
	
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setPaint(Color.black);
		
		buildRect = new Rectangle2D.Double(0,0,0,0);
		
		g2d.draw(buildRect);
		setFont(new Font("tahoma", Font.PLAIN, 8));
		g2d.drawString(type, 4, 25);
		
		
		
		
	}
	
	
	
	
	
	

}

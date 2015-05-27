

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Street extends PropertyManager
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8240929997527619885L;
	private String name;
	private int cost;
	private Color color;

	
	
	
	public Street(int n, int x, int y, String a, String name, int cost, Color color)
	{
		super(n, x, y, a);
		this.name = name;
		this.cost = cost;
		this.color = color;
		
		setBounds(12, 20, 140, 140);
		setToolTipText(name);
	}
	
	public int getCost()
	{
		return this.cost;	
	}
	
	public void setCost(int cost)
	{
		this.cost = cost; 
	}

	public Color getColor()
	{
		
		return this.color;
		
	}
	
	
	
	public void paintComponent(Graphics g)
	{
		

		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setPaint(Color.black);
		
		buildRect = new Rectangle2D.Double(0, 0, 0, 0);
		g2d.draw(buildRect);
		setFont(new Font("tahoma", Font.PLAIN, 8));
		g2d.drawString(name, 4, 25);
		
		
		
		if(alignment.equals("Up") || alignment.equals("Down"))
		{
			buildRect = new Rectangle2D.Double(0, 0, width, height);
			
		}else if(alignment.equals("Left") || alignment.equals("Right"))
	
			buildRect = new Rectangle2D.Double(0, 0, width, height);
			g2d.draw(buildRect);
			g2d.setPaint(color);
		
		
		//Rectangle2D.Double buildRect2 = new Rectangle2D.Double(0, 1, 1, 1);
		
		if(alignment.equals("Up"))
		{
			
			buildRect = new Rectangle2D.Double();
			buildRect2 = new Rectangle2D.Double();	
		}else if(alignment.equals("Down"))
		{
			buildRect = new Rectangle2D.Double();
			buildRect2 = new Rectangle2D.Double();
		}else if(alignment.equals("Left"))
		{
			buildRect = new Rectangle2D.Double();
			buildRect2 = new Rectangle2D.Double();
			
		}else if(alignment.equals("Right"))
		{
			buildRect = new Rectangle2D.Double();
			buildRect2 = new Rectangle2D.Double();
		}
		
		g2d.setPaint(color);
		g2d.fill(buildRect);
		
		g2d.setPaint(Color.black);
		
		g2d.draw(buildRect2);
		setFont(new Font("tahoma", Font.PLAIN, 8));
		
		if(alignment.equals("Right"))
		{
			g2d.drawString(name, 22, 25);
			g2d.drawString(String.valueOf(cost), 22, 35);
			
		}else if(alignment.equals("Down"))
		{
			
			g2d.drawString(name, 10, 30);
			g2d.drawString(String.valueOf(cost), 10, 40);
			
		}else if(alignment.equals("Up"))
		{
			
			g2d.drawString(name, 4, 25);
			g2d.drawString(String.valueOf(cost), 4, 35);
		}
		
		
		
		//Include player function here if the player is not empty then set the position.....
		
		
		
		
	}
	
	
	
	
	
	
	
	

}


public class TwoDimensionalPositon implements iPosition 
{

	private iRoom room;
	private int x;
	private int y;
	
	public TwoDimensionalPositon( iRoom room, int x, int y )
	{
		this.room = room;
		this.x = x;
		this.y = y;
	}
	
	public iRoom getRoom() 
	{
		return room;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
}


public class TwoDimensionalPosition implements iPosition 
{

	private iRoom room;
	private int x;
	private int y;
	
	public TwoDimensionalPosition( int x, int y )
	{
		this( null, x, y );
	}
	
	public TwoDimensionalPosition( iRoom room, int x, int y )
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

	@Override
	public boolean equals(Object position) {
		if ( !( position instanceof TwoDimensionalPosition) )
		{
			return false;
		}
		TwoDimensionalPosition twoDimensionalPositon = (TwoDimensionalPosition)position;
		return twoDimensionalPositon.getX() == x && twoDimensionalPositon.getY() == y;
	}
}

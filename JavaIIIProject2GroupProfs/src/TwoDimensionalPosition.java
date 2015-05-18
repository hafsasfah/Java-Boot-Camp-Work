
public class TwoDimensionalPosition implements IPosition 
{

	private IRoom room;
	private int x;
	private int y;
	
	public TwoDimensionalPosition( int x, int y )
	{
		this( null, x, y );
	}
	
	public TwoDimensionalPosition( IRoom room, int x, int y )
	{
		this.room = room;
		this.x = x;
		this.y = y;
	}
	
	public IRoom getRoom() 
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

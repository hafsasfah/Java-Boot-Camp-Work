
	public class Position implements iPosition 
	{

		private iRoom room;
		private int x;
		private int y;
		
		public Position( int x, int y )
		{
			this( null, x, y );
		}
		
		public Position( iRoom room, int x, int y )
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
			if ( !( position instanceof Position) )
			{
				return false;
			}
			Position Positon = (Position)position;
			return Positon.getX() == x && Positon.getY() == y;
		}
	}


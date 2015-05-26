package data;

public class Coordinates 
{
	
	int row;
	int column;
	
	public Coordinates(){}
	
	public Coordinates(int x, int y)
	{
		this.row = x; 
		this.column  = y;
	}
	
	public int getRow() {return row;}
	
	public int getColumn() {return column;}
	
	public void setColumn(int column)
	{
		this.column = column;
	}
	public void setRow(int row)
	{
		this.row = row;
	}
	
}

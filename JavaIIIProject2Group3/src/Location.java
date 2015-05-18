
public class Location {
	int xCoordinate;
	int yCoordinate;
	public Location(){
		this.xCoordinate=0;
		this.yCoordinate=0;
				
	}
	public int[] getLocation(){
		int[] result =  {this.xCoordinate,this.yCoordinate};
		return result;
	}
	
	
	public void moveUp() {
		 this.yCoordinate -= 1 ;
	
	}
	public void moveDown() {
		 this.yCoordinate += 1 ;
	
	}
	public void moveLeft() {
		this.xCoordinate -= 1 ;
	}
	
	
	public void moveRight() {
		this.xCoordinate += 1 ;
	}
	public String toString(){
		return  this.xCoordinate +","+this.yCoordinate;
	}

}

package models;



public class Board {
	
	
	
	public static void main(String[] args)
	{
		int[][] boardArray = new int [10][10];
		
		for (int xPos = 0; xPos < 10; xPos++)
		{
			
		    for (int yPos = 0; yPos < 10; yPos++)
		    {
		    	System.out.print(xPos + "," + yPos + " ");
		    }   
		    
		    System.out.println("");
		}
		
		for (int xPos = 0; xPos < 10; xPos++)
		{
			
		    for (int yPos = 0; yPos < 10; yPos++)
		    {
		    	if(xPos == 0 && yPos <= 9)
		    		System.out.print("x");
		    	
		    	if(xPos == 9 && yPos <= 9)
		    		System.out.print("x");
		    	
		    	if(yPos == 0 && yPos <= 9)
		    		System.out.print("x");		    	
		    }   
		    
		    System.out.println("");
		}
	}
	
	public static void move()
	{
		
	}
}

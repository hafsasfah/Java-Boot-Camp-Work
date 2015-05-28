package models;

import javax.swing.*;

import models.Property;

public class Board {
	
	static JPanel boardPanel;
	
	public static void main(String[] args)
	{
	 byte gridLayout[][]  =  {{1,1,1,1,1,1,1,1,1,1,1}, 
							  {1,0,0,0,0,0,0,0,0,0,1}, 
							  {1,0,0,0,0,0,0,0,0,0,1},
							  {1,0,0,0,0,0,0,0,0,0,1},
							  {1,0,0,0,0,0,0,0,0,0,1},
							  {1,0,0,0,0,0,0,0,0,0,1},
							  {1,0,0,0,0,0,0,0,0,0,1},
							  {1,1,1,1,1,1,1,1,1,1,1}};
	
		int[][] boardArray = new int [11][8];
		
		
		/*
		for (int xPos = 0; xPos < 10; xPos++)
		{
			
		    for (int yPos = 0; yPos < 10; yPos++)
		    {
		    	if(xPos == 0 && yPos <= 9)
		    		System.out.print("a");
		    	
		    	if(xPos == 9 && yPos <= 9)
		    		System.out.print("b");
		    	
		    	if(yPos == 0 && yPos <= 9)
		    		System.out.print("c");
		    	
		    	if(yPos == 9 && yPos <= 9)
		    		System.out.print("d");
		    }   
		    
		    System.out.println("");
		}
		*/
		
	}
	
	public static JPanel getBoard()
	{
		return boardPanel;
	}
	public static void move()
	{
		
	}
}

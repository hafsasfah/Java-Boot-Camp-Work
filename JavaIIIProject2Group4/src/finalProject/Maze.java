package finalProject;
import java.util.Random;

public class Maze  {

	

 

	static Random r =  new Random();
	static Random r2 = new Random();
	static Random r3 = new Random();
	static Random r4 = new Random();
	
	
		
	
		    	  
	static int north = r.nextInt(6)+1;
	static int south  = r2.nextInt(6)+1; 
	static int east  = r3.nextInt(6)+1;
	static int west   = r4.nextInt(6)+1;
	
	public static void main(String args[])
	  //test 
	{
		System.out.println("Dice rolled!!! \n"
	      		+ "\nNorth  "+north+"\n"+"South "+south+"\n"+"East  "+east+"\n"+"West "+west+"\n");
	  
	     //end test 
	      switch (north) {
		     case 1: 
		    	 System.out.println("2 Orcs and a Dragon are in this room!");
		    	 
		    	 			break;
	
	      		}
		    
			
		  
		  
	
		     case 5:  
		    	 System.out.println("5 Orcs and 1 wolf are in this room!");
			 				break;
		     case 6: 
		    	 System.out.println("3 Orcs, A wolf, and 3 Dragons are in this room!");
			 				break;
			}
	      
	      switch (south) {
		     case 1: 
		    	 System.out.println("2 Orcs and a Dragon are in this room!");
		    	 
		    	 			break;
		     case 2:   
		    	 System.out.println("An Orc, A Dragons and 5 wolves are in this room!");
			 				break;
		     case 3:  
		    	 System.out.println("An Orc and 6 Dragons are in this room!");
			 				break;
		     case 4: 
		    	 System.out.println ("9 Orcs and 2 Dragons are in this room!");
			 				break;
		     case 5:  
		    	 System.out.println("5 Orcs and 1 wolf are in this room!");
			 				break;
		     case 6: 
		    	 System.out.println("3 Orcs, 2 wolves and 3 Dragons are in this room!");
			 				break;
			 }
	      
	      
	      switch (east) {
		     case 1: 
		    	 System.out.println("2 Orcs and a Dragon are in this room!");
		    	 
		    	 			break;
		     case 2:   
		    	 System.out.println("An Orc,2 Dragons and 5 wolves are in this room!");
			 				break;
		     case 3:  
		    	 System.out.println("An Orc and 6 Dragons are in this room!");
			 				break;
		     case 4: 
		    	 System.out.println ("9 Orcs and 2 Dragons are in this room!");
			 				break;
		     case 5:  
		    	 System.out.println("5 Orcs and 1 wolf are in this room!");
			 				break;
		     case 6: 
		    	 System.out.println("3 Orcs, 2 wolves and 3 Dragons are in this room!");
			 				break;
			 }
	      
	      
	      
	      switch (west) {
		     case 1: 
		    	 System.out.println("2 Orcs and a Dragon are in this room!");
		    	 
		    	 			break;
		     case 2:   
		    	 System.out.println("An Orc,2 Dragons and 5 wolves are in this room!");
			 				break;
		     case 3:  
		    	 System.out.println("An Orc and 6 Dragons are in this room!");
			 				break;
		     case 4: 
		    	 System.out.println ("9 Orcs and 2 Dragons are in this room!");
			 				break;
		     case 5:  
		    	 System.out.println("5 Orcs and 1 wolf are in this room!");
			 				break;
		     case 6: 
		    	 System.out.println("3 Orcs, 2 wolves and 3 Dragons are in this room!");
			 				break;
	      	}
	      
	      
	 }	
	
	    
	    
	    
	}//end public class
		
}//end main
}

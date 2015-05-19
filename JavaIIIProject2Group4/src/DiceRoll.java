import java.util.Random;

public class DiceRoll {

	static Random r =  new Random();
	static Random r2 = new Random();
	static Random r3 = new Random();
	static Random r4 = new Random();
	
	static int roll1 = r.nextInt(6)+1;
	static int roll2  = r2.nextInt(6)+1; 
	static int roll3  = r3.nextInt(6)+1;
	static int roll4   = r4.nextInt(6)+1;
	
	public static void main(String args[])
	  //test 
	{
		System.out.println("Dice rolled!!! \n"
	      		+ "\nFirst Roll  "+roll1+"\n"+"Second Roll "+roll2+"\n"+"Third Roll  "+roll3+"\n"+"Fourth Roll "+roll4+"\n");
	  
	     //end test 
	      switch (roll1) {
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
		    	 System.out.println("3 Orcs, A wolf, and 3 Dragons are in this room!");
			 				break;
			}
	      
	      switch (roll2) {
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
	      
	      
	      switch (roll3) {
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
	      
	      
	      
	      switch (roll4) {
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
	
}


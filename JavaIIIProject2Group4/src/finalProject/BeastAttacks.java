package finalProject;
import java.util.Random;

public class BeastAttacks {

	static Random r =  new Random();
	static Random r2 = new Random();
	static Random r3 = new Random();
	static Random r4 = new Random();
	
	static int north = r.nextInt(6)+1;
	static int south  = r2.nextInt(6)+1; 
	static int east  = r3.nextInt(6)+1;
	static int west   = r4.nextInt(6)+1;

	
	//public static void main(String args[])
	  //test 
	{
		System.out.println("Attack!!! \n"
	      		+ "\nYou have entered a creepy room  "+north+"\n"+"You have entered a dungeon "+south+"\n"+
				"You have entered a kitchen "+east+"\n" +"You have entered a dark forrest "+east+"\n");
	  
	     //end test 
	      switch (north) {
		     case 1: 
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
		    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life \n");
		    	 
		    	 			break;
		     case 2:   
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life\n ");
		    	 			break;
		     case 3:  
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life \n");
		    	 			break;
		     case 4: 
		    	 System.out.println("Player 1 got bit by an Orc, Player 2 was scratched by a Wolf, "
			    	 		+ "player 3 Slayed an Dragon, Player 4 Allied with a friendly Orc\n ");
		    	 			break;
		     case 5:  
		    	 System.out.println("Player 1 pretended to fight an Orc while, Player 2 did all of the work, "
			    	 		+ "player 3 Slayed a Wolf, Player 4 Ran off to get help\n ");
		    	 			break;
		    	 			
		     case 6: 
		    	 System.out.println("Player 1 dissentigrated by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed 2 Orcs, Player 4 was hit by an Orc arrow\n ");
		    	 			break;
			}
	      
	      switch (south) {
	      case 1: 
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
		    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life \n");
		    	 
		    	 			break;
		     case 2:   
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life\n ");
		    	 			break;
		     case 3:  
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life \n");
		    	 			break;
		     case 4: 
		    	 System.out.println("Player 1 got bit by an Orc, Player 2 was scratched by a Wolf, "
			    	 		+ "player 3 Slayed an Dragon, Player 4 Allied with a friendly Orc\n ");
		    	 			break;
		     case 5:  
		    	 System.out.println("Player 1 pretended to fight an Orc while, Player 2 did all of the work, "
			    	 		+ "player 3 Slayed a Wolf, Player 4 Ran off to get help\n ");
		    	 			break;
		    	 			
		     case 6: 
		    	 System.out.println("Player 1 dissentigrated by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed 2 Orcs, Player 4 was hit by an Orc arrow\n ");
		    	 			break;
			 }
	      
	      
	      switch (east) {
	      case 1: 
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
		    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life \n");
		    	 
		    	 			break;
		     case 2:   
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life\n ");
		    	 			break;
		     case 3:  
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life \n");
		    	 			break;
		     case 4: 
		    	 System.out.println("Player 1 got bit by an Orc, Player 2 was scratched by a Wolf, "
			    	 		+ "player 3 Slayed an Dragon, Player 4 Allied with a friendly Orc\n ");
		    	 			break;
		     case 5:  
		    	 System.out.println("Player 1 pretended to fight an Orc while, Player 2 did all of the work, "
			    	 		+ "player 3 Slayed a Wolf, Player 4 Ran off to get help\n ");
		    	 			break;
		    	 			
		     case 6: 
		    	 System.out.println("Player 1 dissentigrated by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed 2 Orcs, Player 4 was hit by an Orc arrow\n ");
		    	 			break;
			 }
	      
	      switch (west) {
	      case 1: 
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
		    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life \n");
		    	 
		    	 			break;
		     case 2:   
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life\n ");
		    	 			break;
		     case 3:  
		    	 System.out.println("Player 1 got burned by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed an Orc, Player 4 Ran for their life \n");
		    	 			break;
		     case 4: 
		    	 System.out.println("Player 1 got bit by an Orc, Player 2 was scratched by a Wolf, "
			    	 		+ "player 3 Slayed an Dragon, Player 4 Allied with a friendly Orc\n ");
		    	 			break;
		     case 5:  
		    	 System.out.println("Player 1 pretended to fight an Orc while, Player 2 did all of the work, "
			    	 		+ "player 3 Slayed a Wolf, Player 4 Ran off to get help\n ");
		    	 			break;
		    	 			
		     case 6: 
		    	 System.out.println("Player 1 dissentigrated by Dragon Fire, Player 2 Ran for their life, "
			    	 		+ "player 3 Slayed 2 Orcs, Player 4 was hit by an Orc arrow\n ");
		    	 			break;
			 }
	      
	}
	
}
	      
	     
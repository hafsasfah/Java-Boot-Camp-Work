package views;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import jdk.nashorn.internal.runtime.Property;




public class PropertyView<GameController> implements Observer 
{
	public  GameController player;
	 
	
	
	   public static void main(String[] args) {
		   // creates watched and watcher objects
		   String watched = ("Original Value");
		   }	
		   
		   public void update(Observable obj, Object arg) {
		   System.out.println("Update Property "+arg);
		   }
		}



				
				   
	   
	   
	   

	

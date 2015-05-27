package models;
import java.util.Observable;
import java.util.Observer;


public class ViewProperty implements Observer {
	   public static void main(String[] args) {
		   // creates watched and watcher objects
		   Property watched = new Property("Original Value");
		 
		   }
		   
		   public void update(Observable obj, Object arg) {
		   System.out.println("Update Property "+arg);
		   }
		}

class Property extends Observable {
	   private String watchedValue;
	   
	   public Property(String value) {
	   watchedValue = value;
	   
	   }
	   
	   
}
	

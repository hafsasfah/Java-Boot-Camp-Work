package RacingGame;

import java.util.Random;

public class Car implements iVehicle
{

	private String make;
	private String model;
	private String color;
	Random random = new Random();
	
	
	public double getOuaterMileTime() 
	{
		return random.nextDouble();
	}
	
	
	public String getMake() 
	{
		return make;
	}
	
	
	public String getModel() 
	{
		return model;
	}
	
	public String toString()
	{
		return null ;
	}
	
	public String getColor()
	{
		return color;
	}
	
}

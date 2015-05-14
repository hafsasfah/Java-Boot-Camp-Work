package RacingGame;

import java.util.Random;

public class Car implements iVehicle
{

	private String make;
	private String model;
	Random random = new Random();
	
	@Override
	public double getOuarterMileTime() 
	{
		return random.nextDouble();
	}
	
	@Override
	public String getMake() 
	{
		return null;
	}
	
	@Override
	public String getModel() 
	{
		return null;
	}
	
	public String toString()
	{
		return null ;
	}
}

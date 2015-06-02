package random;

import java.util.Random;

public class RandomNumberPicker {
	
	public static int randomNumber()
	{
		Random random = new Random();
		return random.nextInt(59) + 1;
	}
}

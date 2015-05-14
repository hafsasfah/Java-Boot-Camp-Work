import java.util.Random;


public class CarClass {

	private String Model;
	public CarClass()
	{
		
	}
	
	public static int makeRandom()
	{
		
	Random rand = new Random();
	return rand.nextInt((5 - 1) +1);
	
	}
		Random random = new Random (10);
		public String getModel() {
			return Model;
		}

		public void setModel(String model) {
			Model = model;
		}

		public Random getRandom() {
			return random;
		}

		public void setRandom(Random random) {
			this.random = random;
		}
		
	
		
		
	}



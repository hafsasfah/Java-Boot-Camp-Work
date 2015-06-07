package AdventureGameClass;

import java.util.Random;

import AdventureGameInterface.iDie;


public class Die implements iDie {

	Random rand = new Random();
    int dice;
    
    //Fixed Dice roll hopefully
    /*Rolls a 2, 4, 6, 8, and 12 Sided Die*/
    public int rollDieAmountOfTimes(int roller)
    {
    	int ranNum = rand.nextInt();
    	if(roller == 0)
    		return 1;
    	else
    		return ranNum + rollDieAmountOfTimes(roller - 1);		
    }
    //Two Sided Roll
    public int TwoSideRollDie()
    {
	int roll2 = rand.nextInt(2) +1;
		return roll2;
	}
    //Four Sided Roll
    public int FourSideRollDie()
    {
		int roll4 = rand.nextInt(4) +1;
		return roll4;
		}

    //Six Sided Roll
	public int SixSideRollDie() 	
	{
		int roll6 = rand.nextInt(6) +1;
		return roll6;
	}
	
	//Eight Sided Roll
	public int EightSideRollDie() 
	{
		int roll8 = rand.nextInt(15) +1;
		return roll8;
	}
	//12 Sided Roll
	public  int TwelveSideRollDie() 
	{
		int roll12 = rand.nextInt(12) +1;
		return roll12;
	}

	public int monsterDie() {
		
		int roll = rand.nextInt(3) +1;
		int rollpoint = rand.nextInt(6) +1;
		int monsterStat = roll * rollpoint;
		return monsterStat;
	}
	}

	
	
	
	
	
	
	
	
	

